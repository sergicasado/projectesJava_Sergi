/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdomjudge;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici28 {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        long primer, num, sum=0; 
        int cont=1;
        
        primer=sum=ent.nextLong();
        System.out.print(primer);
        do{
            System.out.println("");
            num=ent.nextLong();
            sum+=num;  
            System.out.print(sum);
            cont++;
        }while(num!=primer);
        System.out.println(" "+cont);
        
    }
    
}
