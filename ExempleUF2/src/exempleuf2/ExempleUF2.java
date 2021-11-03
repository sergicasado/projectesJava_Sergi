/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleuf2;
import java.util.Random;

/**
 *
 * @author alumne
 */
public class ExempleUF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r=new Random();
        int i=r.nextInt(10);
        System.out.println("Estem a NewClass"+i);
        segonMetode(6);
        
        for (int j = 0; j < 100; j++) {
           System.out.println(vaigAFerAlgo(100));
            
        }
       
        
    }
    
    public static void segonMetode(int par1) {
        
        int i=0;
        
        par1++;
        
        System.out.println("Estic aqui!!"+par1);
        
    }
    
    public static int vaigAFerAlgo(int num){
        
        Random r=new Random();
        int j= 23;

        num++;
        j++;
        
        if(num>0) return r.nextInt(num);
        else return 0;
        
         
}
    
}
