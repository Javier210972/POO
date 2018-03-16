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
public class MenuBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Base = new Scanner(System.in);
        CalcBase Calcu = new CalcBase();
        String ingreso;
        System.out.println("Ingrese una opcion para calcular");
        System.out.println("(1)De Base 10 a base 8 ");
        System.out.println("(2)De base 10 a base 3 ");
        System.out.println("(3)De base 4 a base 10 ");
        System.out.println("(4)De base 7 a base 10 ");
        System.out.println("(5)Salir");
        ingreso=Base.next();
        
        if (ingreso.equals("1")) {
            Calcu.getValorD8();
        }
        if (ingreso.equals("2")) {
            Calcu.getValorD3();
        }
         if (ingreso.equals("3")) {
            Calcu.getValorB4();
        }
         if (ingreso.equals("4")) {
            Calcu.getValorB7();
        }
        
        
    }
    
}
