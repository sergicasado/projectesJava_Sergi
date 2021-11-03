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
public class Exercici8 {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String text = "", resultat="";
        int[] vocalsCompt=new int[5];
        String vocals="AEIOU";
        
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

        //Recorrem el text de dreta a esquerra
        for (int i = text.length()-1; i >= 0; i--) {
            //Busco la lletra actual passada a majúscula dins la casdena de vocals
            int index=vocals.indexOf(Character.toUpperCase(text.charAt(i)));
            //Si l'he trobat incremento la casella del vector de comptadors
            if(index!=-1) vocalsCompt[index]++;
            //Concateno el caràcter al resultat
            resultat+=text.charAt(i);
        }
        
        System.out.format("%nEl text transformat és%n%s%n", resultat);
        
        for (int i = 0; i < vocalsCompt.length; i++) {
            System.out.format("%nLa '%c' ha sortit %d vegades.", vocals.charAt(i), vocalsCompt[i]);
        }
        System.out.println("");
    }
}
