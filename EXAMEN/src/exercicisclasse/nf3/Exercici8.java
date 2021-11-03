/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici8 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        long numero, copia;
        int llargada;
        byte[] vector;
        int index;
        boolean negatiu;

        //demanarNumero
        System.out.println("Introduix un número enter:");
        numero = ent.nextLong();

        if (numero == 0) {
            vector=new byte[1]; //això crea un vector d'una casella inicialitzada a 0
        } else {
            negatiu = numero < 0;
//        if(numero<0)  negatiu=true;
//        else negatiu=false;
            if (negatiu) {
                numero *= -1;
            }
            copia = numero;

            //calcularLongitud+InstanciarVector
            llargada = 0;
            while (numero != 0) {
                llargada++;
                numero /= 10;
            }
            vector = new byte[llargada];

            //tractarNumero
            numero = copia;
            for (int i = vector.length - 1; i >= 0; i--) {
                vector[i] = (byte) (numero % 10);
                numero /= 10;
            }

            if (negatiu) {
                vector[0] = (byte) (vector[0] * -1);
            }
         
        }
        
        //mostrarResultat
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }

        //Per mostrar l'array e n una sola línia s'ha de fer el següent. 
        //En teoria, segons la pròpia API de Java, la 2ª línia fa el mateix que la primera, però no funciona...
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.asList(vector).toString());
    }

}
