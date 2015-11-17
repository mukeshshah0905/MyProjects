package com.comparable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        Employee emp[]=new Employee[3];
        emp[0]=new Employee(3,"Mukesh");
        emp[1]=new Employee(5,"Rajesh");
        emp[2]=new Employee(1,"Deep");
        Arrays.sort(emp);
        for(Employee em:emp){
            System.out.println("EmpId : "+em.empId +" "+"Emp Name :"+em.empName);
        }
    }
}
class Employee implements Comparable<Employee>{
    
    int empId;
    String empName;
    
    public Employee() {
        // TODO Auto-generated constructor stub
    } 
    Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }
    
    @Override
    public int compareTo(Employee emp) {
        return emp.empName.compareTo(this.empName);
    }
    
}
