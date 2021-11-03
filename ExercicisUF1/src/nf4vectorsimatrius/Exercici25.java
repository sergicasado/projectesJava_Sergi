/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4vectorsimatrius;

import java.util.Scanner;

/**
 * 25. Escriu un programa en Java que:
 *
 * - demane a l’usuari la introducció d’un número enter positiu, forçant-ho, que
 * serà la dimensió d’un vector d’enters. - li donem la dimensió indicada
 * anteriorment al nostre vector. - a continuació li demanem a l’usuari parelles
 * de números enters, de manera que el primer ha de correspondre en una posició
 * (user-friendly) del vector, i la segona en un número enter positiu qualsevol.
 * La idea és que omplirem la posició del vector en el valor, ambdós indicats
 * per l’usuari. - el programa finalitzarà quan tinguem tot el vector omplit en
 * els valors indicats per l’usuari (compte, ja que pot repetir una posició). -
 * abans de sortir mostrem el contingut del vector.
 *
 * @author profe
 */
public class Exercici25 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[] vector;   //vector on guardarem els valors 
        int cont = 0;     //comptador de caselles plenes
        int dimensio;   //grandària del vector indicada per l'usuari
        int posicio, //per accedir a les caselles del vector 
                valor;      //que introduirem a la casella seleccionada

        //Demanem la dimensió, forçant a que sigue >0
        do {
            System.out.println("Introduix un enter positiu (>0, dimensió del vector):");
            dimensio = ent.nextInt();
            if (dimensio <= 0) {
                System.out.println("Ha de ser un enter major que 0!!");
            } else {
                break;
            }
        } while (true);

        //Instanciem el vector en la dimensió indicada
        vector = new int[dimensio];

        //Demanem parelles de números fins omplir el vector
        //while(cont<dimensio){
        while (true) {
            //Demano una posicio user-friendly (1-dimensio)
            do {
                System.out.format("Introduix un enter entre 1 i %d:%n", dimensio);
                posicio = ent.nextInt();
                if (posicio < 1 || posicio > dimensio) {
                    System.out.format("Ha de ser un enter entre 1 i %d!!%n", dimensio);
                } else {
                    break;
                }
            } while (true);
            
            //Demano el valor (enter positiu) a introduir a la posicio seleccionada
            do {
                System.out.println("Introduix un enter positiu (>0):");
                valor = ent.nextInt();
                if (valor <= 0) {
                    System.out.println("Ha de ser un enter major que 0!!");
                } else {
                    break;
                }
            } while (true);
            
            //Anem a comprovar si omplim una casella verge, per incrementar o no 
            //el comptador
            if(vector[posicio-1]==0) cont++;
            
            //Assignem el valor a la posicio indicada
            vector[posicio-1]=valor;
            
            //Mirem si el vector està ple i en cas positiu sortim
            if(cont==dimensio) break;
        }

        //Mostrem el contingut del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.format("A la posició %d hi ha un %d%n", i+1 ,vector[i]);
        }
    }

}
