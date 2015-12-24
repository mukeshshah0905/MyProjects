package com.generics.uperbound;

public class Parent {
    int pId;
    String pName;
    
    public Parent(){
        System.out.println("default const");
    }
    public Parent(int pId, String pName){
        this.pId=pId;
        this.pName=pName;
    }
    public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    
}
