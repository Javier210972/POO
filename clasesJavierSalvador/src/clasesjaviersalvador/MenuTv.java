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
        String dato;
        System.out.println("TV");
        System.out.println("Ingrese una opcion");
        System.out.print(" a)Power ");
        System.out.print(" b)Subir canal ");
        System.out.print(" c)Bajar canal ");
        System.out.print(" d)Subir volumen ");
        System.out.println("e)Bajar volumen");
        dato = Menu.nextLine();
       
        if (dato.equals("a")) {
            MenuT.encendido();

        }

        if (dato.equals("a")) {
            System.out.println("quiere cambiar de canal?");
            System.out.println("para salir de esta opcion presione z");
            dato = Menu.nextLine();
if (dato.equals("b")) {

            for (int nocanal2 = 2; nocanal2 <= 5; nocanal2++) {
if (dato.equals("z")) {
                      break;
                  }
                System.out.println("esta en el canal: " + nocanal2);
                dato = Menu.nextLine();

                if (nocanal2 > 4) {

                    nocanal2 = 0;
                }

                if (dato.equals("c")) {
                    for (int nocanal = nocanal2 - 1; nocanal > 0; nocanal--) {
               if (dato.equals("z")) {
                      break;
                  }
                        System.out.println("esta en el canal: " + nocanal);
                        dato = Menu.nextLine();

                        if (nocanal < 2) {

                            nocanal = 6;
                        }
                        

                    }
                }

            }
        }
if (dato.equals("d"))
{
              for (int nocanal2 = 10; nocanal2 <= 25; nocanal2++) {
                  if (dato.equals("z")) {
                      break;
                  }
                System.out.println("Le subio:" + nocanal2+" al volumen");
                dato = Menu.nextLine();

                  
                 
                if (dato.equals("e"))
                   {
              for (int nocanal = nocanal2-1; 1 <= nocanal; nocanal--) {
if (dato.equals("z")) {
                      break;
                  }
                System.out.println("Le bajo:" + nocanal+" al volumen");
                dato = Menu.nextLine();
                  

        }

    }
        }

    }
        
        
        }
        
      else  if (dato.equals("b")||dato.equals("c")||dato.equals("d")||dato.equals("e")) {
            System.out.println("La Tv esta apagada");
        }
        
        
    }}
