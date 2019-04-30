/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aleksander
 */
public class reiseforsikring extends forsikringer{
   private String forsikringsområde;
   private int forsikringssum;  
    
   public reiseforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String forsikringBetingelser, String innforsikringsområde, int innforsikringssum)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop);
     this.forsikringsområde = innforsikringsområde;
     this.forsikringssum = innforsikringssum; 
   } 
}
