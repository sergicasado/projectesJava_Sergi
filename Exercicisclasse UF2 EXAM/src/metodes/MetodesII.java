/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class MetodesII {
    
    public static void main(String[] args) {
        int a, b, c, d;
        
        a=b=c=d=1;
        //a++;
        a=sumaUnBis(c);
        //b=sumaUnBis(10);
        
        System.out.format("a val %d i c val %d %n", a, c);
        
        
        
//        new String().charAt(1);
//        MetodesII objecte=metode();
        
        
    }
    
    
    
    public static MetodesII metode(){
        //Scanner ent=new Scanner(System.in);
        
        return new MetodesII();

    }
    
    //Retorna el paràmetre num més 1
    public static int sumaUn(int num){
        
        return num+1;
    }
    
    //Retorna el paràmetre num més 1
    public static int sumaUnBis(int num){
        num=num+1;
        return num;
    }





    //Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
    //The first char value of the sequence is at index 0, 
    //the next at index 1, and so on, as for array indexing.
    public static char caracterEn​(String cadena, int index){
        return cadena.charAt(index);
    }
    
    
}


