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
public class CadenesI {
    
    public static void main(String[] args) {
        //Declaració de variables
        String nom="Bon dia"+", com esteu?"+"Anem a estudiar els Strings...";
        
        //Podem consultar la longitud d'una cadena --> length()
        //System.out.println(nom.length());
        
        int longitud="Hola".length();
        nom="Un altra cadena";
        
        //Podem accedir a una posició de la cadena i vore quin caracter conté 
//        System.out.println("12345".charAt(0));
//        System.out.println("12345".charAt(1));
//        System.out.println("12345".charAt(2));
//        System.out.println("12345".charAt(3));
//        System.out.println("12345".charAt(4));
        //System.out.println("12345".charAt(5));
        //System.out.println("12345".charAt(-1));

        //Obtenir la cadena d'esquerra a dreta saltant de 2 en 2
        String saltar="", saltar1="";
        int i = 0;
        //Anem a recorrer una cadena usant un for, d'esquerra a dreta
        for (; i < "12345".length(); i=i+2) {
            saltar=saltar+"12345".charAt(i);
            saltar1="12345".charAt(i)+saltar1;
            //System.out.println("12345".charAt(i));
            
        }
        
        System.out.println(saltar);
        System.out.println(saltar1);
        
        //Obtenir la cadena de dreta a esquerra saltant de 2 en 2
        saltar="";
        
        i = "12345".length()-1;
        //Anem a recorrer una cadena usant un for, dreta a esquerra
        for (; i >= 0 ; i=i-2) {
            
            saltar=saltar+"12345".charAt(i);
            //System.out.println("12345".charAt(i));
            
        }
        
        //System.out.println(saltar);
        
    }
    
}
