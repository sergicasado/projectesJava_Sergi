/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nf3cadenes;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici10 {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String text = "", resultat="", reves="";
        String separadors=" ,.'\n;:-";
        
        
        //Demanem el text a l'usuari (1 o més línies i acabat en punt) (exerc 9)
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

        //Obtenir el text sense separadors (exerc 9)
        for (int i = 0; i < text.length(); i++) {
            //Miro si el caracter actual és o no separador, i el tracto
            if(!separadors.contains(text.charAt(i)+"")){ //text.charAt(i)+"" equival a Character.toString(text.charAt(i))
                        //Concateno el caràcter al resultat
                        resultat+=text.charAt(i);   //resultat=resultat+text.charAt(i)
                        reves=text.charAt(i)+reves;
            }
        }

        //Passem el text a majúscula o minúscula
        //resultat=resultat.toUpperCase();
        
        //Comprovem si és palíndrom
        //-obtenim el text del reves (exerc 9)
//        for (int i = resultat.length()-1; i >= 0; i--) {
//            reves+=resultat.charAt(i);
//        }
        
        //-comparem el text del revés en l'anterior
        //  -si els textos són iguals tenim un palíndrom
        if(resultat.equalsIgnoreCase(reves)) System.out.println("\nÉs palíndrom!!");
        else System.out.println("\nNo és palíndrom!!");
        
        System.out.println("");
    }
}
