package model;
public class feilhåndteringKundeSkjema {
    public static void sjekkKundeForholdDato(String inntekst)throws feilDatoInnput{
         if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Ikke korrekt skrevet inn dato");
                }
        }
    public static void sjekkNavn(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Skriv inn et navn");
        }
        String[] splitt = inntekst.split(" ");
        if(splitt.length>=2){
            for(int i=0;i<splitt.length;i++){
            if(splitt[i].matches("[0-9]+")){
               throw new feilTekstInnput("Det er tall i navnet"); 
            }
        }
        }
        else{
            throw new feilTekstInnput("Skriv fullt navn");
        }
        
        
    }
    public static void sjekkFakturaAdresse(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Du må skrive inn fakturaAdresse");
        }
    }
    public static void sjekkForsikringsnummer(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Du må skrive inn forsikringsnummer");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive et tall");
        }
        if(inntekst.length() != 8) {
            throw new feilTallInnput("Nummeret må bestå av 8 siffer!");
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
    



