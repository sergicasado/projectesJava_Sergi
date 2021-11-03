/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici5 {
    
    public static void main(String[] args) {
        //Declaració de variables
        final int QUANTITAT=3;
        int[] vector=new int[QUANTITAT];
        Scanner ent=new Scanner(System.in);
        int suma=0, valor, index=0;
        double mitjana;
        
        //Introducció dels valors per part de l'usuari i els guardem la vector.
        //Aprofitem per anar-los sumant
        System.out.format("%nIntroduix %d valors enters no negatius (>=0):%n", vector.length);
        do{
            System.out.format("Introducció del valor nº %d:%n", index+1);
            valor=ent.nextInt();
            if(valor<0){
                System.out.println("Ha de ser no negatiu!!");
                continue;
            }
            vector[index++]=valor;
            suma+=valor;
        }while(index<vector.length);
        
        //Calculem la mitjana
        mitjana=(double)suma/vector.length;
        
        //Recorrem el vector i mostrem els elements majors o oiguals que la mitjana
        System.out.println("\nEls valors majors o iguals que la mitjana són:");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>=mitjana) System.out.format("%d ", vector[i]);
        }
        System.out.println("");
    }
    
}
