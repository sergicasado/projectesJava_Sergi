/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici8 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="", linia="", resultat="";
        
        //Demanem a l'usuari la introducció del text
        System.out.println("Introduix línies de text (acabada en punt per finalitzar):");
        do {         
            linia=ent.nextLine().trim();
            
            //Tractem la línia actual --> donem-li la volta
            for (int i = 0; i < linia.length(); i++) {
                //Concatenar el caracter per l'esquerra per a que surtigue al revés
                resultat=linia.charAt(i)+resultat;
            }
            
            //Concatenem la línia al text
            text=text+linia;
            
            //Mirem si és o no la última línia del text
            if(linia.endsWith(".")) break;
            else {
                text+='\n';
               resultat='\n'+resultat;
            }    //Si no és la última afegixo un salt de línia
        } while (true);
        
         
        System.out.format("%nEl text al revés és:%n%n%s%n%n", resultat);
        
    }
    
}
