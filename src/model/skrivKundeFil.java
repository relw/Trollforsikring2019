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
import java.util.ArrayList;

public class skrivKundeFil {
    
    public static boolean skrive(kundeLagring obj){
     
        
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
    public static String lese()
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
    public static ArrayList<Object> leseAlle(){
        
        ArrayList<Object> objectsList = new ArrayList<Object>();
        boolean cont = true;
        try{
            FileInputStream fis = new FileInputStream("kunder.jobj");
           ObjectInputStream input = new ObjectInputStream(fis);
           while(cont){
              Object obj = input.readObject();
              if(obj != null)
                 objectsList.add(obj);
              else
                 cont = false;
           }
        }catch(Exception e){
           //System.out.println(e.printStackTrace());
        }
        return objectsList; 
    }
        
}

