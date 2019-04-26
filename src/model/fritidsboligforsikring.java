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
public class fritidsboligforsikring extends forsikringer{
    

   private String adresse, boligtype, byggemateriale, standard, byggeår, antallKvadratmeter, forsikringsbeløpInnbo;  
   
   
   public fritidsboligforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String forsikringBetingelser, String innadresse, String innboligtype, String innByggemateriale, String innStandard, String innByggeår, String antallKvadratmeter, String innForsikringsbeløpInnbo)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop, forsikringBetingelser);
     this.adresse = innadresse; 
     this.boligtype = innboligtype;
     this.byggemateriale = innByggemateriale; 
     this.standard = innStandard; 
     this.byggeår = innByggeår;
     this.antallKvadratmeter = antallKvadratmeter; 
     this.forsikringsbeløpInnbo = innForsikringsbeløpInnbo; 
             
   }

}
