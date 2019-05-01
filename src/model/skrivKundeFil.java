/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



// Serialisering
public class skrivKundeFil implements skriveFil{
    
    @Override
    public boolean skrive(kundeLagring obj){
     
        
        String fp2 = "kunder.jobj";
        String filepath = fp2;
        
        try (
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
           
               out.writeObject(obj);
           
            
            out.close(); 
            
            return true; 
        }
        catch (IOException e) {
            e.printStackTrace(); // This should not happen, so we print debug information here.
            return false; 
        } 
    }
    @Override
    public String lese()
    {
        String res = ""; 
        try (FileInputStream fin = new FileInputStream("kunder.jobj");
        ObjectInputStream oin = new ObjectInputStream(fin)) {
            Object loadedKunde = oin.readObject();
            res = loadedKunde.toString();
            
        } catch(IOException e) {
            System.err.println("Could not read file. Cause: " + e.getCause());
        } catch(ClassNotFoundException e) {
            System.err.println("Could not convert Object");
        }
        return res;
        
        
   }
    @Override
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

