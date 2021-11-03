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
public class Exercici12 {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String text = "", segon="";
        
        
        //Demanem el text a l'usuari (1 o més línies i acabat en una que conté el punt)
        System.out.println("Introduix un text format per una o més línies i acabat en una que contingue el punt:");
        do {
            String linia = ent.nextLine().trim();
            
            if (text.isEmpty()) {
                text = linia;
            } else {
                text = text + '\n' + linia;
            }
            if (text.contains(".")) {
                break;
            }
        } while (true);
        
        //Demanem un segon text no buit format per una sola línia
        System.out.println("\nIntroduix un text no buit (una sola línia):");
        do {            
            segon=ent.nextLine();
            if(segon.trim().isEmpty()) System.out.println("No pot ser buida!!");
            else break;
        } while (true);
        
        //Busquem el segon text dins del primer
        if(text.contains(segon)){
            int pos=text.indexOf(segon);
            System.out.format("%nEl text \"%s\" es troba entre les posicions %d i %d.", segon, pos+1, pos+segon.length());
            
        }else System.out.format("%nEl text \"%s\" no es troba dins del primer.", segon);
        
        System.out.println("");

    }
}
