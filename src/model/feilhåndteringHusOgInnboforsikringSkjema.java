package model;

public class feilhåndteringHusOgInnboforsikringSkjema {
   public static void sjekkForsikringspremie(String inntekst)throws feilTallInnput{
       if(inntekst.isEmpty()){
           throw new feilTallInnput("Skriv inn tall");
       }
       try{
           int forsikringspremie=Integer.parseInt(inntekst);
       }
       catch(Exception e){
           throw new feilTallInnput("Du må skrive inn tall");
       }
   }
    public static void sjekkInputDato(String inntekst) throws feilDatoInnput{
                if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Ikke korrekt dato format");
                }
        }
     public static void sjekkForsikringsBeløp(String inntekst)throws feilTallInnput{
       if(inntekst.isEmpty()){
           throw new feilTallInnput("Skriv inn tall");
       }
       try{
           int forsikringspremie=Integer.parseInt(inntekst);
       }
       catch(Exception e){
           throw new feilTallInnput("Skriv inn tall");
       }
   }
   public static void sjekkAdresse(String inntekst) throws feilTekstInnput{
       if(inntekst.isEmpty()){
           throw new feilTekstInnput("Skriv inn adresse");
       }
   }
   public static void sjekkByggeår(String inntekst) throws feilTallInnput{
       if(inntekst.isEmpty()){
           throw new feilTallInnput("Skriv inn byggeår");
       }
       try{
           int byggeår=Integer.parseInt(inntekst);
       }
       catch(Exception e){
           throw new feilDatoInnput("Skriv inn årstall");
       }
       if(inntekst.length()!=4){
            throw new feilDatoInnput("Skriv inn årstall");
       } 
   }
   public static void sjekkBoligtype(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Skriv inn boligtype");
        }
        if(inntekst.matches("[0-9]+")){
            throw new feilTekstInnput("Er ikke tall i boligtype");
        }
    }
  
   public static void sjekkByggemateriale(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Skriv inn byggemateriale");
        }
        if(inntekst.matches("[0-9]+")){
            throw new feilTekstInnput("Er ikke tall i byggemateriale");
        }
    }
   public static void sjekkStandard(String inntekst) throws feilTekstInnput{
       if(inntekst.isEmpty()){
           throw new feilTekstInnput("Skriv inn standard");
       }
       if(inntekst.matches("[0-9]+")){
            throw new feilTekstInnput("Er ikke tall i standard");
        }   
   }
  public static void sjekkKvm(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Skriv antall kvm");
        }
        try{
            int kvm=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Skriv inn tall");
        }
    }
  public static void sjekkForsikringsbeløpBygning(String inntekst) throws feilTallInnput{
      if(inntekst.isEmpty()){
            throw new feilTallInnput("Skriv inn forsikrinsbeløp");
        }
        try{
            int kvm=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Skriv inn tall");
        }
  }
   public static void sjekkForsikringsbeløpInnbo(String inntekst) throws feilTallInnput{
      if(inntekst.isEmpty()){
            throw new feilTallInnput("Skriv inn forsikrinsbeløp");
        }
        try{
            int kvm=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Skriv inn tall");
        }
  }
   
   public static class feilTallInnput extends Exception{
        public feilTallInnput(String msg) 
        {
            super(msg);
        }
    }
   public static class feilDatoInnput extends feilTallInnput{
        public feilDatoInnput(String msg) 
        {
            super(msg);
        }
    }
   public static class feilTekstInnput extends Exception{
        public feilTekstInnput(String msg) 
        {
            super(msg);
        }
    }
  
}
