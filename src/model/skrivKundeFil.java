package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



// Serialisering
public class skrivKundeFil{
    
    
    public static boolean skrive(kundeLagring obj){
     
        
        String fp2 = "kunder.jobj";
        String filepath = fp2;
        
        try (
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
//           kundeLagring kundeListe = new kundeLagring();
//           skrivKundeFil skf = new skrivKundeFil(); 
//           kundeLagring kl = new kundeLagring(); 
//           
//           kl = skf.hentObjekt(); // Henter gamle objekt
//           if(kl != null){
//                ArrayList<kunder> array = new ArrayList<>();
//                ArrayList<kunder> arrayInn = new ArrayList<>();
//                array = kl.putKunderIListe(); // Gamle array med kunder
//                arrayInn = obj.putKunderIListe(); // Innarray med nye kunder
//
//                for(kunder k : arrayInn){
//                    array.add(k); 
//                }
//                for(kunder k: array){
//                    kundeListe.pluss(k); 
//                }


//                out.writeObject(kundeListe);
//           }
//           else{
//               out.writeObject(obj);
//           }
           
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
    public static String leseValgtFil(String filbane)
    {
        String res = ""; 
        try (FileInputStream fin = new FileInputStream(filbane);
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
    
    public static kundeLagring hentObjekt(){
        kundeLagring loadedKunde = null; 
        try (FileInputStream fin = new FileInputStream("kunder.jobj");
        ObjectInputStream oin = new ObjectInputStream(fin)) {
            loadedKunde = (kundeLagring)oin.readObject();
            
            return loadedKunde; 
        } catch(IOException e) {
            System.err.println("Hent objekt: Could not read file. Cause: " + e.getCause());
        } catch(ClassNotFoundException e) {
            System.err.println("Could not convert Object");
        }
        return loadedKunde; 
    }

        
}

