/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiques.uf2;

/**
 *
 * @author Sergi
 */
public class Ex11 {
    
    public static void main(String[] args) {
        
        System.out.println(buscaCadena("null","null",0));
        
    }
    
    public static int buscaCadena(String cadena, String cadena2, int num){
        
        if((cadena.isEmpty() && cadena2.isEmpty()) || (cadena.isEmpty() || cadena2.isEmpty())) return -1;
        if(num<0) num = 0;
        if(cadena2.isEmpty()){            
            if(num<cadena2.length()) return num; else return cadena.length();            
        }
        if(num>=cadena.length()) return -1;
        
        
        
        
        
        return cadena.indexOf(cadena2, num);
    }
    
}
