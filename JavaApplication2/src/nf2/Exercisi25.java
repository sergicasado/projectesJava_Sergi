/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercisi25 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int vector[]; //vector on guardem els valors
        int cont = 0; //comptador de caselles plenes
        int dimensio; //per accedir a les caselles del vector
        int posicio, valor; //

        do {

            System.out.println("Introdueix un enter positiu (>=0, dimensió del vector");

            dimensio = ent.nextInt();

            if (cont <= 0) {
                System.out.println("Ha de ser positiu");
            } else {
                break;
            }

            //Instanciem el vector en la dimensio indicada
            vector = new int[dimensio];

            //Demanem parelles de numeros fins omplir el vector
        } while (true);

        do {

            System.out.format("Introdueix un enter entre 1 i %d:%n", dimensio);

            posicio = ent.nextInt();

            if (posicio < 1 || posicio > dimensio) {
                System.out.format("Ha de ser un enter entre 1 i %d!!%n", dimensio);
            } else {
                break;
            }

            //Demano el valor (enter positiu) a introduir a la posicio seleccionada
        } while (true);

        do {

            System.out.println("Introdueix un enter positiu (>0,  ");

            valor = ent.nextInt();

            if (valor <= 0) {
                System.out.println("Ha de ser positiu");
            } else {
                break;
            }

        } while (true);

        //Anem a comprovar si omplim una casella verge per incrementar o no el comptador
        if (vector[posicio - 1] == 0) 
            cont++;
        

        //Asignem el valor a la posicio indicada
        vector[posicio - 1] = valor;

        //Mirem si el vector està ple i en cas positiu sortim
        if (cont == dimensio) 
            break;
    
        for (int i = 0; i < vector.length; i++) {
            System.out.format("A la posicio %d hi ha un %d%n", i+1, vector[i]);
            
        }
        
        }
    }

   

    
    



