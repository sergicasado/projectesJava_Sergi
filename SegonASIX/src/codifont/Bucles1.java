/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Bucles1 {
    
    public static void main(String[] args) {
        
        
        //Declaracio de variables
        Scanner ent = new Scanner(System.in);
        int num=1, valor;
        
        
        
        //Demanem valor final a l'usuari
        System.out.println("Introdueix el valor final");
        valor = ent.nextInt();
        
        //Vaig a mostrar els numeros del 1 al 3
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
        
        
        //Farem el mateix que dalt pero un bucle usant while.
            
        while (num<=valor) {
            System.out.println(num);
            num=num+1;
            
        }
        
        
        //Repetim el bucle pero en ordre decreixent
        
        num=valor;
        while (num>=1) {
            
            if (num%2==0) {
                System.out.println(num);
                
            }else{
                System.out.println(num+" és imparell");
            }
            
            System.out.println(num);
            num--;
            
        }
        
        //Ara mostrarem només els parells
        
        
        
    }
    
}
