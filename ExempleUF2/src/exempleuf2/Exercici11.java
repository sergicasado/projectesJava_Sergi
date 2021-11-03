/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleuf2;

/**
 *
 * @Sergi Exercici11
 */
public class Exercici11 {
    public static void main(String[] args) {
        
        System.out.println(buscaCadena("Hola la","la",1));

    }

    public static int buscaCadena(String primer, String segon, int num) {

        if (primer == null || segon == null) {
            return -1;
        }
        if (num < 0) {
            num = 0;
        }
        if (segon.length() == 0) {
            return (num < primer.length() ? num : primer.length());
        }
        if (num >= primer.length()) {
            return -1;
        }

        //Tractament del cas general
        if (primer.contains(segon)) {
            //Anem a buscar-lo
            for (int i = num; i < primer.length(); i++) {
                if (primer.charAt(i) == segon.charAt(0)) {
                    for (int j = 0; j < segon.length() && segon.charAt(j) == primer.charAt(i + j); j++) {
                        if (j == segon.length()) {
                         
                        } return -1;
                    }
                }
                return 12345;
            }
            return 1;
        } else 
            return -1;
        

    }

}
