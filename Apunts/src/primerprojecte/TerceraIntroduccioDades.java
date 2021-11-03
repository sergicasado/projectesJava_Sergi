/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;


/**
 *
 * @author profe
 */
public class TerceraIntroduccioDades {
    
    public static void main(String[] args) {
        
        //Introducció de dades
        
        //1rt pas. Declarem un Scanner
        Scanner entNum = new Scanner(System.in);
        Scanner entCad = new Scanner(System.in);
        int edat, pes;
        String nom;
        
        System.out.println("Introduix la teua edat:");
        
        edat=entNum.nextInt();
        
        System.out.println("Introduix el teu pes:");
        
        pes=entNum.nextInt();
        
        System.out.println("Introduix el teu nom:");
        
        nom=entCad.nextLine();
        
        System.out.println("Tens "+edat+" anys, peses "+pes+"kgs i te dius "+nom);
        
        
    }
    
}
