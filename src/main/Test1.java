package main;


interface I1 {
    int a = 10;

    void m1();
}

interface I2 {
    int b = 10;

    void m2();
}

interface I3 extends I1, I2 {
    int X = 88;

    void m3();
}

interface I4 {
    int c = 10;

    void m4();
}

interface I5 {
    int d = 10;

    void m5();
}

interface I6 extends I4, I5 {
    int X = 99;

    void m6();
}

public class Test1 implements I3, I6 {
    public static void main(String[] args) {
        I3 i3=null;
        I6 i6=null;
        i3=new Test1();
        i6=new Test1();
        System.out.println(i3.a);
        System.out.println(i3.b);
        System.out.println(i3.X);
        i3.m1();
        i3.m2();
        i3.m3();
        System.out.println(i6.c);
        System.out.println(i6.d);
        System.out.println(i6.X);
        i6.m4();
        i6.m5();
        i6.m6();
    }

    @Override
    public void m1() {
        System.out.println("m1");

    }

    @Override
    public void m2() {
        System.out.println("m2");

    }

    @Override
    public void m4() {
        System.out.println("m4");

    }

    @Override
    public void m5() {
        System.out.println("m5");
    }

    @Override
    public void m6() {
        System.out.println("m6");

    }

    @Override
    public void m3() {
        System.out.println("m3");

    }
}
