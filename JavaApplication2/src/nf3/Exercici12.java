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
public class Exercici12 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text = "", segon = "";
        String separadors = " ,.'\n;:-";

        //Demanem el text a l'usuari (1 o més linies i acabat en punt) (ex9)
        System.out.println("Introduix un text format per una o més línies i acabat en punt:");
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

        //Demanem un segon text no buit format per una sola linia
        System.out.println("Introdueix un text no vuit(una sola línia):");

        do {
            segon = ent.nextLine();
            if (segon.trim().isEmpty())System.out.println("No pot ser buida!!"); 
            else break;

        } while (true);
        
     if(text.contains(segon)){
         
         int pos= text.indexOf(segon);
         
         System.out.format("%nEl text \"%s\" es troba entre les posicions %d i %d",segon,pos+1,pos+1+segon.length());
         
     }else System.out.format("%nEl text \"%s\" no es troba dins del primer.",segon);
        System.out.println("");
    }
}

