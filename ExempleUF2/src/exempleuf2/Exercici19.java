/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleuf2;

/**
 *
 * @Sergi Exercici19
 */
public class Exercici19 {

    public static void main(String[] args) {
//      System.out.println("ADASAEEDAED".replaceAll("A","E"));

    }

    public static String reemplassaMultiplesCaracters(String cadena, char b, char c){
       
        String resultat="";

        if(cadena==null || cadena.isEmpty() ) return cadena;
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) ==b) resultat+=c; 
            else resultat+=b;
            
            
        }
        
        
        
        
        return null;
        
    }
    
    
    
    
}
