package com.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Employee emp[]=new Employee[3];
        emp[0]=new Employee(3,"Mukesh");
        emp[1]=new Employee(5,"Rajesh");
        emp[2]=new Employee(1,"Deep");
        Arrays.sort(emp,new EmpNameComparator());
        for(Employee em:emp){
            System.out.println("EmpId : "+em.empId +" "+"Emp Name :"+em.empName);
        }
    }
}

class Employee {
    int empId;
    String empName;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

class EmpNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp2.empName.compareTo(emp1.empName);
    }

}