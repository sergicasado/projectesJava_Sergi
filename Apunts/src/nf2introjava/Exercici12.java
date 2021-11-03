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
public class Exercici12 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int num, div=2;

        do{
            System.out.println("Introduix un enter major que 1:");
            num=ent.nextInt();
            if(num<2) System.out.println("Ha de ser major que 1!!");
            else break;
        }while(true);
        
        
        System.out.format("%d = ", num);
        while(num>1){
            if(num%div==0){
                System.out.format("%5d * ", div);
                num=num/div;    //una altra possibilitat num/=div;
            } else div++;
        }
        System.out.println("1");
        
    }
    
}
