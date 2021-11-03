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
public class Exercici6 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="";
        //Caracters considerats separadors dins del següent String
        String separadors=" ,.;'\n";
        //Variable que mos dirà si estem recorrent o no una paraula 
        //(inicialment a false)
        boolean enParaula=false;
        //Comptador de paraules, inicialitzat a 0
        int cont=0;
        
        //Demanem a l'usuari que escrigue un text acabat en punt
        System.out.println("Introduix un text acabat en punt ('.'):");
        do {            
            String linia=ent.nextLine().trim();
            text+=linia+"\n";    //text=text+linia+"\n";
            if(linia.endsWith(".")) break;
        } while (true);
        
        
        //Recorrem la línia caràcter a caràcter i comprovem l'estat, etc...
        for (int i = 0; i < text.length(); i++) {
            
            //Mirem si el caràcter actual és o no separador i en cas afirmatiu
            //actualitzem el booleà a false
            if(separadors.indexOf(text.charAt(i))!=-1) enParaula=false; 
            else{   //Si entrem aquí significa que el caràcter actual no és separador
                    //Si no estavem en paraula comptem la nova paraula
                    if(!enParaula) cont++;
                    //Actualitzo el booleà a true en qualsevol cas
                    enParaula=true;
            } 
        }
        System.out.format("El text %n'%s'%n conté %d paraules.%n", text, cont);
        
        
    }
    
}
