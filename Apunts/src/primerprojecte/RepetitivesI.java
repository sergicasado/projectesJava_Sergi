/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class RepetitivesI {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int cont=1;
        int passos;
        
        System.out.println("Quantes iteracions vols fer?:");
        passos=ent.nextInt();
/*        
        //Estructura del while
        while(  cont <= passos    ){
            System.out.println("Estic dins del while i cont val "+cont);
            cont++;
        }
        cont=1;
        //El mateix while utilitzant break
        while(true){
            if(!(cont <= passos)) break;
            System.out.println("Estic dins del while i cont val "+cont);
            cont++;
        }
  */
        
        //Exemple del while usant continue
        while(  cont <= passos    ){
            cont++;
            System.out.println("cont val "+cont);
            if(cont%2==0) System.out.println("cont és parell");
        }
        
        cont=1;
        while(  cont <= passos    ){
            cont++;
            System.out.println("cont val "+cont);
            if(cont%2!=0) continue;
            System.out.println("cont és parell");
        }
        
    }
    
}
