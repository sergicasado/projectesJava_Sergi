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
public class Exercici13 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int num, div, cont=0;
        
        do{
            System.out.format("Introduix un enter major que 1:%n");
            num=ent.nextInt();
            if(num<2) System.out.format("Ha de ser major que 1!!%n");
            else break;
        }while(true);
        
        //Comptem quants divisors hi ha
        for(div=1;div<=num;div++){
            if(num%div==0){
                cont++;
            } 
        }

//        if(cont==2) System.out.format("%d  és primer%n",num);
//        else  System.out.format("%d no és primer%n", num);
        
        System.out.format((cont==2?"%d  és primer%n":"%d no és primer%n"), num);
        
    }
    
}
