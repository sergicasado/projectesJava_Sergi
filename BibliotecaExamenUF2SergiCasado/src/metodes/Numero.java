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
public class Numero {

    
    public static void main(String[] args) {
        
        
        System.out.println(comptaDivisibles(0,1,2,3));
        System.out.println(comptaDivisibles(1,1,2,3));
        System.out.println(comptaDivisibles(-2,1,2,3));
        System.out.println(comptaDivisibles(4,1,2,3));
        System.out.println(comptaDivisibles(4));
        System.out.println(comptaDivisibles(-4,null));
        
        
        
    }
    
    

    public static int comptaDivisibles(int num1, int... num) {
        

        int cont = 0;

        if (num1 == 0) {
            return 0;
        }
        if (num == null || num.length == 0) {
            return 0;
        }
        

        for (int i = 0; i < num.length; i++) {

            if (num[i] % num1 == 0) {
                cont++;
            } else {
                cont = cont;
            }

        }

        return cont;

    }
    
    
   

}
