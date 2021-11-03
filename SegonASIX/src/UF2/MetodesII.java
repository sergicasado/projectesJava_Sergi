/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MetodesII {

    public static void main(String[] args) {
        
        int a=10, b, c, d;
     
        
       
        sumaUn(a);
        System.out.println(a);
        

        //Assignem a 
        MetodesII objecte = metode();

    }

    // static void no retorna res
    public static MetodesII metode() {

        //Scanner ent = new Scanner(System.in);
        return new MetodesII();

    }

    //Retorna int num + 1
    public static int sumaUn(int num) {

        return num + 1;

    }
    
    
    public static int sumaUnbis(int num){
        
       num=num+1;
       return num;
    }

    public static char caracterEn(String cadena, int index) {

        return cadena.charAt(index);

    }

}
