/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf3;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class VectorI {
    
    public static void main(String[] args) {
        
        //Declaració+instanciació dels vectors

        //vector1, 6 caselles, enters (int)
        //int[] vector1=new int[-6]; //Exception in thread "main" java.lang.NegativeArraySizeException: -6
        int[] vector1=new int[6];
        int a;
        //vector2, 3 caselles, Strings
        String[] vector2=new String[3];
        
        Scanner[] vector3=new Scanner[500];
        double[] vector4=new double[5];
        boolean[] vector5=new boolean[10];
        char[] vector6=new char[1];
        
        //Assignació de valors a les caselles
        vector1[0]=45;
        a=45;
        
        vector2[2]="estic a la tercera casella";
        
        vector3[45]=new Scanner(System.in);
        Scanner ent = new Scanner(System.in);
        
        vector4[1]=56.98;
        
        vector5[4]=true;
        
        vector6[0]='P';
        
        //Possibles errors
        //vector1[-8]=56;  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -8 out of bounds for length 6
        //vector1[vector1.length]=7; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        //vector1[0]=true; //s'ha de respectar el tipo de dades del vector
        
        //Se poden declarar vectors sense caselles
        float[] vector7=new float[0];
        //vector7[0]=5.6F;
        
        //Altres formes d'inicialitzar vectors
        int[] mesos={31,28,31,30,31,30,31,31,30,31,30,31};
        //if(anyBixest) mesos[1]=29;
        
        int[] mesos2;
        //mesos2={31,28,31,30,31,30,31,31,30,31,30,31};
        mesos2=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        //mesos2=new int[]{};
        
        
        for (int i = 0; i < mesos2.length; i++) {
            if(mesos2[i]%2 != 0) System.out.println(mesos2[i]);
            
        }
        
        {
            int i=0;
            while(i<mesos2.length){
                if(mesos2[i]%2 == 0)System.out.println(mesos2[i]);
                i++;
            }
        }
        
        System.out.println("");
    }
    
}
