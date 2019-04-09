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
        }  
        
        //SKRIV EN IF HER SOM SJEKKER OM STRINGEN INNEHOLDER BÅDE BOKSTAVER OG TALL
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
}
