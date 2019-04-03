package model;
public class feilhåndteringBåtforsikringSkjema {
    //METODE SOM SJEKKER OM INNPUT ER TALL
    public static void sjekkInputTall(String inntxt) throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntxt);
        }catch(Exception e){
                throw new feilTallInnput("Du må skrive inn tall");
                }
        }
    //METODE SOM SJEKKER OM DET SOM ER SKREVET INN ER I DATO FORMAT
    public static void sjekkInputDato(String inntxt) throws feilDatoInnput{
 
//            String[] splitString = inntxt.split("/");
//                if (splitString.length != 3){
//                    throw new feilDatoInnput("Du må skrive i dato format");
//                }
                if (inntxt.matches("\\d{2}-\\d{2}-\\d{4}")) {
   
                }
                else{
                    throw new feilDatoInnput("Ikke korrekt skrevet inn dato");
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