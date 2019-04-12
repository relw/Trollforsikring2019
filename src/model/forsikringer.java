package model;


public class forsikringer {
    
    public int forsikringPremie;
    public int opprettetForsikring;
    public int forsikringsBeloop;
    public String forsikringBetingelser;

    public forsikringer(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser) 
    {
        
        this.forsikringPremie = forsikringPremie;
        this.opprettetForsikring = opprettetForsikring;
        this.forsikringsBeloop = forsikringsBeloop;
        this.forsikringBetingelser = forsikringBetingelser;
    }

    public int getForsikringPremie() {
        
        return forsikringPremie;
    }

    public int getOpprettetForsikring() {
        
        return opprettetForsikring;
    }
    
    public int getForsikringsBeloop() {
        
        return forsikringsBeloop;
    }
    
    public String getForsikringsBetingelser() {
        
        return forsikringBetingelser;
    }
    

    @Override
    public String toString() {
        
        return String.format(forsikringBetingelser, forsikringPremie, opprettetForsikring, forsikringsBeloop);
    }
    
    

}

class fritidsboligforsikring extends forsikringer
{
   private String adresse, boligtype, byggemateriale, standard;  
   private int byggeår, antallKvadratmeter, forsikringsbeløpInnbo;
   
   public fritidsboligforsikring(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser, String innadresse, String innboligtype, String innByggemateriale, String innStandard, int innByggeår, int antallKvadratmeter, int innForsikringsbeløpInnbo)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop, forsikringBetingelser);  
   }
}

class fritidsboligforsikring extends forsikringer
{
   private String adresse, boligtype, byggemateriale, standard;  
   private int byggeår, antallKvadratmeter, forsikringsbeløpInnbo;
   
   public fritidsboligforsikring(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser, String innadresse, String innboligtype, String innByggemateriale, String innStandard, int innByggeår, int antallKvadratmeter, int innForsikringsbeløpInnbo)
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
    
class båtforsikring extends forsikringer
{
   private String eier, båttype, model, motortype, motorstyrke;
   private int regnummer, lendgeAntallFot, årsmodell; 
    
    public båtforsikring(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser, String inneier, String innbåttype, String innmodel, String innmotortype, String innmotorstyrke, int innregnummer, int innlengde, int innårsmodell)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop, forsikringBetingelser);
     this.eier = inneier; 
     this.båttype = innbåttype; 
     this.model = innmotortype;
     this.motorstyrke = innmotorstyrke;
     this.regnummer = innregnummer;
     this.lendgeAntallFot = innlengde; 
     this.årsmodell = innårsmodell; 
   } 
}

class reiseforsikring extends forsikringer
{
   private String forsikringsområde;
   private int forsikringssum;  
    
   public reiseforsikring(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser, String innforsikringsområde, int innforsikringssum)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop, forsikringBetingelser);
     this.forsikringsområde = innforsikringsområde;
     this.forsikringssum = innforsikringssum; 
   } 
}

class husoginnboforsikring extends forsikringer
{
   private String boligadresse, boligtype, standard, byggemateriale;
   private int byggeår, antallKvadratmeter, beløpForByggning, beløpForInnbo; 
    
    public husoginnboforsikring(int forsikringPremie, int opprettetForsikring, int forsikringsBeloop, String forsikringBetingelser, String innboligadresse, String innboligtype, String innstandard, String innbyggemateriale, int innbyggeår, int innantallkvadratmeter, int innbeløpforbyggning, int innbeløpforinnbo)
   {
     super(forsikringPremie, opprettetForsikring, forsikringsBeloop, forsikringBetingelser);
     this.boligadresse = innboligadresse;
     this.antallKvadratmeter = innantallkvadratmeter;
     this.beløpForByggning = innbeløpforbyggning;
     this.beløpForInnbo = innbeløpforinnbo;
     this.byggeår = innbyggeår;
     this.boligtype = innboligtype;
     this.standard = innstandard; 
     this.byggemateriale = innbyggemateriale; 
   } 
}
