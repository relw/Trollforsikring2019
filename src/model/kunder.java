package model;

import java.util.ArrayList;

/**
 *
 * @author Aleksander
 */
public class kunder {

    private String datoforhold, navn, fakturaadresse; 
    private int forsikringsnummer;
    
    public ArrayList<forsikringer> kundeForsikringer = new ArrayList<>(); 
    public ArrayList<skademeldinger> kundeSkademeldinger = new ArrayList<>(); 
    
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
    public String utskrift()    // Skriver ut all informasjon om kunde som string. 
    {
        String ut="";
        ut+="Navn: "+navn+" Dato: "+datoforhold+" FakturaAdresse: "+fakturaadresse+" Forsikringer:\n";
        for(forsikringer forsikringer: kundeForsikringer){
            ut+="Forsikringspremie: "+forsikringer.getForsikringPremie()+" Opprettet: "+forsikringer.getOpprettetForsikring()+" Forsikringsbeløp: "+forsikringer.getForsikringsBeloop()+ "Betingelser: "+forsikringer.getForsikringsBetingelser()+"\n";
        }
        ut += "Skademeldinger: \n"; 
        for(skademeldinger skader : kundeSkademeldinger)
        {
            ut += "Dato: "+skader.getDato()+", Skadebeskrivelse: "+skader.getBeskrivelse()+", Type skade: "+skader.getType()+", Kontaktinformasjon: "+skader.getKontaktInfo()+", Skadenummer: "+skader.getSkadenummer()+", Takseringsbeløp: "+skader.getTakseringsbeløp()+", Ubetalt erstatningsbeløp: "+skader.getUbetaltErstatningsbeløp();  
        }
        return ut;
    }
    }
    

