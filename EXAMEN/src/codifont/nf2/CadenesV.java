/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf2;

/**
 *
 * @author profe
 */
public class CadenesV {
    
    public static void main(String[] args) {
        
        System.out.println("1234523".lastIndexOf('3'));
        
        System.out.println("123456".charAt("123456".indexOf('4')));
        
        System.out.println("1234523".indexOf('6'));
        
        System.out.println("1234523".indexOf('3')); //estos retornen 2
        System.out.println("1234523".indexOf('3', -3));
        System.out.println("1234523".indexOf('3', 0));
        System.out.println("1234523".indexOf('3', 1));
        System.out.println("1234523".indexOf('3', 2));
        System.out.println("1234523".indexOf('3', 3)); //estos retornen 6
        System.out.println("1234523".indexOf('3', 4)); 
        System.out.println("1234523".indexOf('3', 5)); 
        System.out.println("1234523".indexOf('3', 6)); 
        System.out.println("1234523".indexOf('3', 7)); //estos retornen -1
        System.out.println("1234523".indexOf('3', 8)); 
        

        
    }
    
}
