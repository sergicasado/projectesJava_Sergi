/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2introjava;

import java.util.Scanner;

/**
 *
 * 7. Fes un programa en Java que demane a l'usuari la introducció del radi 
 * d'una circumferència (un número real positiu) i calcule el perímetre i l'àrea 
 * de la circumferència (si el radi és r, p el perímetre i a l'àrea, les 
 * fórmules són: p = 2 * PI * r, a = PI * r * r). Obliga a l'usuari a posar un 
 * valor de radi correcte. Mostreu el perímetre en 3 decimals i l’àrea en 1, 
 * ambdós ocupant 20 espais. Nota: el valor de PI el podeu obtindre directament 
 * usant la constant Math.PI.

 * @author profe
 */
public class Exercici7 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        double r;
        
        //Demanem el radi --> número real positiu
        do{
            System.out.println("Introduix el radi de la circumferència (>0.0):");
            r=ent.nextDouble();
            if(r<=0.0) System.out.println("El radi ha de ser positiu!!");
            else break;
        }while(true);
        
        //Mostrem el resultat
        System.out.format("El perímetre val %20.3f %n", 2 * Math.PI * r);
        System.out.format("L'àrea val %20.1f %n", r * Math.PI * r);
        
    }
    
}
