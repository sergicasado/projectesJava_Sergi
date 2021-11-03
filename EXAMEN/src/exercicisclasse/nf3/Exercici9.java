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
public class Exercici9 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        int n;
        int[] cont=new int['Z'-'A'+1];
        
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
            
            //Compto que ha sortit la lletra c
            cont[c-'A']=cont[c-'A']+1;
        }
        
        //Mostrem lo resultat
        for (int i = 0; i < cont.length; i++) {
            
            if(cont[i]!=0) System.out.format("El caràcter %c ha sortit %d vegades.%n", 'A'+i, cont[i]);
            
        }
    }
    
}
