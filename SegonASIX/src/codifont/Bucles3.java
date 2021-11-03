/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Scanner;

//9. Fes un programa en Java que demani a l'usuari la introduccio de parelles de numeros enters fins que siguin iguals
//o un de ells sigui zero. Al final ha d'imprimir la suma i la mitjana dels numeros introduits.
//Afegit: Al final que mostri tambie el producte dels numeros diferents de zero.
/**
 *
 * @author alumne
 */
public class Bucles3 {

    public static void main(String[] args) {

        int num1, num2;
        int suma;
        int mitjana;

        do {

            System.out.println("Introdueix dos números enters.");
            Scanner ent = new Scanner(System.in);

            num1 = ent.nextInt();
            num2 = ent.nextInt();

            suma = num1 + num2;
            mitjana = (num1 + num2) / 2;

        } while (num1 != 0 && num2 != 0 && num1!=num2);
        
        
        
        
        System.out.println("La suma dels numeros es: "+suma);

    }
}

