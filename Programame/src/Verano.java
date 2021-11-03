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
public class Verano {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        String paraula="";
        
        int v = 0, i = 0;

        while (!paraula.strip().equals(".")) {
            
       
            do {
                
                paraula += ent.nextLine().strip();

                if (paraula.strip().endsWith(".")) {
                    break;
                } else {
                    paraula += " ";
                }

            } while (true);
            for (int j = 0; j < paraula.length(); j++) {

                switch (paraula.charAt(j)) {
                    case 'V':
                        
                        v++;
                        System.out.println("sumo v");
                        
                        
                        break;

                    case 'I':
                        i++;
                        
                        System.out.println("sumo i");
                        break;
                       

                    case 'A':
                        
                        System.out.println("sumo i(A)");
                        i++;
                        System.out.println("sumo v DE A");
                        v++;
                        break;

                    default:
                        break;
                }
                i = 0;
                v = 0;

            }
                
                if (v < i) {
                    System.out.println("INVIERNO");
                } else if (i < v) {
                    System.out.println("VERANO");
                } else if(v==i && !paraula.strip().equals(".")){
                    System.out.println("EMPATE");
                }
                
                if(paraula.strip().equals("."))break;
                
            
        }

    }

}