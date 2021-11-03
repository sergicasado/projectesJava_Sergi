/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *12. Fes un programa en Java que demane a l'usuari la introducció d'un valor enter i escrigue tots els seus factors primers.

 * @author profe
 */
public class Exercici12 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num, factor=2;
        boolean negatiu;
        
        //Demanem un número enter a l'usuari
        System.out.println("Introduix un número enter qualsevol:");
        num=ent.nextInt();
        
        if(num!=0){
            //Si el número és negatiu el passem a positiu, però abans 
            //multipliquem per -1
            if(num<0){
                System.out.print(num+" = -1");
                num=num*-1;
            }else{
                System.out.print(num+" = 1");
            }
            while(num!=1){
                //Si num és divisible per factor
                if(num%factor==0){
                    System.out.print(" x "+factor);
                    num/=factor;    //equivalent a num=num/factor;
                }else{
                    factor++;   //equivalent a factor=factor+1;
                }
            }    
        } else System.out.print("El 0 no té descomposició en factors primers.");
           
        System.out.println("");
    }
    
}
