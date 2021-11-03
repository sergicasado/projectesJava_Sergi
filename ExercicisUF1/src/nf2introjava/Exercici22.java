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
public class Exercici22 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int nlin;
        
        //Demanem a l'usuari un enter positiu (número de línies)
        do {
            System.out.println("Introduix un enter positiu (>0):");
            nlin=ent.nextInt();
            if(nlin<=0) System.out.println("Ha de ser positiu!!");
            else break;
        } while (true);
        
        //Dibuixem la primera figura
        //* 
        //* * 
        //* * * 
        //* * * * 
        //* * * * * 
        for(int i=0; i<nlin;i++){
            for(int j=0; j<i+1; j++) System.out.print("* ");
            System.out.println("");
        }
        System.out.println("");
        
        //Dibuixem la segona figura
        //* * * * * 
        //* * * * 
        //* * * 
        //* * 
        //* 
//        for(int i=nlin-1; i>=0;i--){
//            for(int j=0; j<i+1; j++) System.out.print("* ");
//            System.out.println("");
//        }
        for(int i=0; i<nlin;i++){
            for(int j=0; j<nlin-i; j++) System.out.print("* ");
            System.out.println("");
        }
        System.out.println("");
        
        //Dibuixem la tercera figura
        for(int i=0;i<nlin;i++){
            
            for(int j=0;j<nlin-i-1;j++) System.out.print("  ");
            
            for(int j=0;j<i+1;j++) System.out.print(" *");
            
            System.out.println("");
        }
        System.out.println("");        
        
        //Dibuixem la cuarta figura
        for(int i=nlin-1; i>=0;i--){
            
            for(int j=0;j<nlin-i-1;j++) System.out.print("  ");
            
            for(int j=0;j<i+1;j++) System.out.print(" *");
            
            System.out.println("");
        }
        System.out.println("");        

    }
    
}
