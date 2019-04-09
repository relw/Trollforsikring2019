package model;
public class feilhåndteringFritidsboligforsikringSkjema {
    //SJEKKER OM ET FELT INNEHOLDER TALL
    public static void sjekkInnputTall(String inntekst) throws feilInnputTall{
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilInnputTall("Du må skrive inn et tall");
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
    
    public static class feilInnputTall extends Exception{
        public feilInnputTall(String msg) 
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
}
