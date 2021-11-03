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
public class Exercici13 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, contDivisors=0;
        
        //Demanem un número enter al l'usuari
        System.out.println("Introduix un número enter:");
        num=ent.nextInt();
        
        //Si el número és menor que 2 li diem que no és primer
        if(num<2) System.out.println("NO");
        else{   //Tractem els números >=2
            
            for (int i = 1; i < num && contDivisors<=1; i++) {
                if(num%i == 0) contDivisors++;
            }
            
            if(contDivisors==1) System.out.println("SI");
            else System.out.println("NO");
            
            
        }
    }
    
}
