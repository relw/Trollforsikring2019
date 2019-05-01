package model;

import java.io.Serializable;

/**
 *
 * @author Aleksander
 */
public class skademeldinger implements Serializable{
    
    private String dato, typeSkade, beskrivelse, kontaktInfo;
    private String skadenummer, takseringsbeløp, ubetaltErstatningsbeløp;
    
    public skademeldinger(String inndato, String inntype, String innbeskrivelse, String innkontaktInfo, String innskadenummer
    , String inntakseringsbeløp, String innubetaltErstatningsbeløp)
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
    public String getSkadenummer(){
        return skadenummer; 
    }
    public String getTakseringsbeløp(){
        return takseringsbeløp; 
    }
    public String getUbetaltErstatningsbeløp(){
        return ubetaltErstatningsbeløp; 
    }
}
