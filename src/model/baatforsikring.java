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
public class baatforsikring extends forsikringer{
    private String eier, båttype, model, motortype;
   private String regnummer, lendgeAntallFot, årsmodell; 
    
    public baatforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String inneier, String innbåttype, String innmotortype, String innregnummer, String innlengde, String innårsmodell)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop);
     this.eier = inneier; 
     this.båttype = innbåttype; 
     
     
     this.regnummer = innregnummer;
     this.lendgeAntallFot = innlengde; 
     this.årsmodell = innårsmodell; 
   } 
}
