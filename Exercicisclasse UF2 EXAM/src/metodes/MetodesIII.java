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
public class MetodesIII {
    
    public static void main(String[] args) {
        int numero=0;
        System.out.println(numero);
        param(numero);
        System.out.println(numero);
        boolean[] v=new boolean[]{true, false, true};
        param(null);
        param(v);
        
        System.out.println(Arrays.toString(v));    
        
        int[] vEnters=new int[15];
        vEnters[4]=25;
        omplirModificantParametre(vEnters, 32);
        
        //For each
        for(int valorCasella : omplirSenseModificarParametre(vEnters, 32)){
            
            System.out.println(valorCasella);
        };
        
        int[] exemple=omplirSenseModificarParametre(vEnters, 32);
        for(int j=0; j<exemple.length;j++){
            
            System.out.println(exemple[j]);
        };        
        
        //System.out.println(Arrays.toString(vEnters));
        
        int[] vEnters2=incrementar(vEnters,-2);
        System.out.println(Arrays.toString(vEnters));
        System.out.println(Arrays.toString(vEnters2));
    }
    
    public static void param(int i){
        i++;
        System.out.println(i);
    }
    
    public static void param(boolean[] vector){
        if(vector!=null){
            vector[1]=true;
        }
        else System.out.println("No hi ha res a fer...");
        
    }
    
    //Ompli el vector posant el valor a totes les seues caselles. Atenció, el 
    //vector paràmetre se modificarà!!
    public static void omplirModificantParametre(int[] vector, int valor){
        if(vector!=null){
            for (int i = 0; i < vector.length; i++) {
                vector[i]=valor;
                
            }
        }
    }
    
    //Ompli el vector posant el valor a totes les seues caselles, retornem un 
    //vector copia del paràmetre. Atenció, el vector paràmetre NO se modificarà
    public static int[] omplirSenseModificarParametre(int[] vector, int valor){
        if(vector!=null){
            //Creo un vector copia que apuntarà a una altra zona de la memòria
            int[] copia=new int[vector.length];
            //Copiem els valors de vector a copia
//            for (int i = 0; i < copia.length; i++) {
//                copia[i]=vector[i];
//            }
            //Fem que vector apunte a on apunta copia --> vector ja no apunta a vEnters 
            vector=copia;

        
        
            for (int i = 0; i < vector.length; i++) {
                vector[i]=valor;
                
            }
        }
        return vector;
    }
    
    //Retorna un vector idèntic al rebut com a paràmetre però en les caselles
    //incrementades en la quantitat indicada pel paràmetre enter. Atenció, el 
    //vector paràmetre NO se modificarà!! Si el vector paràmetre és null 
    //retornarem null
    public static int[] incrementar(int[] vector, int quantitat){
        int[] resultat; 
        if(vector!=null){
            //Creo un vector de la mateixa llargada que el rebut per paràmetre
            resultat=new int[vector.length];
            for (int i = 0; i < resultat.length; i++) {
                resultat[i]=vector[i]+quantitat;
                
            }
            
            return resultat;
        }
        
        return null;
    }
}
