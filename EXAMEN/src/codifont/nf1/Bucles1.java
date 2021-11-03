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
public class Bucles1 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in); 
        int num=1, valor;
        
        //Vaig a mostrar els números de l'1 al 3
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
        
        //Demanem valor final a l'usuari
        System.out.println("Introduix el valor final:");
        valor=ent.nextInt();
        
        //Farem el mateix que dalt pero usant un bucle while
        while ( num <= valor ) {
            System.out.println(num);
            num=num+1;  //equivalent a num++
        }
        
        //Repetim el bucle però en ordre decreixent
        num=valor;
        while ( num >= 1 ) {
            System.out.println(num); 
            num--;  //equivalent a num=num-1
        }
        
        //Ara mostrarem només els parells
        num=valor;
        while ( num >= 1 ) {
            if(num%2==0){
                System.out.println(num);
            }else{
                System.out.println(num+" és imparell");
            } 
            num--;  //equivalent a num=num-1
        }
    }
    
}
