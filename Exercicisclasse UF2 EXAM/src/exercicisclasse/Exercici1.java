/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Random;
import java.util.Scanner;
import static metodes.Cadena.buscaCadena;

/**
 *
 * @author profe
 */
public class Exercici1 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        
        do{
            System.out.println("Introduix un enter major que 0:");
            num=ent.nextInt();
            if(num<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);
        
        System.out.println("Els caràcters generats són:");
        for (int i = 0; i < num; i++) {
            char c=retornaCaracter();
            System.out.format("%c", c);
        }
        System.out.println("");
        
        
        buscaCadena("","",7);
    }
    
    //Métode que retorna aleatòriament un caracter entre ' ' i '}'
    static char retornaCaracter(){
        Random r=new Random();
        char c=(char)(r.nextInt('}'-' '+1)+' ');
        return c;
    }
    
}
