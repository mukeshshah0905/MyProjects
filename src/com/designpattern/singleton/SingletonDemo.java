package com.designpattern.singleton;

public class SingletonDemo {
 public static void main(String[] args) {
    Student s1=Student.getStudent();
    Student s2=Student.getStudent();
    //Student s3=new Student();
    System.out.println(s1.rollNumber);
    System.out.println(s2.rollNumber);
    System.out.println(s1==s2);
}
}
class Student{
    int rollNumber=10;;
    String Name="Mukesh";
    
    private static Student student=new Student();
    public static Student getStudent(){
        return student;
    }
   
    private Student(){
        
    }
    
}