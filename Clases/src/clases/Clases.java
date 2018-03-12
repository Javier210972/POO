/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author toshiba2
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ingreso= new Scanner(System.in);
       //ventaja de poo puede ingresarse mas de uno
      
       Tv nuevaTvL= new Tv();
      
        System.out.println("Ingrese 2 marc");
        nuevaTvL.setMarca(ingreso.next());
        System.out.println("la 2 marca es: "+nuevaTvL.getMarca());
       nuevaTvL.encenderApagar();
       nuevaTvL.cAMBIARCANAL();
         nuevaTvL.encenderApagar();
          nuevaTvL.cAMBIARCANAL();
        //Mostrar todo
      
        System.out.println(nuevaTvL.toString());
        
    }
    }
    


