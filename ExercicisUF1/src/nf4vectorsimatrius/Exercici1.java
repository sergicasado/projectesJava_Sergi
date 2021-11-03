/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici1 {
    public static void main(String[] args) {
        
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int num, div=2, index=0;
        int[] factors;
        
        //Demanem a l'usuari la introducció  del número enter major que 0
        do {            
            System.out.println("Introduix un enter major que 0:");
            num=ent.nextInt();
            if(num<=0) System.out.println("Ha de ser major que 0!!");
            else break;
        } while (true);
        
        //Instanciem el vector que contindrà els factors primers
        factors=new int[Math.round((float)(Math.log(num) / Math.log(2)))];
        
        System.out.format("%nDescomposició factorial de %d:%n", num);
        while(num!=1){
            if(num%div==0){
                factors[index++]=div;
                num/=div;
            } else div++;
        }
        
        System.out.print("1 ");
        for (int i = 0; i < factors.length && factors[i]!=0; i++) {
            System.out.format(" * %d", factors[i]);
        }
        System.out.println("");
    }
 
}
