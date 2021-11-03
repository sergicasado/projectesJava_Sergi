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
public class Calculadora {
    
    public static void main(String[] args) {
        
        char a;
        int num1,num2;
        
        Scanner escaner = new Scanner(System.in);
        
        a = escaner.nextLine().charAt(0);
        num1=escaner.nextInt();
        num2=escaner.nextInt();
               
        switch (a){
            case '+': System.out.println(num1+num2);
            break;
            case '-': System.out.println(num1-num2);
            break;
            case '*': System.out.println(num1*num2);
            break;
            case '/': 
                if(num2==0)
                    System.out.println("ERROR: DIVISIO PER ZERO"); else
            System.out.println(num1/num2);
            
            break;
            case '%':
                if(num2==0)
                    System.out.println("ERROR: DIVISIO PER ZERO"); else
                    System.out.println(num1%num2);
            break;
         
            default:
                System.out.println("OPERACIO INCORRECTA");
                
          
        
    }
    
}
}
