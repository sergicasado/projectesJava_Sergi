/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactiques.uf2;

/**
 *
 * @author Sergi
 */
public class Ex6 {

    public static void main(String[] args) {
        System.out.println(numeroPrimer(37));

    }

    public static boolean numeroPrimer(int num) {
        boolean a = true;

//            for (int i = num; i >=num; i--) {
//                if(num % num == 0) return false;
//                else return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                a = false;
                break;
            } 

        }

        return a;
    }
;

}
