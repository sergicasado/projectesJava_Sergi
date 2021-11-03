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
public class Ternari {
    
    public static void main(String[] args) {
        
        
        Scanner ent=new Scanner(System.in);
        int num=89;
        
        num=ent.nextInt();
       
         //Exemple en if else
        if (num % 2 == 0) {
            
            System.out.println("Es parell");
            
        }else System.out.println("Es imparell");
        
        //El mateix utilitzant l'operador condicional ternari
        
        System.out.println(num%2==0 ? "Es parell" : "Es imparell");
        
        
        //Mirem si el numero es o no parell
        
//        if (num%2==0) {
//            parell=true
//            
        }
        
        
        
    }
    

