package main.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeSerializationDemo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmpId(1);
        e1.setEmpName("Mukesh");
        e1.setSalary(10000);
        try {
            SerializationUtility.serialization(e1, "employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
           Object obj= SerializationUtility.deSerialization( "employee.ser");
          if(obj instanceof Employee){
              System.out.println(((Employee) obj).getEmpId());
              System.out.println(((Employee) obj).getEmpName());
              System.out.println(((Employee) obj).getSalary());
          }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int empId;
    private String empName;
    private transient int salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}

class SerializationUtility {

    //de-serialize the object
    public static Object deSerialization(String fileName) throws IOException ,ClassNotFoundException{
        FileInputStream fis=new FileInputStream(fileName);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();
        fis.close();
        return obj;
    }

    // serialize object
    public static void serialization(Object obj, String fileName) throws IOException {
        FileOutputStream fos=new FileOutputStream(fileName);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();
    }
}