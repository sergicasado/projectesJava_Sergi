/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdomjudge;

import java.util.Scanner;

/*
 *
 * Fes un programa en Java que rep el radi d'una circumferència (un número real
 * positiu) i mostra el perímetre i l'àrea de la circumferència (si el radi és
 * r, p el perímetre i a l'àrea, les fórmules són: p = 2 * PI * r, a = PI * r *
 * r), separades per un espai en blanc. Ajudes: el valor de PI el podeu obtindre
 * directament usant la constant Math.PI. recordeu que NO HEU de mostrar textos
 * que li diguen a l’usuari què ha d’introduïr, simplement heu de llegir el que
 * diu a l’enunciat i mostrar el resultat pel terminal.
 *
 *
 * @author profe
 */
public class Exercici3 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        short any;  //ens asseguren que no serà inferior a -32768 ni superior a 32767, per tant en un short tindrem prou

        //Demanem l'any
        any = ent.nextShort();

        //Mostrem el resultat
        if(any > 1582 && (any%400==0 || (any%4==0 && any%100!=0)))
            System.out.println("SI");
        else 
            System.out.println("NO");
        

    }

}
