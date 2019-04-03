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
    
    public static class feilTallInnput extends Exception{
        public feilTallInnput(String msg) 
        {
            super(msg);
        }
    }
}
