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
public class DesembalseSenseVector {
    
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
        int sumaAltures=0;
//        for (int i = 0; i < distancia-1; i++) {
//            sumaAltures+=ent.nextInt();
//        }
        int i = 0;
        while( i < distancia-1) {
            sumaAltures+=ent.nextInt();
             i++;
        }
        int altPoble=ent.nextInt();
        
        System.out.println(altPoble*(distancia-1)-sumaAltures);
    }

    private static boolean elementFinal() {
        return distancia==0;
    }

    
}
