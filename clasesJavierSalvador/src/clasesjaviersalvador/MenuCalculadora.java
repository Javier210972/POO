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
public class MenuCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menuC = new Scanner(System.in);
        calculadora Calculadora = new calculadora();
        String opcion;
        System.out.println("Ingrese una letra");
        System.out.print("a)sumar ");
        System.out.print(" b)restar ");
        System.out.print(" c)multiplicar ");
        System.out.print(" d)promediar ");
        System.out.print(" e)mayor ");
        System.out.print(" f)menor ");
        System.out.println(" g)salir");
        opcion = menuC.nextLine();

        if (opcion.equals("a")) {
            System.out.println("Ingrese el primer valor");
            Calculadora.setValor1(menuC.nextInt());
            System.out.println("Ingrese el segundo valor");
            Calculadora.setValor2(menuC.nextInt());
            System.out.println("Ingrese el tercer valor");
            Calculadora.setValor3(menuC.nextInt());
            System.out.println("Ingrese el cuarto valor");
            Calculadora.setValor4(menuC.nextInt());
            System.out.println("Suma: "+Calculadora.suma());

        }
else if (opcion.equals("b")) {
            System.out.println("Ingrese el primer valor");
            Calculadora.setValor1(menuC.nextInt());
            System.out.println("Ingrese el segundo valor");
            Calculadora.setValor2(menuC.nextInt());
            System.out.println("Ingrese el tercer valor");
            Calculadora.setValor3(menuC.nextInt());
            System.out.println("Ingrese el cuarto valor");
            Calculadora.setValor4(menuC.nextInt());
            System.out.println("resta: "+Calculadora.resta());

        }
        
        else if (opcion.equals("c")) {
            System.out.println("Ingrese el primer valor");
            Calculadora.setValor1(menuC.nextInt());
            System.out.println("Ingrese el segundo valor");
            Calculadora.setValor2(menuC.nextInt());
            System.out.println("Ingrese el tercer valor");
            Calculadora.setValor3(menuC.nextInt());
            System.out.println("Ingrese el cuarto valor");
            Calculadora.setValor4(menuC.nextInt());
            System.out.println("multiplicacion: "+Calculadora.multiplicacion());

        }
        else if (opcion.equals("d")) {
            System.out.println("Ingrese el primer valor");
            Calculadora.setValor1(menuC.nextInt());
            System.out.println("Ingrese el segundo valor");
            Calculadora.setValor2(menuC.nextInt());
            System.out.println("Ingrese el tercer valor");
            Calculadora.setValor3(menuC.nextInt());
            System.out.println("Ingrese el cuarto valor");
            Calculadora.setValor4(menuC.nextInt());
            System.out.println("promedio: "+Calculadora.promedio());

        }
        
        else if (opcion.equals("e")) {
            System.out.println("Ingrese el primer valor");
            Calculadora.setValor1(menuC.nextInt());
            System.out.println("Ingrese el segundo valor");
            Calculadora.setValor2(menuC.nextInt());
            System.out.println("Ingrese el tercer valor");
            Calculadora.setValor3(menuC.nextInt());
            System.out.println("Ingrese el cuarto valor");
            Calculadora.setValor4(menuC.nextInt());
            System.out.println(Calculadora.mayor());
        }
           else if (opcion.equals("f")) {
           System.out.println("Ingrese primer valor");
           Calculadora.setValor1(menuC.nextInt());
            System.out.println("Ingrese el segundo valor");
            Calculadora.setValor2(menuC.nextInt());
            System.out.println("Ingrese el tercer valor");
            Calculadora.setValor3(menuC.nextInt());
            System.out.println("Ingrese el cuarto valor");
            Calculadora.setValor4(menuC.nextInt());
            System.out.println(Calculadora.menor());
}
            
          if (opcion.equals("g")) {
           System.exit(0);
       
            
        
    }

}
}
    

