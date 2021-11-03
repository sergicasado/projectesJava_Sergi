/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class peloton {
    
    public static void main(String[] args) {
        
        
        Scanner ent = new Scanner(System.in);
        
        int nCorredors=0, hora, min, sec;
        
        
        
        do {
            
        nCorredors = ent.nextInt();
        System.out.println("Numero de corredors");
        System.out.println(nCorredors);
        System.out.println("--------------------");
        
        
        
        
        hora = ent.nextInt();
        min = ent.nextInt();
        sec = ent.nextInt();
        
        System.out.println("Temps:");
        System.out.println(hora+":"+min+":"+sec);
        System.out.println("-------------------"); 
            
            
            
            
        } while (nCorredors > 1 && nCorredors < 100 && hora < 25 && min < 61 && sec < 61);
        
            
        
        
       
        
        
    }
    
    
}
