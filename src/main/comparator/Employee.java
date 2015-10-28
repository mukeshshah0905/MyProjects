package main.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    int empId;
    String empName;
    
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public static void main(String[] args) {
        Employee emp[]=new Employee[3];
        emp[0]=new Employee();
        emp[0].setEmpId(12);
        emp[0].setEmpName("Jiten");
        emp[1]=new Employee();
        emp[1].setEmpId(15);
        emp[1].setEmpName("Rajesh");
        emp[2]=new Employee();
        emp[2].setEmpId(11);
        emp[2].setEmpName("Mukesh");
        Arrays.sort(emp, new EmpIDComparator());

        for(int i=0;i<emp.length;i++){
            System.out.println("EmpID :"+emp[i].getEmpId() +"\n"+"EmpName:"+emp[i].getEmpName());
        }
    }
}
class EmpIDComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.empId-e2.empId;
    }
    
}