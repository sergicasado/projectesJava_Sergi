/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Gasolina2 {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int casos,cont=0,contA=0;
        int [] preu;
        
       
        do{    
        
        casos=ent.nextInt();
        
            if(casos==0)break;
            
            preu=new int[casos];
            
            for (int i = 0; i < preu.length; i++) {
                preu[i]=ent.nextInt();
                
            }
            
            for (int i = 1; i < preu.length; i++) {
                if(preu[i]>preu[i-1])contA++;
                
            }
            
            System.out.println(contA+1);
            
            cont++;
            
            contA=0;
            
        }while(true);
    }
    
}