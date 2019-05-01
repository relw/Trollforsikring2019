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
    
    public ArrayList<baatforsikring> kundeBaatforsikring = new ArrayList<>(); 
    public ArrayList<fritidsboligforsikring> kundeFritidsboligforsikring = new ArrayList<>(); 
    public ArrayList<husoginnboforsikring> kundeHusoginnboforsikring = new ArrayList<>(); 
    public ArrayList<reiseforsikring> kundeReiseforsikring = new ArrayList<>(); 
    
    public ArrayList<skademeldinger> kundeSkademeldinger = new ArrayList<>(); 
    
    public kunder(String innNavn, String dato, String fakturaadresse, int forsknummer)
    {
        this.navn = innNavn; 
        this.datoforhold = dato; 
        this.fakturaadresse = fakturaadresse;
        this.forsikringsnummer = forsknummer; 
    }
    
    public void setBaatforsikring(baatforsikring f)
    {
        kundeBaatforsikring.add(f); 
    }
    public void setFritids(fritidsboligforsikring f)
    {
        kundeFritidsboligforsikring.add(f); 
    }
    public void setReiseforsikring(reiseforsikring f)
    {
        kundeReiseforsikring.add(f); 
    }
    public void setHusoginnboforsikring(husoginnboforsikring f){
        kundeHusoginnboforsikring.add(f); 
    }
    public void setSkademelding(skademeldinger s)
    {
        kundeSkademeldinger.add(s); 
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
        ut+="Kunde: " + "\n" 
        + "----------------------------" + "\n"
        + "Navn: "+ navn + "\n"
        + "Dato: "+ datoforhold + "\n"
        + "Fakturaadresse: "+ fakturaadresse + "\n" 
        + "Forsikringsnummer: "+ getForsikringsNummer() + "\n" 
        + "____________________________" + "\n"; 
        
        // Skriver ut info om fritidsboligforsikring hvis registrert. 
        if(!kundeFritidsboligforsikring.isEmpty())
        {
           ut += " Fritidsboligforsikringer:\n"; 
            for(fritidsboligforsikring forsikringer: kundeFritidsboligforsikring){ 
                ut+="Forsikringspremie: "+forsikringer.getForsikringPremie()+"\nOpprettet: "+forsikringer.getOpprettetForsikring()+"\nForsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\nAdresse: "+forsikringer.getAdresse()+"\nBoligtype: "+forsikringer.getBoligtype()+"\nByggemateriale: "+forsikringer.getByggemateriale()+"\nStandard: "+forsikringer.getStandard()+"\nByggeår: "+forsikringer.getByggeår()+"\nKvadratmeter: "+forsikringer.getAntallKvm()+"\nForsikringsbeløp byggning: "+forsikringer.getForsikringsbeløpBygning()+"\nForsikringsbeløp innbo: "+forsikringer.getForsikringsbeløpInnbo()+"\n";  
            } 
        }
        // Skriver ut info om husoginnboforsikring hvis det er registrert. 
        if(!kundeHusoginnboforsikring.isEmpty())
        {
           ut += " Husoginnboforsikringer:\n"; 
            for(husoginnboforsikring forsikringer: kundeHusoginnboforsikring){
                  ut+="Forsikringspremie: "+forsikringer.getForsikringPremie()+"\nOpprettet: "+forsikringer.getOpprettetForsikring()+"\nForsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\nBoligadresse: "+forsikringer.getBoligAdresse()+"\n Byggeår: "+forsikringer.getByggeår()+"\nBoligtype: "+forsikringer.getBoligtype()+"\nStandard: "+forsikringer.getStandard()+"\nByggemateriale: "+forsikringer.getByggemateriale()+"\nAntall kvadratmeter: "+forsikringer.getAntallKvm()+"\nBeløp for byggning: "+forsikringer.getBeløpForByggning()+"\nBeløp for innbo: "+forsikringer.getBeløpForInnbo()+"\n";  
            } 
        }
        // Skriver ut info om båtforsikring hvis det er registrert. 
        if(!kundeBaatforsikring.isEmpty())
        {
           ut += " Båtforsikringer:\n"; 
            for(baatforsikring forsikringer: kundeBaatforsikring){
                ut+="Forsikringspremie: "+forsikringer.getForsikringPremie()+"\nOpprettet: "+forsikringer.getOpprettetForsikring()+"\nForsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\nEier: "+forsikringer.getEier()+"\nBåttype: "+forsikringer.getBåttype()+"\nRegistreringsnummer: "+forsikringer.getRegnummer()+"\nAntall fot: "+forsikringer.getAntallFot()+"\nÅrsmodell: "+forsikringer.getÅrsmodell()+"\n";  
            } 
        }
        // Skriver ut info om reiseforsikring hvis registrert. 
        if(!kundeReiseforsikring.isEmpty())
        {
           ut += " Reiseforsikringer:\n"; 
            for(reiseforsikring forsikringer: kundeReiseforsikring){
                
                  ut+="Forsikringspremie: "+forsikringer.getForsikringPremie()+"\nOpprettet: "+forsikringer.getOpprettetForsikring()+"\nForsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\nForsikringsområde: "+forsikringer.getForsikringsområde()+"\nForsikringssum: "+forsikringer.getForsikringssum()+"\n";  
            } 
        }
        if(!kundeSkademeldinger.isEmpty())
        {
            ut += "Skademeldinger: \n"; 
            for(skademeldinger skader : kundeSkademeldinger)
            {
                ut += "Dato: "+skader.getDato()+"\nSkadebeskrivelse: "+skader.getBeskrivelse()+"\nType skade: "+skader.getType()+"\nKontaktinformasjon: "+skader.getKontaktInfo()+"\nSkadenummer: "+skader.getSkadenummer()+"\nTakseringsbeløp: "+skader.getTakseringsbeløp()+"\nUbetalt erstatningsbeløp: "+skader.getUbetaltErstatningsbeløp();  
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
    

