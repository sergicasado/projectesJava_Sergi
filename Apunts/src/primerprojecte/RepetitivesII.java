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
public class RepetitivesII {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int num;
        
//        //Demanem el número
//        System.out.println("Introduix un enter major que 0:");
//        num=ent.nextInt();
//        
//        //Fins que el número no és major que 0 el tornem a demanar
//        while(num<=0){
//            System.out.println("Introduix un enter major que 0:");
//            num=ent.nextInt();
//        }
        
        //Anem a sustituir el while per un do_while equivalent
        do{
            System.out.println("Introduix un enter major que 0:");
            num=ent.nextInt();
        }while(num<=0);
        
        
        
        
        
    }
    
}
