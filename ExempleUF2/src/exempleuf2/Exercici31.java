/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exempleuf2;

/**
 *
 * @Sergi Exercici31
 */
public class Exercici31 {

    public static void main(String[] args) {
        
    }
    
    public static double potenciaRec(double base, int n){
        
        if(n==0) return 1;
        if(n >0) return potenciaRec (base, n-1);
        if(n <0) return potenciaRec (1/base,n*-1);
        
        else return 0;
    }

}
