/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;


/**
 *
 * @author alumne
 */
public class Data {
    
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
    
    

    public static int[] retornaBixestos (int[] vector){
        
        if(vector == null) return null;
        if(vector.length == 0) return vector;
       
        //if(vector.length > 0);
        
        
        
        
        
        
        return vector;
    }
            
            
    
    
    
    
    
    
}
