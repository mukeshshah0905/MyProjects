package main;

public class MethodOverriding {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.show());
    }
}
class Super{
    public static int show() {
        return 1;
    }
    
}
class Sub extends Super{
    public static int show() {
        return 2;
    }
    
}