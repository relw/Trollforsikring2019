package model;
public class feilhåndteringReiseforsikringSkjema {
    public static void sjekkForsikringspremie(String inntekst) throws feilTallInnput{
        if(inntekst.isEmpty()){
            throw new feilTallInnput("Du må skrive inn et tall");
        }
        try{
            int tall=Integer.parseInt(inntekst);
        }
        catch(Exception e){
            throw new feilTallInnput("Du må skrive inn et tall");
        }
    }
    
    public static class feilTallInnput extends Exception{
        public feilTallInnput(String msg) 
        {
            super(msg);
        }
    }
}
