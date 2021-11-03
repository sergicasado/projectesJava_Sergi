/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

/**
 *
 * @author profe
 */
public class Format {
    
    public static void main(String[] args) {
        
        double val=5.6789;
        
        System.out.format("%f  -----  %g %n", val, val);
        System.out.format("%f  -----  %1$+010.2f %n", val);
    }
    
}
