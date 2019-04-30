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
public class husoginnboforsikring extends forsikringer{
   private String boligadresse, boligtype, standard, byggemateriale;
   private String byggeår, antallKvadratmeter, beløpForByggning, beløpForInnbo; 
    
    public husoginnboforsikring(String forsikringPremie, String opprettetForsikring, String forsikringsBeloop, String innboligadresse, String innboligtype, String innstandard, String innbyggemateriale, String innbyggeår, String innantallkvadratmeter, String innbeløpforbyggning, String innbeløpforinnbo)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop);
     this.boligadresse = innboligadresse;
     this.antallKvadratmeter = innantallkvadratmeter;
     this.beløpForByggning = innbeløpforbyggning;
     this.beløpForInnbo = innbeløpforinnbo;
     this.byggeår = innbyggeår;
     this.boligtype = innboligtype;
     this.standard = innstandard; 
     this.byggemateriale = innbyggemateriale; 
   } 
   public String getBoligAdresse(){
       return boligadresse;
   }
   public String getAntallKvm(){
       return antallKvadratmeter;
   }
   public String getBeløpForByggning(){
       return beløpForByggning;
   }
   public String getBeløpForInnbo(){
       return beløpForInnbo;
   }
   public String getByggeår(){
       return byggeår;
   }
   public String getBoligtype(){
       return boligtype;
   }
   public String getStandard(){
       return standard;
   }
   public String getByggemateriale(){
       return byggemateriale;
   }
}
