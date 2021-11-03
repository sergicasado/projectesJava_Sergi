/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Arrays;

/**
 *
 * @author profe
 */
public class MetodesIV {

    public static void main(String[] args) {

        paramsVariables();
        paramsVariables(1);
        paramsVariables(1, 3, 4, 5, 6, 7);
        paramsVariables(null);
        int[] vector=new int[5];
        paramsVariables(vector);
        System.out.println(Arrays.toString(vector));

    }

    public static void paramsVariables(int... valor) {
        if (valor != null) {

            for (int i = 0; i < valor.length; i++) {
                valor[i]=i;

            }
        }
    }

}
