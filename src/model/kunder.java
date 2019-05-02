package model;

import java.io.Serializable;
import java.util.ArrayList;
import javafx.scene.control.Button;

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
           ut += "\nFritidsboligforsikringer:\n"; 
            for(fritidsboligforsikring forsikringer: kundeFritidsboligforsikring){ 
                ut+="- Forsikringspremie: "+forsikringer.getForsikringPremie()+"\n- Opprettet: "+forsikringer.getOpprettetForsikring()+"\n- Forsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\n- Adresse: "+forsikringer.getAdresse()+"\n- Boligtype: "+forsikringer.getBoligtype()+"\n- Byggemateriale: "+forsikringer.getByggemateriale()+"\n- Standard: "+forsikringer.getStandard()+"\n- Byggeår: "+forsikringer.getByggeår()+"\n- Kvadratmeter: "+forsikringer.getAntallKvm()+"\n- Forsikringsbeløp byggning: "+forsikringer.getForsikringsbeløpBygning()+"\n- Forsikringsbeløp innbo: "+forsikringer.getForsikringsbeløpInnbo()+"\n";  
            } 
        }
        // Skriver ut info om husoginnboforsikring hvis det er registrert. 
        if(!kundeHusoginnboforsikring.isEmpty())
        {
            int teller = 0; 
            for(husoginnboforsikring f : kundeHusoginnboforsikring){
               teller++; 
           }
            String tellerS = Integer.toString(teller); 
           ut += "\n"+tellerS+" Husoginnboforsikringer:\n"; 
            for(husoginnboforsikring forsikringer: kundeHusoginnboforsikring){
                  ut+="- Forsikringspremie: "+forsikringer.getForsikringPremie()+"\n- Opprettet: "+forsikringer.getOpprettetForsikring()+"\n- Forsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\n- Boligadresse: "+forsikringer.getBoligAdresse()+"\n- Byggeår: "+forsikringer.getByggeår()+"\n- Boligtype: "+forsikringer.getBoligtype()+"\n- Standard: "+forsikringer.getStandard()+"\n- Byggemateriale: "+forsikringer.getByggemateriale()+"\n- Antall kvadratmeter: "+forsikringer.getAntallKvm()+"\n- Beløp for byggning: "+forsikringer.getBeløpForByggning()+"\n- Beløp for innbo: "+forsikringer.getBeløpForInnbo()+"\n";  
            } 
        }
        // Skriver ut info om båtforsikring hvis det er registrert. 
        if(!kundeBaatforsikring.isEmpty())
        {
           int teller = 0; 
            for(baatforsikring f : kundeBaatforsikring){
               teller++; 
           }
            String tellerS = Integer.toString(teller); 
            ut += "\n"+tellerS+" Båtforsikringer:\n"; 
            for(baatforsikring forsikringer: kundeBaatforsikring){
                ut+="- Forsikringspremie: "+forsikringer.getForsikringPremie()+"\n- Opprettet: "+forsikringer.getOpprettetForsikring()+"\n- Forsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\n- Eier: "+forsikringer.getEier()+"\n- Båttype: "+forsikringer.getBåttype()+"\n- Registreringsnummer: "+forsikringer.getRegnummer()+"\n- Antall fot: "+forsikringer.getAntallFot()+"\n- Årsmodell: "+forsikringer.getÅrsmodell()+"\n\n";  
            } 
        }
        // Skriver ut info om reiseforsikring hvis registrert. 
        if(!kundeReiseforsikring.isEmpty())
        {
           ut += "\nReiseforsikringer:\n"; 
            for(reiseforsikring forsikringer: kundeReiseforsikring){
                
                  ut+="- Forsikringspremie: "+forsikringer.getForsikringPremie()+"\n- Opprettet: "+forsikringer.getOpprettetForsikring()+"\n- Forsikringsbeløp: "+forsikringer.getForsikringsBeloop()+"\n- Forsikringsområde: "+forsikringer.getForsikringsområde()+"\n- Forsikringssum: "+forsikringer.getForsikringssum()+"\n";  
            } 
        }
        if(!kundeSkademeldinger.isEmpty())
        {
            ut += "\nSkademeldinger: \n"; 
            for(skademeldinger skader : kundeSkademeldinger)
            {
                ut += "     - Dato: "+skader.getDato()+"\n      - Skadebeskrivelse: "+skader.getBeskrivelse()+"\n       - Type skade: "+skader.getType()+"\n        - Kontaktinformasjon: "+skader.getKontaktInfo()+"\n     - Skadenummer: "+skader.getSkadenummer()+"\n        - Takseringsbeløp: "+skader.getTakseringsbeløp()+"\n        - Ubetalt erstatningsbeløp: "+skader.getUbetaltErstatningsbeløp();  
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
    

