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
public class Exercisi7 {
    
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        
        double r;
        
        do{
            System.out.println("Introdueix el radi de la circumferèncoa (>0.0):");
            r=ent.nextDouble();
            if(r<=0.0) System.out.println("El radi ha de ser positiu!");
            else break;
        }while(true);
        
        System.out.format("El perímetre val %15.3f %n", 2 * Math.PI * r);
        System.out.format("Làrea val %20.1f %n", r * Math.PI * r);
        
        
        
        
        
        
    }
    
}
