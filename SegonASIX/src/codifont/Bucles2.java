/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;
import java.util.Scanner;

/**
 *
 * @author sergicp
 */
public class Bucles2 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int num=0, valor=1;
        
        
        
        while (valor!=0) {
            
             System.out.println("Introdueix un enter");
        valor = ent.nextInt();
        num=num+valor;
            
        }
        System.out.println(num);
        
        
        
        
       
        
        
        
    }
    
}
