/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici25 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, index, valor, contPlenes=0;
        int[] v; 
        boolean[] plena; 
        
        //Demanar un enter positiu
        do {            
            System.out.println("Introduix un enter positiu:");
            n=ent.nextInt();
            if(n<1) System.out.println("Ha de ser positiu (>0)!!");
            else break;
        } while (true);
        
        //Instanciem el vector d'n caselles
        v=new int[n];
        plena=new boolean[n];
        
        //Anem a demanar les parelles de valors a l'usuari  
        while(contPlenes<n){
            
            //primer demanem un index user-friendly, forçant a l'usuari
            do {                
                System.out.println("Introduix un enter entre 1 i "+v.length);
                index=ent.nextInt();
                if(index<1 || index>v.length) System.out.println("Ha de estar entre 1 i "+v.length);
                else break;
            } while (true);
            //Decrementem l'index per a que sigue coder-friendly
            index--;
            
            //A continuació demenm un enter qualsevol
            System.out.println("Introduix un enter qualsevol:");
            valor=ent.nextInt();
            
            //Omplim la casella en el valor indicat
            v[index]=valor;
            
            //Marquem que hem omplit la casella corresponent
            if(!plena[index]) contPlenes++;
            plena[index]=true;
        }
        
        
        //Mostrem el vector final
        System.out.println("El vector és:");
        for (int i = 0; i < v.length; i++) {
            System.out.format("%d ",v[i]);
            
        }
        
        System.out.println("");
        
    }
    
}
