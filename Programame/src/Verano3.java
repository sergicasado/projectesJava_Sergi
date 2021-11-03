/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Verano3 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String paraula = "";
        int v = 0, i = 0;
        
        
        
        while (true) {

            do {

                paraula += ent.nextLine();

                if (paraula.endsWith(".")) {
                    break;
                } else {
                    paraula += " ";
                }

            } while (true);

            if (paraula.strip().equals(".") || paraula.isEmpty()) {
                break;
            }

            for (int j = 0; j < paraula.length(); j++) {

                switch (paraula.charAt(j)) {
                    case 'V':
                        v++;
                        break;

                    case 'I':
                        i++;
                        break;
                        
                    case 'A':
                        i=i;
                        v=v;
                    default:
                        break;
                }
                
                
                System.out.println("valor v");
                System.out.println(v);
                System.out.println("valor i");
                System.out.println(i);
       
            }

            if (v < i) {
                System.out.println("INVIERNO");
            } else if (i < v) {
                System.out.println("VERANO");
            } else if (i == v) {
                System.out.println("EMPATE");
            }
            i = 0;
            v = 0;
            paraula="";
        }

    }

}
