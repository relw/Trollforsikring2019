package model;

import java.io.Serializable;

public class baatforsikring extends forsikringer implements Serializable{
    private String eier, båttype, regnummer, lengdeAntallFot, årsmodell; 
    
    public baatforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String inneier, String innbåttype, String innmotortype, String innregnummer, String innlengde, String innårsmodell)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop);
     this.eier = inneier; 
     this.båttype = innbåttype; 
     this.regnummer = innregnummer;
     this.lengdeAntallFot = innlengde; 
     this.årsmodell = innårsmodell; 
   } 
    public String getEier(){
        return eier; 
    }
    public String getBåttype(){
        return båttype; 
    }
    public String getRegnummer(){
        return regnummer; 
    }
    public String getAntallFot(){
        return lengdeAntallFot; 
    }
    public String getÅrsmodell(){
        return årsmodell; 
    }
}
