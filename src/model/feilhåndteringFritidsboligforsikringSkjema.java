package model;
public class feilhåndteringFritidsboligforsikringSkjema {
    //SJEKKER OM ET FELT INNEHOLDER TALL
    public static void sjekkInnputTall(String inntekst) throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive inn et tall");
        }
    }
    //
     //METODE SOM SJEKKER OM DET SOM ER SKREVET INN ER I DATO FORMAT
    public static void sjekkInputDato(String inntekst) throws feilDatoInnput{
                if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Ikke korrekt skrevet inn dato");
                }
        }
    public static void sjekkAdresse(String inntekst) throws feilAdresseInnput{
        if(inntekst.isEmpty()){
            throw new feilAdresseInnput("Du må skrive inn adresse"); 
            //SKRIV EN IF HER SOM SJEKKER OM STRINGEN INNEHOLDER BÅDE BOKSTAVER OG TALL
        }
    }
    public static void sjekkByggemateriale(String inntekst) throws tomtTekstfelt{
        if(inntekst.isEmpty()){
            throw new tomtTekstfelt("Du må skrive inn byggemateriale");
        }
    }
    public static void sjekkStandard(String inntekst) throws tomtTekstfelt{
        if(inntekst.isEmpty()){
            throw new tomtTekstfelt("Du må skrive inn standard");
        }
    }
    public static void sjekkBoligtype(String inntekst) throws tomtTekstfelt{
        if(inntekst.isEmpty()){
            throw new tomtTekstfelt("Du må skrive inn boligtype");
        }
    }
     public static void sjekkByggeår(String inntekst) throws feilByggeårInnput{
        if(inntekst.isEmpty()){
            throw new feilByggeårInnput("Du må skrive inn et årstall");
        }
        try{
            int årsmodell=Integer.parseInt(inntekst);
        }catch(Exception e){
                throw new feilByggeårInnput("Du må skrive inn et årstall");
          }
        if(inntekst.length() !=4){
            throw new feilByggeårInnput("Skriv inn et årstall");
        }
        
    }
     public static void sjekkKvm(String inntekst) throws feilTallInnput{
         try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive inn antall kvm");
        }
     }
    
    public static class feilTallInnput extends Exception{
        public feilTallInnput(String msg) 
        {
            super(msg);
        }
    }
     public static class feilDatoInnput extends Exception{
        public feilDatoInnput(String msg) 
        {
            super(msg);
        }
    }
      public static class feilAdresseInnput extends Exception{
        public feilAdresseInnput(String msg) 
        {
            super(msg);
        }
      }
      
        public static class tomtTekstfelt extends Exception{
        public tomtTekstfelt(String msg) 
        {
            super(msg);
        }
    }
        public static class feilByggeårInnput extends Exception{
        public feilByggeårInnput(String msg) 
        {
            super(msg);
        }
    }
   }
