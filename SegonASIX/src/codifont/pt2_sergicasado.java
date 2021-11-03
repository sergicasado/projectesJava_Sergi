/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;
import java.util.Scanner;

/**
 *
 * @author sergi casado
 */
public class pt2_sergicasado {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("  __________________________");
            System.out.println(" /_________________________/|");
            System.out.println(" |                         ||");
            System.out.println(" |    MENÚ DEL PROGRAMA    ||");
            System.out.println(" |   Autor: Sergi Casado   ||");
            System.out.println(" |------------------------ ||");
            System.out.println(" | 1. Executar exercici 28 ||");
            System.out.println(" | 2. Executar exercici 29 ||");
            System.out.println(" | 3. Sortir               ||");
            System.out.println(" |_________________________|/");
            System.out.println("Tria una opció:");

            opcio = ent.nextInt();

            switch (opcio) {
                case 1:

                    System.out.println("Exercici 28:");
                    System.out.println("------------");
                    System.out.println("Escriu numeros diferents i s'aniràn sumant");
                    System.out.println("fins que tornis a escriure el primer que has ficat:");

                    long primer,
                     num,
                     sum = 0;
                    int cont = 1;

                    primer = sum = ent.nextLong();
                    System.out.print(primer);
                    do {
                        
                        num = ent.nextLong();
                        sum += num;
                        System.out.println(sum);
                        cont++;
                    } while (num != primer);
                    
                    System.out.print("Numeros introduits:" + cont);
                    System.out.println(" ");
                    System.out.println("Suma total: "+sum);

                    break;
                case 2:

                    System.out.println("Programa 29:");
                    System.out.println("------------");
                    System.out.println("Escriu dos caracters i un numero >0");
                   

                    char c1,
                     c2,
                     tmp;
                    int nums;
                    c1 = ent.skip("[\r\n]*").nextLine().charAt(0);
                    c2 = ent.skip("[\r\n]*").nextLine().charAt(0);

                    nums = ent.nextInt();

                    if (c1 > c2) {
                        tmp = c1;
                        c1 = c2;
                        c2 = tmp;
                    }
                    System.out.println("Resultat:");
                    while (c1 <= c2) {
                        
                        System.out.println(c1);
                        c1 += nums;
                    }

                    break;
                case 3:
                    System.out.println("Has sortit programa");

                    break;

                default:
                    System.out.println("Opció incorrecta!");

            }

        } while (opcio != 3);

    }

}
