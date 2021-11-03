/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici15 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        char c;
        int i;
        
        //Comencem l'execució
        
        //Li demanem a l'usuari que intriduisque un caràcter en minúscula
        System.out.println("Introduix un caràcter en minúscula:");
        c=ent.nextLine().charAt(0);
        
        //Comprobem quin caràcter ha introduit l'usuari i mostrem el missatge corresponent
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c +" és vocal");
                break;
            default:
                System.out.println(c +" o no és vocal, o no està escrita en minúscules");
        }
        
        
    }
    
}
