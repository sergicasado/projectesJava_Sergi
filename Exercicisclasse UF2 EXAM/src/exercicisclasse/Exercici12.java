/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Arrays;
import java.util.Scanner;
import static metodes.Cadena.buscaCadena;
import static metodes.Cadena.buscaCadenaMultiple;
import static metodes.Cadena.llegirLinies;

/**
 *
 * @author profe
 */
public class Exercici12 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String cadena="", subcadena;
        int cont=0, index=0;
        
        //Demanem la introducció d'un text acabat en punt
        cadena=llegirLinies("Introduix un text acabat en punt:",'.');
        
        //Demanem la introducció d'un text d'una sola línia
        System.out.println("Introduix un segon text a buscar dins del primer:");
        subcadena=ent.nextLine();
        
        System.out.println("La subcadena apareix a les posicions:");

        do{
            index=buscaCadena(cadena,subcadena,index);
            if(index==-1) break;
            cont++;
            System.out.println(index);
            //Incrementem l'index per evitar el bucle infinit
            index++;
        }while(true);
        
        
        System.out.format("%nHa aparegut %d vegades.%n", cont);
        
        System.out.println(Arrays.toString(buscaCadenaMultiple(cadena, subcadena)));
//        System.out.println(Arrays.toString(buscaCadenaMultiple(null, subcadena)));
//        System.out.println(Arrays.toString(buscaCadenaMultiple(cadena, null)));
//        System.out.println(Arrays.toString(buscaCadenaMultiple(null, null)));
        
        
    }
    
    
    
    
}
