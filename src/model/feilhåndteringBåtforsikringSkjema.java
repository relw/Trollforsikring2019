package model;
public class feilhåndteringBåtforsikringSkjema {
    public static void sjekkInputTall(String inntxt) throws feilTallInnput{
        //SJEKKER OM DET SOM ER SKREVET INN ER TALL
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
