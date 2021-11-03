/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf3;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici10 {
    
    public static void main(String[] args) {
        
    Scanner ent = new Scanner(System.in);
    String text = "", resultat="";
    String separadors=" ,.'\n;:-";
    
    //Demanem el text a l'usuari (1 o més linies i acabat en punt) (ex9)
    
     System.out.println("Introduix un text format per una o més línies i acabat en punt:");
        do {
            String linia = ent.nextLine().trim();
            
            if (text.isEmpty()) {
                text = linia;
            } else {
                text = text + '\n' + linia;
            }
            if (text.endsWith(".")) {
                break;
            }
        } while (true);
        
    //Passem el text a majuscula o minuscula
    //Obtenir el text sense separadors (ex9)
    
        for (int i = 0; i < text.length(); i++) {
        if(!separadors.contains(text.charAt(i)+"")) 
        resultat+=text.charAt(i);  
        }
      System.out.format("%nEl text sense separadors és%n%s%n", resultat);
    
      
    

    

    //Obtenim el text del reves (ex9)
     System.out.println("\nI al revés és:");
        for (int i = resultat.length()-1; i >= 0; i--) {
            System.out.format("%c", resultat.charAt(i));

    
            
        }
        
        if(resultat.equals(resultat))System.out.println(" és un palindrom");
        System.out.println("");

   
    }
}
