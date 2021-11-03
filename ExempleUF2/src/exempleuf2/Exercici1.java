/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuf2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @Sergi Exercici1
 */
public class Exercici1 {

    public static void main(String[] args) {
        
        
        Scanner ent=new Scanner(System.in);
        int num;
        
        do {            
            System.out.println("Introdueix el número de caracters per la teva contrasenya:");
            num=ent.nextInt();
            System.out.println(" ");
            if(num <1) System.out.println("Error: El número ha de ser major que 0:");
            else break;
        } while (true);
        
        //Mostrem el resultat
        
        for (int i = 0; i < num; i++) {
  
            System.out.format("%c",retornaCaracter('A','Z'));
            
        }
    }

    
    public static char retornaCaracter() {
       
        Random r = new Random();
        
        return (char)(r.nextInt('{'-' '+1)+' ');
    }
    
    
    
    public static char retornaCaracter(char a, char b) {
        
        Random r = new Random();

        
       char temp;
        //Si b és el limit superior del rang i a l'inferior, intercanviem els seus valors.
        
        if(a<b){
            temp=a;
            a=b;
            b=temp;

        }

       
                
        
        
        
//        if(a>=b)
//        return (char)(r.nextInt(a-b+1)+b);
//        
//        else
//            
//        return(char)(r.nextInt(b-a+1)+a);

        return (char)(r.nextInt(a-b+1)+b);
        
    }
    
    
    
    
    
    
}
