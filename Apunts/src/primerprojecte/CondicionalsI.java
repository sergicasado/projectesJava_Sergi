/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class CondicionalsI {

    public static void main(String[] args) {
        //Declaracció de variables
        Scanner ent = new Scanner(System.in);
        boolean condicio = false;
        int num;

        //Demanem a l'usuari la introducció d'un número enter
        System.out.println("Introduix un número enter:");
        num = ent.nextInt();
/*
        //L'if comprova la condició i si és certa executa les instruccions del
        //seu cos
        if (num != 9) {
            //Cos de l'if
            System.out.println("Hem entrat dins del cos de l'if!!");
            num++;
            if (num % 6 == 0) {
                System.out.println("El número més 1 és divisible per 6!!");

            }
        }

        //Exemple de condició en 2 ifs
        if (num == 10) {
            System.out.println("Lo número val 10");
        }
        if (num != 10) {
            System.out.println("Lo número no val 10");
        }

        //If else equivalent
        if (num == 10) {
            System.out.println("Lo número val 10");
            
        } else {
            System.out.println("Lo número no val 10");
            
        }
*/        
        condicio=false;
        if(condicio=(num==34)) System.out.println("Lo que sigue....");
        
        if(num==34) System.out.println("Lo altre...");

    }

}
