/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sergi
 *
 */
public class CadenesIII {
    
    public static void main(String[] args) {
        
        String cad1="Hola";
        String cad2="Hola";
        String cad3=new String("Hola");
        String cad4=new String("Hola");
        String cad5=new String("HOLA");
        
        String cadena="Adeu";
        
        
        
        //Són iguals perque apunten al mateix objecte
        if(cad1==cad2 ) System.out.println("Les cadenes són iguals");
        else System.out.println("Les cadenes són diferents");
        
        
        //Són diferents perque no apunten al mateix objecte, cada una és un objecte diferent.
        if(cad3==cad4) System.out.println("Les cadenes són iguals");
        else System.out.println("Les cadenes són diferents");
       
        //Amb equals mirem si el contingut es el mateix, amb == mirem si apunta al mateix objecte.
        if(cad3.equals(cad4)) System.out.println("Les cadenes són iguals");
        else System.out.println("Les cadenes són diferents");
        
        //equalsIgnoreCasa, ens diu que son iguals sense mirar ni majuscules ni minuscules, sol mira el contingut.
        if(cad4.equalsIgnoreCase(cad5)) System.out.println("Les cadenes són iguals");
        else System.out.println("Les cadenes són diferents");
        
        //Si dona num negatiu, el String cadena es mes petit, si dona positiu, el que posem entre parentesi es mes gran, si dona 0 són iguals.
        System.out.println(cadena.compareTo("adeu"));
        
        //Mirem si Hola comença per Ho (ens dona true)
        System.out.println("Hola".startsWith("Ho"));
        
        //Mirem si Hola acaba per Ho (ens dona false)
        System.out.println("Hola".endsWith("Ho"));
        
        //Mirem si "Hola " acaba en punt (ens dona false perque acaba amb un espai final)
        System.out.println("Hola.   ".endsWith("."));
        
        //Amb el .trim eliminem els espais i mirem quin es realment l'ultim caracter.
        System.out.println("Hola.   ".trim().endsWith("."));
        
        //Mirem si Hola conté ol al seu interior (ens dona true)
        System.out.println("Hola".contains("ol"));
        
        //Mirem si Hola conté m al seu itnerior (ens dona false)
        System.out.println("Hola".contains("m"));
        
    }
}
