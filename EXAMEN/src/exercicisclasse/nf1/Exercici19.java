/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *
 * @author profe
 *
 * 19. El diumenge de Pasqua és el primer diumenge després de la primera lluna
 * plena posterior a l'equinocci de primavera, i es determina, per a un
 * determinat any mitjançant el següent càlcul:  *
 * a=any % 19; b=any % 4; c=any % 7; d=(19 * a + 24) % 30; e=(2*b + 4*c + 6*d
 * +5) % 7; n=(22 + d + e);  *
 * On n indica el número de dia del mes de març (si és menor o igual que 31) o
 * abril (si és major que 31). Construïu un programa que demane a l'usuari la
 * introducció d'un any i determine la data del diumenge de Pasqua d'aquell any.
 *
 *
 *
 */
public class Exercici19 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int any, a, b, c, d, e, n;
        String mes = "d'abril";

        //Demanem a l'usuari l'introducció d'un any
        System.out.println("Introduix un número d'any:");
        any = ent.nextInt();

        //Fórmules de l'enunciat
        a = any % 19;
        b = any % 4;
        c = any % 7;
        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;
        n = (22 + d + e);

        //Mirem com és la n per dir si cau en març o abril
        if (n <= 31) {
            System.out.println("El diumenge de Pasqua del " + any+ " cau en el "+ n + " de març.");
        } else {
            System.out.println("El diumenge de Pasqua serà el "+ any + " cau en el " + (n - 31) + " d'abril.");
        }

        if (n <= 31) {
            mes = "de març";
        } else {
            n = n - 31;
        }

        System.out.println("El diumenge de Pasqua del " + any + " cau en el " + n + " " + mes);
    }

}
