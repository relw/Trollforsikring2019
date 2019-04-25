package model;
public class feilhåndteringKundeSkjema {
    public static void sjekkKundeForholdDato(String inntekst)throws feilDatoInnput{
         if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Feil dato format");
                }
        }
    public static void sjekkNavn(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Skriv inn navn");
        }
        if(inntekst.matches("[a-zA-Z]+")){
            
        }
        else{
            throw new feilTekstInnput("Feil med navnet ditt");
        }
    }
    public static void sjekkFakturaAdresse(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Skriv inn fakturaAdresse");
        }
    }
    public static void sjekkForsikringsnummer(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Skriv inn forsikringsnummer");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Skriv et tall");
        }
    }
    
    
    public static class feilDatoInnput extends Exception{
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
    public static class feilTallInnput extends Exception{
        public feilTallInnput(String msg) 
        {
            super(msg);
        }
    }
}
    



