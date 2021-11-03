/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joel;

/**
 *
 * @author alumne
 */
import java.util.Scanner;

public class Bambino {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int A,B,C,N;
        
       
        do {
            
            System.out.println("introdueix els 4 nums");
        A = ent.nextInt();
        B = ent.nextInt();
        C = ent.nextInt();
        N = ent.nextInt();
            
        } while (C < 18 || C < 18 || C < 18 || N < 18);
        
        
    }

}
