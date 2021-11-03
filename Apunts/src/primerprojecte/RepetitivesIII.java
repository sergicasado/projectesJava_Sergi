/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

/**
 *
 * @author profe
 */
public class RepetitivesIII {

    public static void main(String[] args) {

        int i = 0;
        System.out.println("Inici while");
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("fi while\nInici for");

        
        for (i = 0; i < 10; i++)
        {

            System.out.println(i);
        }
        System.out.println("fi for");
        
        
        {
            int j=0;
            System.out.println(j);
        
        }
        
        //No es pot usar la j fora del seu bloc
        //System.out.println(j);
    }
}
