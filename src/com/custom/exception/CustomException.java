package com.custom.exception;

public class CustomException {
    public static void main(String[] args) {
        try{
            testException(null);
        }catch(MyException me){
            me.printStackTrace();
        }
    }
    public static void testException(String string) /*throws MyException*/ {
        /*if(string==null){
            throw new MyException("the string is null");
         }*/
       /* if(string==null){
            throw new MyException(new NullPointerException());
         }*/
        if(string==null){
           throw new MyException("the string is null",new NullPointerException());
        }
    }
}
class MyException extends /*Exception*/RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public MyException() {
        // TODO Auto-generated constructor stub
    }
    public MyException(String message) {
        super(message);
    }
    public MyException(Throwable cause) {
        super(cause);
    }
    public MyException(String message,Throwable cause) {
        super(message , cause);
    }
}