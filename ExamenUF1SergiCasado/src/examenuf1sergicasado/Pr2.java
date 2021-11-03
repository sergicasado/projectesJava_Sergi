
package examenuf1sergicasado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pr2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        
        //numeros triats per mi
        int n1 = 2, n2 = 3;

        String caracter;
        //lletra triada per mi
        char c = ' ';

        //calculo el numero equivalent a la primera i ultima lletra de la cadena
        int principi = c - ((char) n1);
        int ultima = c + (char) n2;

        //transformo els numeros i ja se quina es la primera i ultima lletra de
        //la cadena
        char p = (char) principi;
        char u = (char) ultima;
        
        
        //faig que el mínim no pugui ser menor que 32 i el maxim no puqui ser
        //major que 126
         if (principi <= (int) ' ') {
            principi = 32;
        } else {
            principi = principi;
        }

       if (ultima >= (int) '~') {
           ultima = 126;
       } else {
            ultima = ultima;
        }

        
        System.out.format("La cadena generada és:");
        System.out.println("");
        
        //recorro la cadena del primer numero a l'ultim, a la vegada li faig
        //un casting a char per a que ja me la doni en lletres.
        for (int i = principi; i <= ultima; i++) {

         
            
            System.out.print((char)i);
            if(i == ultima)
            break;

        }
        System.out.println("");
        System.out.format("el caracter inicial és '%s', el triat '%s' i el final '%s' ",p,c,u);
        System.out.println("");

    }

}



