package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Aleksander
 */
public class kunder implements Serializable{

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
    @Override
    public String toString()    // Skriver ut all informasjon om kunde som string. 
    {
        String ut="";
        ut+="Navn: "+navn+" Dato: "+datoforhold+" FakturaAdresse: "+fakturaadresse;
        if(!kundeForsikringer.isEmpty())
        {
           ut += " Forsikringer:\n"; 
            for(forsikringer forsikringer: kundeForsikringer){
            ut+="Forsikringspremie: "+forsikringer.getForsikringPremie()+" Opprettet: "+forsikringer.getOpprettetForsikring()+" Forsikringsbeløp: "+forsikringer.getForsikringsBeloop()+ "Betingelser: "+forsikringer.getForsikringsBetingelser()+"\n";
            } 
        }
        if(!kundeSkademeldinger.isEmpty())
        {
            ut += "Skademeldinger: \n"; 
            for(skademeldinger skader : kundeSkademeldinger)
            {
                ut += "Dato: "+skader.getDato()+", Skadebeskrivelse: "+skader.getBeskrivelse()+", Type skade: "+skader.getType()+", Kontaktinformasjon: "+skader.getKontaktInfo()+", Skadenummer: "+skader.getSkadenummer()+", Takseringsbeløp: "+skader.getTakseringsbeløp()+", Ubetalt erstatningsbeløp: "+skader.getUbetaltErstatningsbeløp();  
            }
        }
        
        return ut;
    }
    
    public String utskriftKunde()    // Skriver ut kundeinformasjon som string. 
    {
        String ut="";
        ut+="Navn: "+navn+" Dato: "+datoforhold+" FakturaAdresse: "+fakturaadresse+"\n";
        return ut;
    }
    }
    

