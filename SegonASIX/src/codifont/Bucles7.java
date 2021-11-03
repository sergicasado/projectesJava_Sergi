/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

/**
 *
 * @author alumne
 */
public class Bucles7 {

    public static void main(String[] args) {

        int x;

        //for (int i -> indiquem la variable a la que li fem. i<10 -> Mentres es compleixi es fara el for.
        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }
        
        System.out.println("");
        
        //Faig un while equivalent al for de dalt, pero usant la variable j enlloc de la i
        
        {
            int j=0;
            int k=45;
            while(j<10 && k!=51){
                System.out.println(j);
                
                j++;
                k=k+2;
                
            }
        }

    }
}
