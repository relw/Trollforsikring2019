package model;

import java.util.ArrayList;

/**
 *
 * @author Aleksander
 */
public class kunder {
//    Dato for opprettet kundeforhold
//• Navn
//• Fakturaadresse
//• Forsikringsnummer
//• Alle kundens forsikringer
//• Skademeldinger
//• Ubetalte erstatninger

    private String datoforhold, navn, fakturaadresse; 
    private int forsikringsnummer;
    
    public ArrayList<forsikringer> kundeForsikringer = new ArrayList<>(); 
    //public ArrayList<skademeldinger> kundeSkademeldinger = new ArrayList<>(); 
    
    public kunder(String innNavn, String dato, String fakturaadresse, int forsknummer)
    {
        this.navn = innNavn; 
        this.datoforhold = dato; 
        this.fakturaadresse = fakturaadresse;
        this.forsikringsnummer = forsknummer; 
    }
    
    public String getNavn()
    {
        return navn; 
    }
    public String getDato()
    {
        return datoforhold; 
    }
    public String getFakturaAdresse()
    {
        return fakturaadresse; 
    }
    public int getForsikringsNummer()
    {
        return forsikringsnummer; 
    }
    public String utskrift(){
        
        
        
    }
}
