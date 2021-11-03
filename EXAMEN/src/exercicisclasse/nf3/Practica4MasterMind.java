/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Practica4MasterMind {
    
    public static void main(String[] args) {
        //Declaració de  constants. 
        //Canviant el valor la combinació secreta canviarà de longitud
        //Podria ser també una variable que introduix l'usuari
        final int CARACTERS=2;

        //Declaració de vars
        Scanner ent = new Scanner(System.in);
        Random r=new Random();
        String colors="RGYNWOBM",       //els caràcters de colors possibles 
                textColors="-R: roig,\n" +  //el missatge quan triem MOSTRAR
                            "\n" +
                            "-G: verd,\n" +
                            "\n" +
                            "-Y: groc,\n" +
                            "\n" +
                            "-N: negre,\n" +
                            "\n" +
                            "-W: blanc,\n" +
                            "\n" +
                            "-O: taronja,\n" +
                            "\n" +
                            "-B: blau,\n" +
                            "\n" +
                            "-M: marró.";
        //Vector usat per evitar repetir colors al generar la combinació
        boolean[] repetits=new boolean[colors.length()];    
        //Vector on guardarem les 10 jugades de l'usuari, més la puntuació
        String[] jugades=new String[10];
        //per guardar la jugada actual
        String jugada;
        //Comptador d'intents. L'inicialitzo a 0 ja que servirà d'índex pel 
        //vector de jugades
        int intents=0;
        //Vector i String on guardem la combinació secreta. Poso de longitud la
        //constant CARACTERS
        char[] secret=new char[CARACTERS];
        String secretText="";
        
        //Per mostrar el resultat faig una linia de guions en longitud depenent
        //de la quantitat de caràcters que conté la combinació secreta
        String liniaGuions="-";
        for (int i = 0; i < secret.length; i++) {
            liniaGuions+="----";
        }
        
        //Generem la combinació secreta
        int i = 0;
        while ( i < secret.length) {
            //Obtenim un índex de color aleatori
            int aleatori = r.nextInt(colors.length()); 
            //Si encara no ha sortit.... 
            if(!repetits[aleatori]){
                //l'afegim a la combinació
                secretText+=colors.charAt(aleatori);
                secret[i++]=colors.charAt(aleatori);
                //marquem que ja ha sortit per a que no es pugue repetir
                repetits[aleatori]=true;
            }
        }
        
        //Missatge inicial
        System.out.println("Combinació secreta calculada... Tens 10 intents per endevinar-la.");
        
        //Comencem a jugar. Com he inicialitzat intents a 0 iterem mentre sigue 
        //inferior a 10
        while(intents<10){
            //Mostrem número d'intent actual (més 1) i passem la jugada a 
            //majúscules per només comparar en majúscules 
            System.out.format("%nIntent nº %d%n%n", intents+1);
            System.out.format("Introduix una línia de mínim %d caràcters RGYNWOBM:%n", secret.length);
            jugada=ent.skip("[\r\n]*").nextLine().toUpperCase().trim();
            
            //Tractem quan l'usuari escriu COLORS i tornem a l'inici del bucle
            //sense canviar el número d'intent
            if(jugada.equals("COLORS")) {
                System.out.println(textColors);
                continue;
            }
            
            //Ídem per MOSTRAR
            if(jugada.equals("MOSTRAR")) {
                System.out.println("La combinació secreta és: "+secretText);
                continue;
            }
            
            //Ídem si la jugada és massa curta
            if(jugada.length()<secret.length) {
                System.out.format("Ha de ser de mínim %d caràcters%n", secret.length);
                continue;
            }
            
            //Mirem si hi ha algun caracter incorrecte entre els primers de la 
            //jugada, i aprofitem  per comptar els colors posicionats correctament
            String incorrectes="";
            int contPos=0;
            for (i = 0; i < secret.length; i++) {
                char c=jugada.charAt(i);
                //Si el caràcter actual de la jugada no és cap dels de colors
                //l'afegim a un String d'incorrectes
                if(colors.indexOf(c)==-1) incorrectes+=c;
                //Si el caràcter és correcte mirem si està ben posicionat
                else if(secret[i]==c) contPos++;
            }
            //Si hi ha algun caràcter incorrecte els mostrem i tornem a l'inici 
            //del bucle sense canviar el número d'intent
            if(incorrectes.length()!=0){
                System.out.format("Hi ha caràcters de color incorrectes entre els %d primers: %s%n", secret.length, incorrectes);
                continue;
            }
            
            
            //A partir d'aquí segur que la jugada és vàlida...
            
            //Tractem la jugada vàlida
            //Primer la retallo als primers caràcters necessaris (la resta no 
            //els necessito) per res 
            jugada=jugada.substring(0, secret.length);
            
            //Guardo la jugada al vector de jugades, formatejada per a que quede
            //més bonica
            jugades[intents]="| ";
            for (i = 0; i < jugada.length(); i++) {
                jugades[intents]+=jugada.charAt(i)+" | ";
            }
            
            //Si tots els colors estaven ben posicionats hem acabat (o if(secretText.equals(jugada))...)
            if(contPos==secret.length){   
                System.out.format("Enhorabona, has encertat la combinació secreta en %d intents!!%n", intents+1);
                
                //afegixo la puntuació al vector de jugades
                jugades[intents]+="  "+contPos+"P 0C";
                
                //Mostro les jugades començant per la última
                for (i = intents; i >= 0; i--) {
                    //aquí uso la cadena de guions generada al principi
                    System.out.println(liniaGuions);
                    //mostro la jugada prèviament formatejada correctament
                    System.out.println(jugades[i]);
                }
                System.out.println(liniaGuions+"\n");   
                
                //Sortim del bucle ja que hem acabat
                break;
            }
            
            //A partir d'aquí segur que la jugada és vàlida però no la secreta..
            
            //Tractem la jugada vàlida però que no conté la combinació secreta
            //Comptem els colors vàlids
            int contCols=0;
            //Guardem els colors ja apareguts per a no comptar-los 2 vegades
            String apareguts="";
            for (i = 0; i < jugada.length(); i++) {
                //Mirem si el caràcter actual de la jugada està a la combinació 
                //secreta --> en este cas pos serà diferent de -1
                int pos=secretText.indexOf(jugada.charAt(i));
                
                //Per a comptar el caràcter actual com a color existent a la  
                //combinació secreta però no ben posicionat ha de passar:
                // - que forme part de la combinació secreta --> pos!=-1
                // - que no sigue un color ben posicionat --> secret[pos]!=jugada.charAt(pos)
                // - que no haigue aparegut ja --> apareguts.indexOf(jugada.charAt(i))==-1
                if(pos!=-1 && secret[pos]!=jugada.charAt(pos) && apareguts.indexOf(jugada.charAt(i))==-1) {
                    contCols++;
                    //Afegim el color actual als ja apareguts per a no tornar-lo 
                    //a comptar en cas de repetir-se
                    apareguts+=jugada.charAt(i);
                }
            }
            
            //afegixo la puntuació al vector de jugades
            jugades[intents]+="  "+contPos+"P "+contCols+"C";

            //Mostro les jugades començant per la última
            for (i = intents; i >= 0; i--) {
                System.out.println(liniaGuions);
                System.out.println(jugades[i]);
            }
            System.out.println(liniaGuions+"\n");   


            //Incrementem el comptador d'intents
            intents++;
            
        }
        
        //Si al sortir del bucle estem a l'intent 10 (9+1) vol dir que hem 
        //agotat els intents sense trobar la combinació secreta
        if(intents==10){
            System.out.format("%nHo sento, la combinació secreta era %s. A la próxima!!%n", secretText);
        }
        
    }
}
