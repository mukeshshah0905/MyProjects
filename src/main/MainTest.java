package main;

public class MainTest {
  public final synchronized strictfp static void main(String[] args) {
   /* int a[]={2,2,3,3,7,9};
    int result=a[0]^a[1]^a[2]^a[3]^a[4]^a[5];
    System.out.println(result);*/
      parent p=new parent();
      p.m1();
      child ch=new child();
      ch.m1();
      parent p1=new child();
      p1.m1();
}
}
class parent{
    static int i=10;
    public  void m1(){
        System.out.println("parent");
    }
}
class child extends parent{
    static int i=12;
    public  void m1(){
        System.out.println("child");
    }
}