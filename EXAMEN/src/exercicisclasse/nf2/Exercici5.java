/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici5 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="", buscar;
        int cont=0;
        int index=0;
        
        //Demanem a l'usuari que escrigue un text acabat en punt
        System.out.println("Introduix un text acabat en punt ('.'):");
        do {            
            String linia=ent.nextLine().trim();
            text+=linia+"\n";    //text=text+linia+"\n";
            if(linia.endsWith(".")) break;
        } while (true);
        
        //Demanem a l'usuari un segon text a buscar
        System.out.println("Introduix un text no buit:");
        do {            
            buscar=ent.nextLine().trim();
            if(buscar.isEmpty()) System.out.println("No pot ser la cadena buida!!");
        } while (buscar.isEmpty());
        
        //Recorrem la línia saltant d'aparició en aparició del caracter buscat
        do { 
            index=text.indexOf(buscar, index);
            if(index!=-1){
                cont++;
                index++;    //molt important per resoldre el bucle infinit
            }
            else break;  
        } while (true);
        System.out.format("El text '%s' apareix %d vegades %ndins del text: %n%s%n", buscar, cont, text);
        
        
    }
    
}
