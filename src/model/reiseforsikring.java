package model;

import java.io.Serializable;

public class reiseforsikring extends forsikringer implements Serializable{
   private String forsikringsområde;
   private String forsikringssum;  
    
   public reiseforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String innforsikringsområde, String innforsikringssum)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop);
     this.forsikringsområde = innforsikringsområde;
     this.forsikringssum = innforsikringssum; 
   } 
   public String getForsikringsområde(){
       return forsikringsområde;
   }
   public String getForsikringssum(){
       return forsikringssum;
   }
}
