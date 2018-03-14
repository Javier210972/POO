/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesjaviersalvador;

import java.util.Scanner;

/**
 *
 * @author toshiba2
 */
public class MenuTv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Menu = new Scanner(System.in);
        Tv MenuT = new Tv();
        
        String dato="f";
        System.out.println("TV");
        System.out.println("Ingrese una opcion");
        while (!dato.equals("z")) {
            
            
            System.out.print(" a)Power ");
            System.out.print(" b)Subir canal ");
            System.out.print(" c)Bajar canal ");
            System.out.print(" d)Subir volumen ");
            System.out.println("e)Bajar volumen");
            System.out.println("z)salir");
            dato = Menu.next();
            if (dato.equals("a")) {
                MenuT.encendido();
                
               
            }
           
           if (dato.equals("b")) {

                MenuT.getnocanalS();
            }
                if (dato.equals("c")) {
                 MenuT.getnocanalR();
            }
                
                if (dato.equals("d")) {
                 MenuT.getVolumencanalS();
                }
                if (dato.equals("e")) {
                 MenuT.getVolumencanalB();
                }
            }
           
           }
        }
        
