/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;
import java.util.Scanner;
/**
 *
 * @author Sergi
 */
public class VectorII {
    
    public static void main(String[] args) {
        
        
        int[] v=new int[1000000];
        int dim;
        
        //s'executa el programa...
        dim=50;
        
        //una vega hem donat valor correcte a dim, podem instanciar el vector
        v=new int[dim]; // --> Aqui dim val 50, per tant tindrem 50 caselles
        v=new int[50];//També es pot inicialitzar amb la cantitat que volem
        
        
        //continuem l'execució. En algun moment modifiquem el valor de dim 
        dim=dim+34;     //--> Aqui dim val 84. Pero el vector continua tenint
                        //50 caselles
                        
        //Recorrem el vector
        for (int i = 0; i < v.length && i<dim; i++) { //Sempre utilitzar el .length ja que
            int j = v[i];                    //sempre va fins al maxim possible
            
            
            
        }
        
        
    }
    
}
