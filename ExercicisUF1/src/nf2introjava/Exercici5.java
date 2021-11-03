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
public class Exercici5 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        double pes;
        int cont=0;
        
        //System.out.println(ent.locale().getDisplayCountry());
        
        do{
            System.out.println("Introduix un pes positiu de pizza (0.0 per acabar):");
            pes=ent.nextDouble();
            if(pes>0.0) cont++;
            if(pes==0) break;
            
            System.out.format("%+10.2f %n", pes);
            System.out.format("%+010.2f %n", pes);
            System.out.format("%E %n", pes);
            System.out.format("%g %n", pes);
            
        }while(true);
        
        System.out.format("S'han introduït %010d pizzes.%n", cont);
        
        
    }
    
    
}
