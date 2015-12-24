package com.generics.uperbound;

public class Other {
    int OId;
    String OName;
    
    public Other(){
        System.out.println("default const");
    }
    public Other(int OId, String OName){
        this.OId=OId;
        this.OName=OName;
    }
    public int getOId() {
        return OId;
    }
    public void setOId(int oId) {
        OId = oId;
    }
    public String getOName() {
        return OName;
    }
    public void setOName(String oName) {
        OName = oName;
    }
    
    
}
