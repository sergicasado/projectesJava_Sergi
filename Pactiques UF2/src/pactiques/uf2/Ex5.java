/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactiques.uf2;

/**
 *
 * @author Sergi
 */
public class Ex5 {
    public static void main(String[] args) {
        System.out.println(esbixest(251300));
        
    }
    
    public static boolean esbixest(int num){
        if (num<=1584) {
            return false;
        }
        if (num%400==0 || (num%4==0 && num%100!=0)) {
            return true;
        }else{
        return false;
        }
        
    }
}
