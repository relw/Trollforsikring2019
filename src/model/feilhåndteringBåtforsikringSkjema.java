package model;
public class feilhåndteringBåtforsikringSkjema {
    //METODE SOM SJEKKER OM FORSIKRINGSPREMIE INNPUT ER TALL
    public static void sjekkInputForsikringspremie(String inntekst) throws feilTallInnput{
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
    //METODE SOM SJEKKER OM FORSIKRINGSBELØP INNEHOLDER KUN TALL
    public static void sjekkForsikringsbeløp(String inntekst)throws feilTallInnput{
        try{
            int tall=Integer.parseInt(inntekst);
        }catch(Exception e){
                throw new feilTallInnput("Du må skrive inn tall");
                }
        }
    //METODE SOM SJEKKER OM EIER FELTET INNEHOLDER ET NAVN
    public static void sjekkEier(String inntekst) throws feilInnputNavn{
        if(inntekst.isEmpty()){
            throw new tomtNavn("Du må skrive inn et navn");
        }
        if(inntekst.matches("[a-zA-Z]+")){
            
        }
        else{
            throw new feilInnputNavn("Noe er feil med navnet ditt");
        }
    }
    //METODE SOM SJEKKER OM REGISTRERINGSNUMMER FELTET ER RIKTIG
    public static void sjekkRegistreringsnummer(String inntekst) throws feilRegistreringsnummer{
        if(inntekst.isEmpty()){
            throw new feilRegistreringsnummer("Du må skrive inn reg nr");
        }
        //RESTEN BLE KOMMENTERT BORT FORDI ETTER Å HA SJEKKET ER DET MANGE FORSKJELLIGE MÅTER Å SKRIVE REGNR PÅ
//        String[] splittRegistreringsnummer = inntekst.split(" ");
//        if (splittRegistreringsnummer.length != 2){
//            throw new feilRegistreringsnummer("Reg nr er ikke skrevet korrekt");
//        }
//        if(splittRegistreringsnummer[0].matches("[a-zA-Z]{2}+")){
//            
//        }
//        else{
//            throw new feilRegistreringsnummer("Feil i reg nr");
//        }
        
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
    public static class feilInnputNavn extends Exception{
        public feilInnputNavn(String msg) 
        {
            super(msg);
        }
    }
    public static class tomtNavn extends feilInnputNavn{
        public tomtNavn(String msg) 
        {
            super(msg);
        }
    }
    public static class feilRegistreringsnummer extends Exception{
        public feilRegistreringsnummer(String msg){
            super(msg);
        }
    }
}