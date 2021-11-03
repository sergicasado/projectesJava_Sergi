/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici7 {
    
    public static void main(String[] args) {
        //Zona de declaració de variables 
        Scanner ent=new Scanner(System.in);
        Random r=new Random();
        int numCares, numTirades;
        int[] dau;
        
        //Demanem a l'usuari el número de cares >=4
        System.out.println("Introduix el número de cares del dau (enter >=4):");
        do {            
            numCares=ent.nextInt();
            if(numCares<4) System.out.println("Ha de ser major o igual que 4!!");
            else break;
        } while (true);
        
        //Indico la dimensió del dau
        dau=new int[numCares];
        
        //Demanem a l'usuari el número de tirades (>0)
        System.out.println("Introduix el número de tirades (enter >0):");
        do {            
            numTirades=ent.nextInt();
            if(numTirades<1) System.out.println("Ha de ser major que 0!!");
            else break;
        } while (true);
        
        //Tirem el dau i comptem les aparicions de cada cara
        for (int i = 0; i < numTirades; i++) {
            
            //Simulem la tirada del dau
            int tirada=r.nextInt(numCares);
            
            //Mostrem a l'usuari quina cara ha sortit
            System.out.format("Ha sortit la cara %d.%n", tirada + 1);
            
            //Anem a incrementar el número d'aparicions de la cara que ha sortit
            dau[tirada]++;  //dau[tirada]=dau[tirada]+1;
        }
        
        //Finalment mostrem el número total d'aparicions de les caselles
        System.out.println("Total d'aparicions:");
        for (int i = 0; i < dau.length; i++) {
            System.out.format("La cara %d ha sortit %d vegades.%n", i+1,dau[i]);
            
        }
    }
    
    
}
