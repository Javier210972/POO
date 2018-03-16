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
public class MenuPlanilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Planilla = new Scanner(System.in);
        Empleado Menu = new Empleado();
        String ingreso = "";

        while (!ingreso.equals("f")) {

            System.out.println("Ingrese una opcion");
            System.out.print(" a)Ingreso de datos ");
            System.out.print(" b)Mostrar informacion ");
            System.out.print(" c)Calculara IGSS ");
            System.out.print(" d)Sueldo liquido ");
            System.out.print("e)Aumento ");
            System.out.println("f)Salir");
            ingreso = Planilla.nextLine();

            if (ingreso.equals("a")) {
                System.out.println("Ingrese sus datos conforme se los piden");
                System.out.print("Codigo:");
                Menu.setCodigoempleado(Planilla.next());
                System.out.print("Nombre:");
                Menu.setNombre(Planilla.next());

                System.out.print("Apellido:");
                Menu.setApellido(Planilla.next());

                System.out.print("Carnet:");
                Menu.setNocarnet(Planilla.next());

                System.out.print("Sueldo base:");
                Menu.setSueldoBase(Planilla.nextDouble());

                System.out.print("bonificacion:");
                Menu.setBonificacion(Planilla.nextDouble());

                System.out.print("Descuentos:");
                Menu.setDescuentos(Planilla.nextDouble());
                System.out.println("DESEA MOSTRAR LOS DATOS? SI:b NO:cualquier letra");
                Planilla.nextLine();
                ingreso = Planilla.nextLine();

            }
            if (ingreso.equals("b")) {
                System.out.println(Menu.toString());
                System.out.println("Que dato desea calcular? ");
                ingreso = Planilla.nextLine();

            }

            if (ingreso.equals("c")) {
                System.out.println("El IGGS ES: " + Menu.getSueldoBase());

            }
            if (ingreso.equals("d")) {
                System.out.println("El sueldo liquido es: " + Menu.getLiquido());

            }
            if (ingreso.equals("e")) {
                System.out.println("El aumento es: " + Menu.getaumento());
                System.out.println("Desea otro aumento?");
                ingreso = Planilla.nextLine();
                if (ingreso.equals("e")) {
                    System.out.println("El 2 aumento es: " + Menu.getaumento2());
                    System.out.println("Desea uno mas?");
                    ingreso = Planilla.nextLine();
                    if (ingreso.equals("e")) {
                        System.out.println("El 3 aumento es: " + Menu.getaumento3());
                        if (ingreso.equals("e")) {
                            System.out.println("Limite de aumentos excedido");
                        }

                    }

                }
            }
        }

    }
}
