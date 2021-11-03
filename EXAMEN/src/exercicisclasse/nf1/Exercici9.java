/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *9. Fes un programa en Java que demane a l'usuari la introducció de parelles de 
 * números enters fins que siguen iguals o un de ells sigui zero. Al final ha 
 * d'imprimir la suma i la mitjana dels números introduïts. Afegit: al final que 
 * mostre també el producte dels números diferents de zero.

 * @author profe
 */
public class Exercici9 {
    
    public static void main(String[] args) {
        //Declaració de variables 
        Scanner ent = new Scanner(System.in);
        int num1,       //guardem el primer número de la parella introduïda
            num2,       //guardem el segon número de la parella introduïda
            suma=0,     //guardem la suma acumulada dels valors introduïts
            producte=1, //guardem el producte acumulat dels valors introduïts i diferents de zero
            comptador=0;//guardar la quantitat de números introduïts
        
        //Bucle que llig i tracta les parelles de números
        do {            
            System.out.println("Introduix un parell de números enters (iguals o algun a 0 per finalitzar)");
            num1=ent.nextInt();
            num2=ent.nextInt();
            suma=suma+num1+num2;    //suma+=num1+num2;
            comptador+=2;           //comptador=comptador+2;
            //El producte el farem evitant els zeros
            if(num1!=0) producte*=num1;
            if(num2!=0) producte*=num2;
            
            //Si sortim del bucle mostro la suma, etc..
//            if(num1==num2 || num1==0 || num2==0){
//                System.out.println("La suma és "+suma);
//                System.out.println("El producte és "+producte);
//            }
        //} while (num1!=num2 && num1!=0 && num2!=0);
        //Condició per a sortir del bucle: que siguen iguals o un de ells sigui zero
        //Condició per a permanèixer dins del bucle: !(que siguen iguals o un de ells sigui zero)
        } while (!(num1==num2 || num1==0 || num2==0));
        
        //Anem a mostrar el resultat
        System.out.println("La suma és "+suma);
        System.out.println("El producte és "+producte);
        //System.out.println("La mitjana és "+ (((double)suma/comptador)));
        //System.out.println("La mitjana és "+ (suma*1.0/comptador));
        System.out.println("La mitjana és "+ ((suma+0.0)/comptador));
    }
    
}
