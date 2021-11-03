/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

/**
 *
 * @author profe
 */
public class Exercici6 {
    
    public static void main(String[] args) {
        int num=5;
        if(primer(num)) System.out.println("Si és primer");
        else System.out.println("No és primer");
    }
    
    public static boolean primer(int num) {
        int contDivisors=0;
        
        //Si el número és menor que 2 li diem que no és primer
        if(num<2) return false;
        else{   //Tractem els números >=2
            
            for (int i = 1; i < num && contDivisors<=1; i++) {
                if(num%i == 0) contDivisors++;
            }
            
            if(contDivisors==1) return true;
            else return false;
        }
    }
    
    
}
