/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf4;
import java.util.Random;




/**
 *
 * @author alumne
 */

//Es vol implementar un programa que simule el llançament d'un dau d'un número 
//variable de cares un número variable de vegades. Després de simulats els llançaments, 
//el programa ha de mostrar quantes vegades ha sortit cada número del dau. Per a realitzar 
//la simulació heu de generar una seqüència de números aleatoris. Nota: per simular el dau 
//podem usar un vector, on cada casella representarà una de les cares del dau. Quan simulem 
//una tirada hem d'obtenir un número aleatori entre 0 i el número de cares menys 1, 
//i incrementar en 1 la casella del vector corresponent al número obtingut. 
//Al final de les tirades, la suma de les caselles del vector donarà el número de tirades 
//(si ho hem fet bé, és clar).



//Per generar números aleatoris en Java se poden utilitzar diferents classes. 
//Una útil per la seua senzillesa és la classe java.util.Random, que disposa
//de mètodes per generar números aleatoris dels diferents tipos primitius. 
//En el nostre cas interessarà generar números aleatoris entre 0 i el número 
//de caselles del dau menys 1. Ho podem fer de la següent forma:
//
//Random r = new Random();
//int cares = ?;	//l'usuari dirà quantes cares ha de tenir el dau
//int tirada = r.nextInt(cares);          //El mètode nextInt(n) genera un número aleatori entre 0 i n-1

public class ExercisiDau {
    
    public static void main(String[] args) {
        
        Random r=new Random();
        
        int tirades=5;
        
        int cares=r.nextInt(5)+2;
        int[] dau;
        
        dau=new int[cares];
        
        
        
        System.out.println("El dau té "+cares+" cares");
        
        
        
        while(tirades>0){
         
            
            int posicio=r.nextInt(cares)+1;
            
            System.out.println("Ha sortit la posició "+posicio);
            
            tirades=tirades-1;
            
            dau[posicio]=dau[posicio]+1;
            
        }
        
        for (int i = 0; i < dau.length; i++) {
            
            
            System.out.println((i+1)+ "val" +dau[i]);
        }
           
            

           
                  
        
        
        
         
          
           
       
                
      
        
        
        
    }
    
    
}
