package model;
public class feilmeldingSkademeldingSkjema {
    
    public static void sjekkDatoForSkade(String inntekst)throws feilDatoInnput{
         if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Ikke korrekt skrevet inn dato");
                }
    }
    
    public static void sjekkSkadenummer(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Du må skrive inn skadenummer");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive et tall");
        }
    }
    
        
    public static void sjekkTypeSkade(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Du må skrive inn type skade");
        }
    }
    
    public static void sjekkBeskrivelseAvSkade(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Du må skrive inn en beskrivelse");
        }
    }
    
    public static void sjekkKontaktinformasjonVitner(String inntekst) throws feilTekstInnput{
        if(inntekst.isEmpty()){
            throw new feilTekstInnput("Du må skrive noe informasjon");
        }
    }
    
    public static void sjekkTakseringsbeløpAvSkaden(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Du må skrive inn beløp");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive et tall");
        }
    }
    
    public static void sjekkUbetalteErstatninger(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Du må skrive inn ubetalte erstating");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive et tall");
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
    