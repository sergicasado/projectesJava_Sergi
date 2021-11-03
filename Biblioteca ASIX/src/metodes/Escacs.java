/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import java.util.Scanner;

/**
 *
 * @author Sergi
 */
public class Escacs {
    
    
    /**
     * Aquest mètode inicia variables com contador i variable i a la vegada tracta
     * els elements, ja que està tot dins de un do while. Bàsicament el que fa es 
     * demanar 2 numeros a l'usuari i els introdueix en 2 caselles diferents dins
     * del vector (guardar2numeros). Quan ja s'han introduït 2 numeros el programa 
     * deixa de demanar mes i salta al següent pas.
     * @param contador Aquesta variable ens serveix dir-li al programa quan ha de parar
     * demanant numeros, ho indiquem al while per que pari. 
     * @param variable Es la posició que indiquem dins del vector. Serà on s'asignarà
     * el numero que li hem posat.
     * @param guardar2numeros Es el vector on deixarem guardats els 2 valors que 
     * l'usuari indica com a coordenades, ens servirà mes endavant per calcular
     * a quina casella del tablero de escacs correspon.
     */
    
    public static void inciarITractarElement(int contador, int variable, int guardar2numeros[]) {
        Scanner ent = new Scanner(System.in);
        contador = 0;
        variable = 0;
        do {
            guardar2numeros[variable] = ent.nextInt();

            variable++;
            contador++;

        } while (contador < 2);
        
       
    }
     
    /**
     * El que fa aquest mètode es mostrar el resultat indicant a quina casella
     * correspon la posició que li hem indicat mitjançant els dos numeros que el 
     * programa demana a l'usuari. En cas de que algún d'aquests 2 numeros sigui
     * igual o major a 9 el programa no mostrarà cap posicio (ja que no existeix)
     * pero seguirà funcionant per que el puguis fer servir indicant-li unes noves
     * coordenades. En canvi, si algún dels 2 numeros es 0 el programa acabarà.
     * 
     * @param guardar2numeros Vector on tenim guardats els 2 numeros (2 posicions)
     * que l'usuari ha introduït.
     * @param lletres Vector on tenim guardades totes les lletres que conté el
     * tauler d'escacs.
     * @param numeros Vector on tenim guardats tots els numeros que conté el
     * tauler d'escacs.
     */
    
    public static void mostrarResultat(int[] guardar2numeros, char[] lletres, int[] numeros) {

        if (guardar2numeros[0] > 0 && guardar2numeros[0] < 9 && 
            guardar2numeros[1] > 0 && guardar2numeros[1] < 9) {
            
            System.out.print(lletres[guardar2numeros[0] - 1]);
            System.out.println(numeros[guardar2numeros[1] - 1]);
        }
    }
    
    /**
     * Aquest paràmetre es el que condiciona si tenim que seguir fent el bucle de 
     * do while en el que estem demanant tot el rato 2 numeros i ens dona la posicio
     * al tauler d'escacs. Al moment que en algun dels numeros que ens demana el 
     * programa li posem un 0 aquest s'aturarà.
     * @param guardar2numeros Vector on tenim guardats els 2 numeros (2 posicions)
     * que l'usuari ha introduït.
     * @return Retorna un boleà en true de que num1 o num2 es 0.
     */
    
    public static boolean elementFinal(int[] guardar2numeros) {
        return guardar2numeros[0] == 0 || guardar2numeros[1] == 0;

    }
   
    
}


//codi sense parametritzar

//    private static void inciarITractarElement() {
//
//        int cont = 0;
//        int i = 0;
//        do {
//            guardar2numeros[i] = numero.nextInt();
//
//            i++;
//            cont++;
//
//        } while (cont < 2);
//    }
//    
//   
//
//    private static void mostrarResultat() {
//
//        if (guardar2numeros[0] > 0 && guardar2numeros[0] < 9 && 
//            guardar2numeros[1] > 0 && guardar2numeros[1] < 9) {
//            
//            System.out.print(lletres[guardar2numeros[0] - 1]);
//            System.out.println(numeros[guardar2numeros[1] - 1]);
//        }
//    }
//
//    private static boolean elementFinal() {
//        return guardar2numeros[0] == 0 || guardar2numeros[1] == 0;
//
//    }
