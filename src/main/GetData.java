package com.edi835.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edi835.dao.IRemittanceDao;
import com.edi835.json.entities.E_remittance;
import com.edi835.json.entities.E_remittance_advice_batch;
import com.edi835.json.entities.E_remittance_file;
import com.edi835.json.entities.E_remittance_transaction_information;
import com.edi835.json.entities.E_remittances_files;
import com.edi835.json.entities.General_remittances_information;
import com.edi835.normalized.entities.FinancialInfoEntity;
import com.google.gson.Gson;

public class GetData {
    public static ApplicationContext apptContext;
    @Autowired
    IRemittanceDao remittanceDao;

    public void process() {
        List<FinancialInfoEntity> bprList = remittanceDao.getFinancialInfoEntities();
        int rowIndex = 1;
        String path = "C://Users//mukeshs//Desktop//EDIDataExcel//remittanceInfoNON.xlsx";
        // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();
        Sheet remittanceSheet = workbook.createSheet("remittanceInoNON");

        for (FinancialInfoEntity bpr : bprList) {
            if (bpr.getJsonstring() == null || bpr.getJsonstring().trim().isEmpty()) {
                continue;
            } else {
                String json = bpr.getJsonstring();
                ObjectMapper om = new ObjectMapper();
                try {
                    E_remittance_advice_batch er = om.readValue(json, E_remittance_advice_batch.class);

                    for (E_remittance_file e_remittances_file : er.getE_remittance_advice_batch().getE_remittance_files()) {
                        for (E_remittance e_remittance : e_remittances_file.getGeneral_remittances_information().getE_remittances()) {
                            
                            Row row = remittanceSheet.createRow(rowIndex++);
                            int cellIndex = 0;
                            // first place in row is name
                            row.createCell(cellIndex++).setCellValue(e_remittance.getPayer_name());

                            // second place in row is marks in maths
                            row.createCell(cellIndex++).setCellValue(e_remittance.getCheck_amount());
                            
                            row.createCell(cellIndex++).setCellValue(new SimpleDateFormat("MM / dd / yyyy").format(e_remittance.getCheck_date()));
                            // third place in row is marks in Science
                            row.createCell(cellIndex++).setCellValue(e_remittance.getCheck_number());
                            String clm="";
                            for(E_remittance_transaction_information erti:e_remittance.getE_remittance_transactions_information()){
                                clm=clm+erti.getE_remittance_transactions().getClaim_number()+";";
                            }
                            row.createCell(cellIndex++).setCellValue(clm);
                            
                        }

                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        // write this workbook in excel file.
        try {
            FileOutputStream fos = new FileOutputStream(path);
            workbook.write(fos);
            fos.close();

            System.out.println(path + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        apptContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetData gd = (GetData) apptContext.getBean("getData");
        gd.process();
    }
}
