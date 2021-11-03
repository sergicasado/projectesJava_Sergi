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
public class Seleccio {

    public static void main(String[] args) {
        //Declaració de variables
        int numero;
        boolean esBixest=false;
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
        } else System.out.println("El " + numero + " és imparell.");
        
        
        if( numero % 3 == 0 && numero>30 || numero<10 || !(numero % 25 ==0) ){
            System.out.println("has encertat el número misteriòs!");
        } else {
            System.out.println("Has fallat, torna-ho a intentar!!");
        }
        
        
        if(numero==0) System.out.println("És el zero.");
        else System.out.println("No és el zero.");
        
        
        
        System.out.println("Adéu!!");
        
        if( esBixest ) System.out.println("SI");
        else System.out.println("NO");
        
        if( esBixest==true ) System.out.println("SI");
        else System.out.println("NO");

        if( !esBixest ) System.out.println("SI");
        else System.out.println("NO");
        
        if( esBixest==false ) System.out.println("SI");
        else System.out.println("NO");




    }

}
