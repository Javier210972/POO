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
          else  if (dato.equals("b")&&dato.equals(MenuT.encendido2())) {

                System.out.println("Subio al Canal: "+MenuT.getnocanalS());
            }
                  else if (dato.equals("c")&&dato.equals(true)) {

                System.out.println("Bajo al Canal: "+MenuT.getnocanalR());
            }
            else {
                System.out.println("Tv apagada");
            }
           }
        
    }}
