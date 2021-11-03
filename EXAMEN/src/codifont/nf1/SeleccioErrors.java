/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class SeleccioErrors {

    public static void main(String[] args) {
        //Declaració de variables
        int numero;
        Scanner ent = new Scanner(System.in);

        //Demanem a l'usuari que entre un número enter
        System.out.println("Introduix un número enter:");
        numero = ent.nextInt();

        //Anem a dir-li a l'usuari si el número és parell
        if (numero % 2 == 0) {
            System.out.print("El " + numero + " és parell");
            if(numero%4==0) {
                System.out.print(" i múltiplo de 4");            
            }
            System.out.println("");
        } 
        
        if (numero % 2 != 0) {
            System.out.println("El " + numero + " és imparell.");
        }

        System.out.println("Adéu!!");
    }

}
