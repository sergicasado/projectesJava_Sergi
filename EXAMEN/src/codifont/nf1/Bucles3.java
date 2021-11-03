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
public class Bucles3 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int valor=1;  //guardarem els valors introduït per l'usuari
        int suma=0;   //acumulem els valors introduïts 
        
        //Demanem a l'usuari que intriduisque un valor enter (0 per acabar)
        
        while ( valor != 0 ) {
            System.out.println("Introduix un valor enter (0 per acabar):");
            valor=ent.nextInt();
            suma=suma+valor;
        }
        
        System.out.println("La suma dels números introduïts és "+suma);
        
    }
    
    
}
