/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici3 {
    
    public static void main(String[] args) {
        //Declaració de variables del main
        int alumne, mp, nota;
        final int F=30, C=7, P=10;
        
//         //Demanem quin alumne vol consultar
//        do{
//            System.out.format("\nIntroduix l'alumne a consultar (0-%d):\n", F-1);
//            alumne=entrada.nextInt();
//        }while(alumne<0 || alumne>=F);
//
//        //Demanem quin mòdul vol consultar
//        do{
//            System.out.format("Introduix el mòdul a consultar (0-%d):\n", C-1);
//            mp=entrada.nextInt();
//        }while(mp<0 || mp>=C);
//
//        //Demanem quina nota vol consultar
//        do{
//            System.out.format("Introduix la nota a consultar (0-%d):\n", P-1);
//            nota=entrada.nextInt();
//        }while(nota<0 || nota>=P);

        //Demanem un valor entre 2 inventats
        alumne=forsarValorEntre2Enters("Introduix un número entre 1 i 15:", 1, 15);

        //Demanem quin alumne vol consultar
        alumne = demanaValor("l'alumne", F);

        //Demanem quin mòdul vol consultar
        mp = demanaValor("el mòdul", C);

        //Demanem quina nota vol consultar
        nota = demanaValor("la nota", P);
        
    }
    
    //Rep una cadena i un enter i mostra la cadena a un missatge, i itera fins 
    //que no introduim un enter entre 0 i el numero
    public static int demanaValor(String cadena, int numero){
        //Declaració de variables del mètode demanaValor
        Scanner entrada = new Scanner(System.in);
        int valor=0;
                
        do{
            System.out.format("\nIntroduix %s a consultar (0-%d):\n", cadena, numero-1);
            valor=entrada.nextInt();
        }while(valor<0 || valor>=numero);
    
        return valor;
    }
    
    public static int forsarValorEntre2Enters(String cadena, int v1, int v2){
        //Declaració de variables del mètode 
        Scanner entrada = new Scanner(System.in);
        int valor=0;
                
        do{
            System.out.format("%s%n", cadena);
            valor=entrada.nextInt();
            if(valor<v1 || valor>v2) System.out.println("Valor incorrecte!!");
            else break;
        }while(true);
    
        return valor;
    }
    
    
    
}
