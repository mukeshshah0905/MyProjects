package com.singletonpattern;

public class SingletonPattern  implements Cloneable{
    public static void main(String[] args) {
        Employee e1=Employee.getEmployee();
        Employee e2=Employee.getEmployee();
        System.out.println(e1==e2);
    }
}

class Employee {
    
    private int empId=10;
    private String empName="Mukesh";

    private static Employee employee = new Employee();

    private Employee() {

    }

    public static Employee getEmployee() {
        return employee;
    }
}