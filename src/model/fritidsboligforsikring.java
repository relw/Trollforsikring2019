package model;

import java.io.Serializable;

public class fritidsboligforsikring extends forsikringer implements Serializable{
    

   private String adresse, boligtype, byggemateriale, standard, byggeår, antallKvadratmeter, forsikringsbeløpBygning, forsikringsbeløpInnbo;  
   
   
   public fritidsboligforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String innadresse, String innboligtype, String innByggemateriale, String innStandard, String innByggeår, String antallKvadratmeter,String innForsikringsbeløpBygning, String innForsikringsbeløpInnbo)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop);
     this.adresse = innadresse; 
     this.boligtype = innboligtype;
     this.byggemateriale = innByggemateriale; 
     this.standard = innStandard; 
     this.byggeår = innByggeår;
     this.antallKvadratmeter = antallKvadratmeter; 
     this.forsikringsbeløpBygning = innForsikringsbeløpBygning;
     this.forsikringsbeløpInnbo = innForsikringsbeløpInnbo; 
             
   }
   public String getAdresse(){
       return adresse;
   }
   public String getBoligtype(){
       return boligtype;
   }
   public String getByggemateriale(){
       return byggemateriale;
   }
   public String getStandard(){
       return standard;
   }
   public String getByggeår(){
       return byggeår;
   }
   public String getAntallKvm(){
       return antallKvadratmeter;
   }
   public String getForsikringsbeløpBygning(){
       return forsikringsbeløpBygning;
   }
   public String getForsikringsbeløpInnbo(){
       return forsikringsbeløpInnbo;
   }

}
