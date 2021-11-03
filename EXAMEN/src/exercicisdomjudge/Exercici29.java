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
public class Exercici29 {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        char c1, c2, tmp; 
        int num;
        c1=ent.nextLine().charAt(0);
        c2=ent.nextLine().charAt(0);
        num=ent.nextInt();
        
        if(c1>c2){
            tmp=c1;
            c1=c2;
            c2=tmp;
        }
        
        while(c1<=c2){
            System.out.println(c1);
            c1+=num;
        }
        
        
    }
    
}
