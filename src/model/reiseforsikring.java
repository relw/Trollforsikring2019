/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Aleksander
 */
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
