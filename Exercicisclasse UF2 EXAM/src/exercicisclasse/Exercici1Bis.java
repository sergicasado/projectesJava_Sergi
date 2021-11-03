/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici1Bis {
    
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
//            char c=retornaCaracter('Z', 'A');
            System.out.format("%c", c);
        }
        System.out.println("");
    }
    
    //Métode que retorna aleatòriament un caracter entre 2 rebuts com a paràmetre
    static char retornaCaracter(char ini, char fi){
        char tmp='f';
        Random r=new Random();
        
        if(ini>fi){
            tmp=ini;
            ini=fi;
            fi=tmp;
        }
        char c=(char)(r.nextInt(fi-ini+1)+ini);
        return c;
    }
    
    //Métode que retorna aleatòriament un caracter entre ' ' i '}'
    static char retornaCaracter(){
        Random r=new Random();
        char c=(char)(r.nextInt('}'-' '+1)+' ');
        return c;
    }
   
}
