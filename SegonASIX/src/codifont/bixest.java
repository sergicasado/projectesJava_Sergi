/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 *
 * @author sergixulo
 */
public class bixest {
    
    public static void main(String[] args) {
      
        
        Scanner ent=new Scanner(System.in);
        int any;                  
        any=ent.nextInt();
       
        
        if(any >= 1582 && (any%400 == 0  || ( any % 4 == 0   &&  any %100 != 0  ))){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
        
    }
    
}
