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
public class Exercici2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "";
        int cont=0;
        char c;
        int index=0;

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
        
        System.out.println("\nIntroduix el caràcter a buscar dins del text:");
        do {            
            //No faico el trim() per si vol buscar el caràcter en blanc
            String linia = ent.nextLine();
            if(linia.isEmpty()) System.out.println("No pots posar la cadena buida!!");
            else{
                c=linia.charAt(0);
                break;
            }
        } while (true);
        
        index=text.indexOf(c);
        while (index!=-1) {
            cont++;
            index=text.indexOf(c,index+1);
        }
        
        System.out.format("%nEl caràcter ‘%c’ apareix %d vegades dins el text.%n", c, cont);

    }

}
