/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici8 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num1, //guardem el primer numero de la parella introduida
                num2, //guardem el segon numero de la parella introduida
                suma, //guardem la suma acumulada des valors introduits
                producte, //guardem el producte acumulat dels valors introduits i diferents de zero
                comptador; //guardar la quantitat de numeros introduits

        //bucle que llig i tracta les parelles de numeros 
        do {

            System.out.println("Introdueix un parell de numeros enters (iguals o algun a 0 per finalitzar)");
            suma=0;
            num1 = ent.nextInt();
            num2 = ent.nextInt();
            suma = suma+num1 + num2;

        } while (!(num1==num2 || num1==0 || num2==0));

    }

}
