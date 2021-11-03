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
public class Exercici9 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        Random r=new Random();
        int num;
        char lletraAleatoria;
        int[] comptadors=new int['Z'-'A'+1];
        
        //1r pas --> demanar a l'usuari un número enter positiu
        do {         
            System.out.println("Introduix un enter positiu (major que 0):");
            num=ent.nextInt();
            if(num<=0) System.out.println("Ha de ser positiu!!");
            else break;
        } while (true);
        
        //2n pas --> generem les num lletres aleatòries
        System.out.println("");
        for (int i = 0; i < num; i++) {  //for (int i = 1; i <= num; i++) {
            //Generem una lletra entre la 'A' i la 'Z' aleatòriament, i la mostrem
            lletraAleatoria=(char)(r.nextInt('Z'-'A'+1)+'A');
            System.out.print(lletraAleatoria);
            
            //Incrementem el comptador corresponent a la lletra obtinguda
            comptadors[lletraAleatoria-'A']++;
        }
        
        //3r pas --> mostrem les aparicions de cada lletra
        System.out.println("");
        for (int i = 0; i < comptadors.length; i++) {
            if(comptadors[i]!=0){
                System.out.format("%nLa lletra %c ha aparegut %d vegades.", 'A'+i, comptadors[i]);                
            }
            
        }
        System.out.println("");
    }
    
}
