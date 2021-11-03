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
public class Exercici1 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        int num1,num2;
        
        num1=ent.nextInt();
        num2=ent.nextInt();
        
        if(num1>num2){
            System.out.println(+num1);
            System.out.print(+num2);
                
               
        }else{
            System.out.println(+num2);
            System.out.print(+num1);
            
        }
     
        
        
    }
    
}
