/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf3;

/**
 *
 * @author profe
 */
public class VectorIV {
    
    public static void main(String[] args) {
        
        //Vector unidimensional
        int[] vector=new int[8];
        
        //Vector bidimensional --> matriu rectangular
        char[][] matriu=new char[4][5];
        
        //Matriu no rectangular
        double[][] matriu2=new double[3][];
        
        matriu2[0]=new double[4];
        matriu2[1]=new double[3];
        matriu2[2]=new double[7];
        
        //matriu tridimensional --> cub
        boolean[][][] cub=new boolean[100][][];
        
        cub[0]=new boolean[5][];
        cub[0][3]=new boolean[45];
        cub[0][3][25]=true;
        //...
        cub[99]=new boolean[2][25];
        
        
        //Recorregut de vectors multidimensionals
        //Vector unidimensional
        for (int i = 0; i < vector.length; i++) {
            vector[i]++;
        }
        
        //Vector bidimensional rectangular
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = 'j';
                
            }
        }

        //Vector bidimensional no rectangular
        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                matriu2[i][j] = 'j';
                
            }
        }



        
        //Vector tridimensional
        for (int i = 0; i < cub.length; i++) {
            for (int j = 0; j < cub[i].length; j++) {
                for (int k = 0; k < cub[i][j].length; k++) {
                    
                    cub[i][j][k]=false;
                    
                }
                
            }
            
        }
    }
    
}
