/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

/**
 *
 * @author profe
 */
public class MetodesV {
    
    public static void main(String[] args) {
        
//  System.out.println(metode1());
        System.out.println(metodeRecursiu(-5));
  
    }
    
    public static int metode1(){
        return metode2()+25;
    }
    
    public static int metode2(){
        return 3;
    }
    
    
    public static int metodeRecursiu(int numero){
        if(numero==0) return 5;
        return metodeRecursiu(numero+1)*2;
        
    }
    
    
}
