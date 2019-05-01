/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Aleksander
 */
public class skrivExcelFil{
    
    public boolean skrive(kundeLagring obj){
        return true; 
    }
    
    public String lese(){
        return "";
    }
    
    public kundeLagring hentObjekt(){
        kundeLagring loadedKunde = null; 
        try (FileInputStream fin = new FileInputStream("kunder.jobj");
        ObjectInputStream oin = new ObjectInputStream(fin)) {
            loadedKunde = (kundeLagring)oin.readObject();
            
            return loadedKunde; 
        } catch(IOException e) {
            System.err.println("Could not read file. Cause: " + e.getCause());
        } catch(ClassNotFoundException e) {
            System.err.println("Could not convert Object");
        }
        return loadedKunde;
    }
}
