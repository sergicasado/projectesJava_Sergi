/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Desembalse {
    
    //Vars globals
    static Scanner ent = new Scanner(System.in);
    static int distancia;
    
    public static void main(String[] args) {
        
        do{
            tractarElement();
        }while(!elementFinal());
        
        
    }

    private static void tractarElement() {
        //Primer que res llegim la distancia
        distancia=ent.nextInt();
        
        //Si estem a l'element final surtim
        if(elementFinal()) return;
        
        //Anem a tractar l'element/embalsament actual
        int[] metros=new int[distancia-1];
        for (int i = 0; i < metros.length; i++) {
            metros[i]=ent.nextInt();
        }
        int altPoble=ent.nextInt();
        int resultat=0;
        for (int i = 0; i < metros.length; i++) {
            resultat += (altPoble-metros[i]);
        }
        System.out.println(resultat);
    }

    private static boolean elementFinal() {
        return distancia==0;
    }

    
}
