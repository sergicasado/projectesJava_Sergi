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
public class Exercici19 {
    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        int any;
        int a,b,c,d,e,n;
        System.out.println("Introdueix un any per calcular la data de Pasqua");
        
        any=escaner.nextInt();

         a=any %19;
         b=any %4;
         c=any %7;
         d=(19*a+24)%30;
         e=(2*b+4*c+6*d+5)%7;
         n=(22+d+e);
        
        if (n<=31) {
           
            System.out.println("A l'any" +any+ "Pasqua cau el dia" +n+ "de Març");
           
        }else System.out.println("A l'any " +any+ " Pasqua cau el dia " +(n-31)+ " d'Abril");
           
        
               
    }
    
}
