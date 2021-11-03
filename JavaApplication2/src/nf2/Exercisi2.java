///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package nf2;
//
//import java.util.Scanner;
//
///**
// *
// * @author alumne
// */
//public class Exercisi2 {
//
//    public static void main(String[] args) {
//
//        Scanner ent = new Scanner(System.in);
//
//        int opcio;
//        int cont;
//        int opcions=2;
//
//        do {
//
//            //Mostrem el menu
//            System.out.println("Tria una opció:");
//            System.out.println("0. Sortir");
//            System.out.println("1. Solució en for");
//            System.out.println("2. Solució en while");
//            System.out.println("3. Solució en do_while");
//
//            //Llegim l'opcio que tria l'usuari
//           
//
//            switch (opcions) {
//
//                case 0:
//                    System.out.println("Adeu!");
//                    break;
//
//                case 1:
//
//                    for (cont = -50; cont <= 50; cont++) {
//                        System.out.println(cont + " és parell");
//                        System.out.println(cont % 2 == 0 ? "parell" : "imparell");
//                    }
//
//                    break;
//
//                case 2:
//
//                    cont = -50;
//
//                    while (cont <= 50) {
//                        System.out.println(cont + " és ");
//                        if (cont % 2 == 0) {
//                            System.out.println("parell");
//                        } else {
//                            System.out.println("imparell");
//                        }
//                        cont++;
//                    }
//
//                    break;
//
//                case 3:
//                    cont = -50;
//                    do {
//                        System.out.println(cont + " és ");
//                        System.out.println(cont % 2 == 0 ? "parell" : "imparell");
//                        cont++;
//
//                        cont++;
//                    } while (cont <= 50);
//
//                    break;
//
//                default:
//                    System.out.println("Opció incorrecta");
//                    System.out.println(" ");
//
//            }
//        } while (opcions != 0 && opcio != 1 && opcio != 2 && opcio != 3);
//
//    }
//
//}
