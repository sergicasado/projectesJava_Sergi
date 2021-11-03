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
public class CadenesII {
    
    public static void main(String[] args) {
        
//        String cadena="murcielago";
//        
//        System.out.println(cadena.contains("mur") || cadena.contains("lago"));
//        
//        int contVocals=0;
//        for (int i = 0; i < cadena.length(); i++) {
//            if("aeiouáéíóúaèìòùïü".contains(cadena.toLowerCase().charAt(i)+"")) contVocals++;
//        } 
//        
//        System.out.format("%nHi ha %d vocals dins del text %s%n", contVocals, cadena);
        
        //Demanar a l'usuari la introducció d'un text format per una o més 
        //línies i acabat en punt
        Scanner ent=new Scanner(System.in);
        String text="";
        
        System.out.println("Introduix un text format per una o més línies i acabat en punt:");
        do {         
            String linia=ent.nextLine().trim();
            if(text.isEmpty()) text=linia;
            else text=text+'\n'+linia;
            if(text.charAt(text.length()-1)=='.') break;
        } while (true);
        System.out.println("");
        System.out.println(text);
    }
    
}
