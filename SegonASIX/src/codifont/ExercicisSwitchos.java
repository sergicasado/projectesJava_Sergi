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
public class ExercicisSwitchos {
    public static void main(String[] args) {
        
        
        int num=5;
        System.out.println("Introdueix un número entre 1-5");
        Scanner ent=new Scanner(System.in);
        num=ent.nextInt();
        
        
        
        //El switch anirà pasant cas per cas fins no trobar un break.
        //Default: El que pasarà si no s'executa cap dels casos.
       
        switch (num){
            case 0:
                System.out.println("Has introduït el zero");
                break;
            case 1:
                System.out.println("Has introduït l'u");
                break;
            case 2:
                System.out.println("Has introduït el dos");
                break;
            case 3:
                System.out.println("Has introduït el tres");
                break;
            case 4:
                System.out.println("Has introduït el quatre");
                break;
            case 5:
                System.out.println("Has introduït el cinc");
                
            default:
                System.out.println("No has introduït cap número entre l'u i el cinc");
                
                
                
        }
//        if(num==0 || num==2 || num==4){
//            System.out.println("El nombre és parell");
//           
//        }else System.out.println("El nombre és imparell");
//        
        //El mateix usant el switch
     
        switch (num) {
            case 0: 
            case 2:
            case 4: System.out.println("És parell");
                
                break;
                
            case 1: 
            case 3:
            case 5: System.out.println("És imparell");
                
                break;    
        }
        
    }
    
}
