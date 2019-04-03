package model;
public class feilhåndteringBåtforsikringSkjema {
    //METODE SOM SJEKKER OM INNPUT ER TALL
    public static void sjekkInputTall(String inntekst) throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntekst);
        }catch(Exception e){
                throw new feilTallInnput("Du må skrive inn tall");
                }
        }
    //METODE SOM SJEKKER OM DET SOM ER SKREVET INN ER I DATO FORMAT
    public static void sjekkInputDato(String inntekst) throws feilDatoInnput{
                if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Ikke korrekt skrevet inn dato");
                }
        }
    public static void sjekkForsikringsbeløp(String inntekst)throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntekst);
        }catch(Exception e){
                throw new feilTallInnput("Du må skrive inn tall");
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
}