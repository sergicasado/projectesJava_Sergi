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
public class Exercici8 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        long num, copia, copiaPos;
        int longitud=0;
        boolean negatiu=false;
        int[] resultat;
        int index;
        
        //1r pas --> demanar el número a l'usuari
        System.out.println("Introduix un número enter qualsevol:");
        num=copia=ent.nextLong();
        
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);

        //2n pas --> mirem si és negatiu i ho anotem i li canviem el signe
        if(num<0){
            negatiu=true;
            num=num*-1;
        }
        //if(negatiu=num<0) num=num*-1;
        
        //? pas --> fer còpies del número
        copiaPos=num;
        
        //3r pas --> calcular la longitud i instanciar el vector
        while(num!=0){
            num=num/10;
            longitud++;
        }
        resultat=new int[longitud];
        
        //4rt pas --> obtenir els dígits i guardar-los al vector
        index=resultat.length-1;
        while(copiaPos!=0){
            resultat[index]=(int)copiaPos%10;
            copiaPos=copiaPos/10;
            index--;
        }
        
        //5nt pas --> mirar si era negatiu i canviar el signe de la 1ª posició del vector
        if(negatiu) resultat[0]=resultat[0]*-1;

        //6xt pas --> mostrar el contingut del vector
        if(copia==0){
            resultat=new int[1];
        }
        System.out.format("Els dígits del número %d són:%n", copia);
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
            
        }
    }
    
}
