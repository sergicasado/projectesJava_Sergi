/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2introjava;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici12Bis {
    
    public static void main(String[] args) {
        //Declaració de variables
        //Comento les instruccions on apareix cont ja que no formen part del que
        //demana l'enunciat
        Scanner ent=new Scanner(System.in);
        int num, div;
                //, cont=0;
        
        do{
            System.out.println("Introduix un enter major que 1:");
            num=ent.nextInt();
            if(num<2) System.out.println("Ha de ser major que 1!!");
            else break;
        }while(true);
        
        
        System.out.format("Els divisors de %d són:%n", num);
        System.out.println("En sentit creixent...");
        for(div=1;div<=num;div++){
            if(num%div==0){
                System.out.println(div);
                //cont++;
            } 
        }

        System.out.println("\nEn sentit decreixent...");
        for(div=num;div>=1;div--){
            if(num%div==0){
                System.out.println(div);
            } 
        }
        
        //System.out.println("\nTé un total de "+cont+" divisors.");
        
    }
    
}
