/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Bucles5 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        char c = 'a', fi, tmp;

//        System.out.println((int)'c');
//        System.out.println((int)'f');
//        System.out.println('c'+'f');
        //Vull mostrar les lletres de la 'a' a la 'z'
//        while(c<='z'){
//            System.out.print(c);
//            System.out.print(" ");
//            System.out.println((int)c);
//            c++;  //equivalent a c=c+1
//        }
        //Li demanem a l'usuari que escrigue el caràcter inicial i el final
        System.out.println("Escriu els caràcters inicial i final:");
        c = ent.nextLine().charAt(0);
        fi = ent.nextLine().charAt(0);

        //Vaig a intercanviar el valor de les variables c i fi en cas de que c 
        //sigue major que fi
        if(c > fi){
          tmp=c; 
          c=fi;
          fi=tmp;
        }
        while (c <= fi) {
            System.out.print(c);
            System.out.print(" ");
            System.out.println((int) c);
            c++;  //equivalent a c=c+1
        }

    }

}
