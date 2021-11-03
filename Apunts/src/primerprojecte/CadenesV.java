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
public class CadenesV {
    
    public static void main(String[] args) {
        
        String cad="Anem a fer trossos";
        
        System.out.println(cad.substring(11));
        
        System.out.println(cad.substring(11, 14));
        
        System.out.println(cad.substring(0, cad.length()));
        
        System.out.println(cad.substring(cad.indexOf(" ")+1, cad.lastIndexOf(" ")));

        System.out.println(cad.substring(cad.length()));
        
        System.out.println(cad.substring(cad.length(), cad.length()));
        
        String dni="12345678";
        
        int num=Integer.parseInt(dni);
        
        System.out.println(num%23);
        
        
        
    }
    
}
