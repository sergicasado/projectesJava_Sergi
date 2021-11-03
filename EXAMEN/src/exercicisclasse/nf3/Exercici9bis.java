/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici9bis {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int n;
        int[] cont=new int['Z'-'A'+1];
        String lletres="";
        
        //Demanar n a l'usuari
        do {            
            System.out.println("Introduix un enter positiu:");
            n=ent.nextInt();
            if(n<1) System.out.println("Ha de ser >0!!");
            else break;
        } while (true);
        
        //Generem les n lletres i comptem
        System.out.println("Caràcters aleatoris:\n");
        for (int i = 0; i < n; i++) {
            
            //Generem un caracter entre la 'A' i la 'Z'aletòriament
            char c=(char)(r.nextInt('Z'-'A'+1)+'A');
            System.out.print(c);
            
            //Concatenem el caràcter a la cadena de lletres
            lletres=lletres+c;
            
            //Compto que ha sortit la lletra c
            cont[c-'A']=cont[c-'A']+1;
        }
        System.out.println();
        
        //Mostrem lo resultat
        for (int i = 0; i < lletres.length(); i++) {
            char c=lletres.charAt(i);
            if(cont[c-'A']!=0){
                System.out.format("El caràcter %c ha sortit %d vegades.%n", c, cont[c-'A']);
                //Poso el comptador a 0 per a que només mostre la lletra la primera vegada que apareix
                cont[c-'A']=0;
            }
            
        }
    }
    
}
