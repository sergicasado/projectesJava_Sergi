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
public class PuntosDeSilla {
    
    //Declaració de variables globals
    static Scanner ent = new Scanner(System.in);
    static int numFiles, numColumnes;
    static int[][] matriu;
    
    public static void main(String[] args) {
        
        //Recorregut d'una seqüència de matrius 
        do{
            tractarElement();
        }while(!elementFinal());
        
    }


    private static void tractarElement() {
        numFiles=ent.nextInt();
        numColumnes=ent.nextInt();
        if(elementFinal()) return;
        //instanciem la matriu
        matriu=new int[numFiles][numColumnes];
        
        //Omplim la matriu des de l'entrada de dades
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=ent.nextInt();
            }
        }
        
        //Per cada casella de la matriu mirem si és punt de silla
        //Búsqueda de punts de silla dins de la seqüència de caselles de la matriu
        boolean hiHaPunt=false;
        for (int i = 0; i < matriu.length && !hiHaPunt; i++) {
            for (int j = 0; j < matriu[i].length && !hiHaPunt; j++) {
                //Actualitzar el hiHaPunt
                //Busquem màxim i mínim de fila i columna
                int minF, maxF, minC, maxC;
                minF=maxF=minC=maxC=matriu[i][j];
                //Busquem max i min de la fila
                for (int k = 0; k < matriu[i].length; k++) {
                    if(matriu[i][k]>maxF) maxF=matriu[i][k];
                    if(matriu[i][k]<minF) minF=matriu[i][k];
                }
                //Busquem max i min de la columna
                for (int k = 0; k < matriu.length; k++) {
                    if(matriu[k][j]>maxC) maxC=matriu[k][j];
                    if(matriu[k][j]<minC) minC=matriu[k][j];
                }
                //Mirem si és o no punt de silla
                hiHaPunt=(matriu[i][j]==minF && matriu[i][j]==maxC) || (matriu[i][j]==maxF && matriu[i][j]==minC); 
            }
        }
        if(hiHaPunt) System.out.println("SI");
        else System.out.println("NO");
        
    }

    private static boolean elementFinal() {
        return  numFiles==0 || numColumnes==0;
    }

 
    
}
