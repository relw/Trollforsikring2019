package model;

/**
 *
 * @author Aleksander
 */
public class skademeldinger {
    
    private String dato, typeSkade, beskrivelse, kontaktInfo;
    private int skadenummer, takseringsbeløp, ubetaltErstatningsbeløp;
    
    public skademeldinger(String inndato, String inntype, String innbeskrivelse, String innkontaktInfo, int innskadenummer
    , int inntakseringsbeløp, int innubetaltErstatningsbeløp)
    {
        this.dato = inndato;
        this.typeSkade = inntype; 
        this.beskrivelse = innbeskrivelse; 
        this.kontaktInfo = innkontaktInfo; 
        this.skadenummer = innskadenummer; 
        this.takseringsbeløp = inntakseringsbeløp; 
        this.ubetaltErstatningsbeløp = innubetaltErstatningsbeløp; 
    }
    public String getDato(){
        return dato; 
    }
    public String getType(){
        return typeSkade; 
    }
    public String getBeskrivelse(){
        return beskrivelse; 
    }
    public String getKontaktInfo(){
        return kontaktInfo; 
    }
    public int getSkadenummer(){
        return skadenummer; 
    }
    public int getTakseringsbeløp(){
        return takseringsbeløp; 
    }
    public int getUbetaltErstatningsbeløp(){
        return ubetaltErstatningsbeløp; 
    }
}
