/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import static exercicisclasse.Exercici1.retornaCaracter;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici2 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        
        do{
            System.out.println("Introduix un enter major que 0:");
            num=ent.nextInt();
            if(num<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);
        
        mostraVarisCaracters(num);
        
        System.out.println("");
    }
    
    
    
    
    //Mostra quantitat caràcters aleatoris entre ' ' i '}' 
    public static void mostraVarisCaracters(int quantitat){
        for (int i = 0; i < quantitat; i++) {
            System.out.format("%c", retornaCaracter());
        }        
    }
    
}
