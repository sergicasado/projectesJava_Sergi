package pactiques.uf2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergi
 */
public class Ex7 {
    
    public static void main(String[] args) {
        
        System.out.println(subcadena(null,0,0));
        System.out.println(subcadena("text",1,-34));
        System.out.println(subcadena("text",-2,2));
        System.out.println(subcadena("text",2,4));
        System.out.println(subcadena("text",1,3));
     
        
        
    }
    
    public static String subcadena(String cadena, int primer, int segon){
        
        if(cadena==null) return null;
        if(primer < 0) primer = 0;
        if(segon <= 0) return cadena = "";
        if(primer >= cadena.length()) return cadena = "";
        if(primer >= segon) return cadena = "";
        if(segon > cadena.length()) segon = cadena.length();
         
        return cadena.substring(primer,segon);
    }
    
}
