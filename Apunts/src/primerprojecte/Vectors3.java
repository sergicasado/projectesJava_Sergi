/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprojecte;

import java.util.Random;

/**
 *
 * @author profe
 */
public class Vectors3 {
    
    public static void main(String[] args) {
        Random r=new Random();
        int[] v={1,2,3,4,5,6,7,8,9,10};//new int[10];
        
        //Recorregut d'esquerra a dreta
        for (int i = 0; i < v.length; i++) {
            System.out.format("%3d",v[i]);            
        }
        System.out.println("");
        
        //Recorregut de dreta a esquerra
        for (int i = v.length-1; i >= 0; i--) {
            System.out.format("%3d",v[i]);            
        }
        System.out.println("");
        
        //Ompli el vector aleatòriament en valors aleatoris entre l'1 i el 10
        int[] v2=new int[10];
        int comptPle=0;
        while(comptPle!=v2.length){
            //Generem un valor de l'índex aleatòriament
            int index=r.nextInt(v2.length);
            //Comprovem si la casella està buida i la omplim en un valor aleatori 
            //entre 1 i 10
            if(v2[index]==0){
                v2[index]=r.nextInt(v2.length)+1;
                comptPle++;
            }
        }
        
        //Recorregut d'esquerra a dreta
        for (int i = 0; i < v2.length; i++) {
            System.out.format("%3d",v2[i]);            
        }
        System.out.println("");
        
        
    }
    
}
