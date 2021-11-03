/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf2;

/**
 *
 * @author profe
 */
public class CadenesIII {

    public static void main(String[] args) {
        String s1 = new String("Hola");
        String s2 = new String("Hola");
        String s3 = new String("HOLA");
        
        s1="Adéu";
        s2="Adéu";
        
        //Mostrem si són o no el mateix objecte
        if(s1==s2) System.out.println("Sí, són el mateix objecte");
        else System.out.println("No, no són el mateix objecte");
        
        
        if(s1.equals(s2)) System.out.println("Són iguals");
        else System.out.println("Són diferents");

        if(s1.equals(s3)) System.out.println("Són iguals");
        else System.out.println("Són diferents");
        if(s1.equalsIgnoreCase(s3)) System.out.println("Són iguals");
        else System.out.println("Són diferents");
        
        System.out.println(s2=s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1);
        System.out.println(s2);
        
        
    }

}
