package model;
public class feilhåndteringReiseforsikringSkjema {
    public static void sjekkForsikringspremie(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Skriv inn et tall");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Skriv inn et tall");
        }
    }
     public static void sjekkInputDato(String inntekst) throws feilDatoInnput{
                if (inntekst.matches("\\d{2}-\\d{2}-\\d{4}")) {
    
                }
                else{
                    throw new feilDatoInnput("Feil dato format");
                }
        }
     public static void sjekkForsikringsbeløp(String inntekst)throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntekst);
        }catch(Exception e){
                throw new feilTallInnput("Skriv et tall");
                }
        }
     
     public static void sjekkForsikringsOmråde(String inntekst) throws feilOmrådeInnput{
        if(inntekst.isEmpty()){
            throw new feilOmrådeInnput("Skriv inn navn");
        }
        if(inntekst.matches("[a-zA-Z]+")){
            
        }
        else{
            throw new feilOmrådeInnput("Feil med navnet");
        }
    }
     public static void sjekkForsikringsSum(String inntekst)throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntekst);
        }catch(Exception e){
                throw new feilTallInnput("Skriv inn tall");
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
    public static class feilOmrådeInnput extends Exception{
        public feilOmrådeInnput(String msg) 
        {
            super(msg);
        }
    }
}
