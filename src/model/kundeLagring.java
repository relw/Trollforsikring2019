/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
 
/**
 *
 * @author Aleksander
 */
// Klasse for lagring av kunder til jobj
public class kundeLagring implements Serializable {
    public ArrayList<kunder> liste = new ArrayList<>(); 
    public void pluss(kunder k)
    {
        liste.add(k); 
    }
    public ArrayList<kunder> putKunderIListe(){
        ArrayList<kunder> listeKunder = new ArrayList<>(); 
        for(kunder k:liste)
        {
            listeKunder.add(k); 
        }
        return listeKunder; 
    }
    @Override
    public String toString()
    {
        String ut= ""; 
        for(kunder o : liste){
            ut+= o.toString(); 
        }
         return ut; 
    }
    
}
