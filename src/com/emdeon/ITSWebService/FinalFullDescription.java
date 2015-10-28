package com.emdeon.ITSWebService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinalFullDescription {
    public static void main(String[] args) {
        FullDescription fullDescriptin1=new FullDescription();
        fullDescriptin1.setEligibilityStatusInfo("DEDICTABLE");
        fullDescriptin1.setCoverageCode("IND");
        fullDescriptin1.setNetworkMode("Y");
        fullDescriptin1.setPlan("ANNUAL");
        FullDescription fullDescriptin2=new FullDescription();
        fullDescriptin2.setEligibilityStatusInfo("OUTOFPOCKATE");
        fullDescriptin2.setCoverageCode("IND");
        fullDescriptin2.setNetworkMode("Y");
        fullDescriptin2.setPlan("ANNUAL");
        FullDescription fullDescriptin3=new FullDescription();
        fullDescriptin3.setEligibilityStatusInfo("DEDICTABLE");
        fullDescriptin3.setCoverageCode("FAMMILY");
        fullDescriptin3.setNetworkMode("N");
        fullDescriptin3.setPlan("REMAINING");
        FullDescription fullDescriptin4=new FullDescription();
        fullDescriptin4.setEligibilityStatusInfo("OUTOFPOCKATE");
        fullDescriptin4.setCoverageCode("FAMMILY");
        fullDescriptin4.setNetworkMode("N");
        fullDescriptin4.setPlan("REMAINING");
        List<FullDescription> fullDescriptions=new ArrayList<FullDescription>();
        fullDescriptions.add(fullDescriptin1);
        fullDescriptions.add(fullDescriptin3);
        fullDescriptions.add(fullDescriptin2);
        fullDescriptions.add(fullDescriptin4);
        System.out.println(fullDescriptions);
        
        
        Map<String , Map<String ,List<FullDescription>>> mainMap=new HashMap<String , Map<String ,List<FullDescription>>>();
        List<FullDescription> fullDescriptionDedictable=new ArrayList<FullDescription>();
        List<FullDescription> fullDescriptionIndFamily=new ArrayList<FullDescription>();
        for(FullDescription mainFullDescription:fullDescriptions){
            if(mainFullDescription.getEligibilityStatusInfo().equals("DEDICTABLE")){
                fullDescriptionDedictable.add(mainFullDescription);
            }
            
        }
        for(FullDescription finalList:fullDescriptionDedictable){
            if(finalList.coverageCode.equals("IND")){
                fullDescriptionIndFamily.add(finalList);
            }
        }
        System.out.println(fullDescriptionDedictable);
    }
}
