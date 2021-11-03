/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdomjudge;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici7 {

    public static void main(String[] args) {
        //Declaració de variables 
        Scanner ent = new Scanner(System.in);
        double radi;

        //Anem a demanar el radi a l'usuari
        //System.out.println("Introduix el radi de la circumferència (número real positiu):");
        radi = ent.nextDouble();

        //Mostrem el resultat per la sortida
        //System.out.println("El perímetre de la circumferència és "+ 2 * Math.PI * radi);
        //System.out.println("L'àrea de la circumferència és "+ Math.PI * radi * radi);
        System.out.println(2 * Math.PI * radi + " " + Math.PI * radi * radi);

    }

}
