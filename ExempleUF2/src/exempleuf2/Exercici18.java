/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleuf2;
import java.util.Arrays;

/**
 *
 * @Sergi Exercici18
 */
public class Exercici18 {

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(ompleVectorFloats()));
        System.out.println(Arrays.toString(ompleVectorFloats(null)));
        System.out.println(Arrays.toString(ompleVectorFloats(1F, 2.5F)));
        System.out.println(Arrays.toString(ompleVectorFloats(1F, 2.5F, 7.4E12F, -6.8E-2F)));
        ompleVectorFloats();
        ompleVectorFloats(null);
        ompleVectorFloats(new float[]{1F, 2.5F});
        float[] dades = ompleVectorFloats(1F, 2.5F, 7.4E12F, -6.8E-2F);

        if (dades != null) {
            for (int i = 0; i < dades.length; i++) {
                System.out.println(dades[i]);

            }

        } else {
            System.out.println("Resultat null manin");
        }
        System.out.println("");
    }

    public static float[] ompleVectorFloats(float... params) {

        if (params == null || params.length == 0) {
            return null;
        }
        float[] resultat = new float[params.length];
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = params[i];

        }
        return resultat;
    }

}
