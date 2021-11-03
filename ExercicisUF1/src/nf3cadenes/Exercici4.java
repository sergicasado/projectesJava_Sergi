/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf3cadenes;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici4 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        String text = "";
        int contLins=0, contCars=0;
        
        System.out.println("Introduix un text format per una o més línies i acabada en una que contingue el punt:");
        do {
            String linia = ent.nextLine().trim();
            
            //Sumo tots els caracters de la línia, incloent espais en blanc
            contCars=contCars+linia.length();
            
            //Miro si hi ha algun espai en blanc i el resto del comptador de caracters
            if(linia.contains(" ")){
                int index=linia.indexOf(' ');
                while (index!=-1) {
                    contCars--;
                    index=linia.indexOf(' ',index+1);
                }
            }
            
            if (text.isEmpty()) {
                text = linia;
            } else {
                text = text + '\n' + linia;
            }
            if(!linia.isBlank()) contLins++;
            if (text.contains(".")) {
                break;
            }
        } while (true);

        System.out.format("%nEl text%n\"%s\" %nconté %d línies i %d caracters.%n", text, contLins, contCars);
        
        
    }
    
}
