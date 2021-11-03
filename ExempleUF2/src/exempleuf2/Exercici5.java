/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuf2;

/**
 *
 * @Sergi Exercici5
 */
public class Exercici5 {

    public static void main(String[] args) {
        
        System.out.println(bixest(100));
        System.out.println(bixest(728));
        System.out.println(bixest(5124));
        System.out.println(bixest(35896));
        System.out.println(bixest(251300));
        
        
    }

    public static boolean bixest(int any){
        
        
        
        if(any<1584) return false;
        if(any%400 == 0) return true;
        if(any%4 == 0 && any%100 !=0) return true;
        else return false;
        

    }
    
    
    
}
