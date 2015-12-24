package com.comparable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
       Employee emp[]=new Employee[3];
       emp[0]=new Employee(1, "Mukesh");
       emp[1]=new Employee(4, "Rejesh");
       emp[2]=new Employee(3, "Yesendra");
       Arrays.sort(emp);
       for(Employee em:emp){
           System.out.println("EmpId : "+em.empId +" "+"Emp Name :"+em.empName);
       }
    }
}
class Employee implements Comparable<Employee>{
    int empId;
    String empName;
    public Employee(int empId , String empName1) {
        this.empId=empId;
        this.empName=empName1;
    }
    @Override
    public int compareTo(Employee emp) {
        return this.empName.compareTo(emp.empName);
    }
}
