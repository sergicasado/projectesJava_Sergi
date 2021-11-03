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
public class Exercici18 {
    
    public static void main(String[] args) {
        
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int[][] matriu;
        int valor;
        int i,j;
        int n;
        
        //Demanem la dimensió a l'usuari
        do {            
            System.out.println("Introduix un número enter positiu i imparell (>0):");
            n=ent.nextInt();
            if(n<1 || n%2==0) System.out.println("Ha de ser positiu i imparell!!");
            else break;
        } while (true);
        matriu=new int[n][n];
        
        
        //Valors inicials
        valor=1;
        i=0;
        j=matriu.length/2;
        while(valor<=matriu.length*matriu.length){
            //Escrivim el valor a la casella corresponent i l'incrementem
            matriu[i][j]=valor++;
            
            //Passem a la següent posició, fent una còpia de la posició actual
            int iAntiga=i;
            int jAntiga=j;
            
            //Fila anterior
            i--;
            if(i<0) i=matriu.length-1;
            //Columna anterior
            j--;
            if(j<0) j=matriu.length-1;
            
            //Comprovem si la nova casella ja està ocupada, per canviar la 
            //posició en cas afirmatiu
            if(matriu[i][j]!=0){
                //Conservem la columna i passem a la fila següent
                j=jAntiga;
                i=iAntiga+1;
                if(i==matriu.length) i=0;
            }
        }
        
        //Omplim i mostrem la matriu
          System.out.println("Matriu generada:");   
        for (int k = 0; k < matriu.length; k++) {
            for (int l = 0; l < matriu[k].length; l++) {
                System.out.format("%-5d",matriu[k][l]);
            }
            System.out.println("");
        }
        //Nota: cada fila, columna i diagonal suma: n*(n*n+1)/2 --> este valor rep el nom de constant màgica
    }
    
}
