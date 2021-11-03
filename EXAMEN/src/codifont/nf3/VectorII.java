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
public class VectorII {
    
    public static void main(String[] args) {
        
        int[] v=new int[1000000];
        int dim;
        
        //s'executa el programa....
        dim=50;
        
        //Una vegada hem donat valor correcte a dim, podem instanciar el vector
        //v=new int[dim];  //--> aquí dim val 50, per tant tindrem 50 caselles
        //v=new int[10];
        //continuem l'execució. En algun moment modifiquem el valor de dim
        dim=dim+34;     //--> aquí dim val 84, èrò el vector continua tenint 
                        // 50 caselles
                        
        //Recorrem el vector
        for (int i = 0; i < v.length && i<dim; i++) {
            int j = v[i];
        }
        
    }
    
}
