/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aleksander
 */
interface skriveFil{
    boolean skrive(kundeLagring obj);
    String lese(); 
    kundeLagring hentObjekt();    
}

