/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

/**
 *
 * @author profe
 */
public class Ternari {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        int num=89;
        boolean parell;
        
        //Exemple en if_else
        if (num % 2 == 0) {
            System.out.println("És parell");
        } else {
            System.out.println("És imparell");
        }
        
        //El mateix utilitzant l'operador condicional ternari
        System.out.println( num%2==0 ? "És parell" : "És imparell");
        
        
        //Mirem si el número és o no parell
        if (num%2==0) {
            parell=true;
        } else {
            parell=false;
        }
        
        //El mateix utilitzant l'operador condicional ternari
        parell=num%2==0 ? true : false ;
        
        
        parell = num%2==0;
    }
    
}
