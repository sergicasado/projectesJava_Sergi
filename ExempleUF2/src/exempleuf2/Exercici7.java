/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuf2;

/**
 *
 * @Sergi Exercici7
 */
public class Exercici7 {

    public static void main(String[] args) {
        
        System.out.println("Resultat="+subcadena(null,0,0));
        System.out.println("Resultat="+subcadena("test",0,-40));
        System.out.println("Resultat="+subcadena("123",3,0));
        System.out.println("Resultat="+subcadena("123",10,5));
        System.out.println("Resultat="+subcadena("1234",2,4));
        System.out.println("Resultat="+subcadena("1234",0,4));
        System.out.println("Resultat="+subcadena("1234",-90,4));
        System.out.println("Resultat="+subcadena("1234",1,5));
        System.out.println("Resultat="+subcadena("1234",1,55));
        
    }
    
    public static String subcadena(String cadena, int primer, int segon){
       //Declaració de variables
       String resultat="";
        

        //Tractament de casos especials
        
        if(cadena==null) return null;
        if(primer<0) primer=0;
        if(segon<=0 || primer>=cadena.length() || primer>=segon) return "";
        if(segon>cadena.length()) segon=cadena.length();
        
        //Tractament del cas general
        
        for (int i = primer; i < segon; i++) {
            resultat+=cadena.charAt(i);
            
            
        }
        
        
    return resultat; 
    }

}
