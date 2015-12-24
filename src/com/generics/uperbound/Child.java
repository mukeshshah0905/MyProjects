package com.generics.uperbound;

public class Child  extends Parent{
    @Override
    public String toString() {
        return "Child [cId=" + cId + ", cName=" + cName + "]";
    }
     int cId;
     String cName;
    
    public Child(){
        System.out.println("default const");
    }
    public Child(int cId, String cName){
        this.cId=cId;
        this.cName=cName;
    }
    public int getcId() {
        return cId;
    }
    public void setcId(int cId) {
        this.cId = cId;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    
    
}
