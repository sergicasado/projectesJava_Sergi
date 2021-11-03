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
public class Exercici16 {
    
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        
        char op=ent.nextLine().charAt(0);
        int num1=ent.nextInt(), num2=ent.nextInt();
        
        switch (op) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if(num2!=0) System.out.println(num1/num2);
                else System.out.println("ERROR: DIVISIO PER ZERO");
                break;
            case '%':
                if(num2!=0) System.out.println(num1%num2);
                else System.out.println("ERROR: DIVISIO PER ZERO");
                break;
            default:
                System.out.println("OPERACIO INCORRECTA");
        }
    }
    
}
