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
public class CalcBase {
    private int ValorD;
    private double ValorB;
    
    
    
    
    public CalcBase(){
    
    }
    
    public CalcBase(int ValorD,int ValorB){
        this.ValorD=ValorD;
        this.ValorB=ValorB;
        
        
        
        
    }

    public int getValorD8() {
     Scanner Base = new Scanner(System.in);
        int numero;
        int resultado;
        int residuo;
        int finalCiclo;
        String cadena;
        String acumulador="";
        
        System.out.println("Ingrese un Decimal");
        numero = Base.nextInt();
        
        finalCiclo = numero;
        
        for (int i = 1; i<=finalCiclo; i++) {
            resultado=numero/8;
            residuo=numero%8;
            numero=resultado;
            cadena = String.valueOf(residuo);
            
            
            acumulador = cadena + acumulador;
            if (numero==0) {
                i = finalCiclo+1;
            }
            
        }
            
        System.out.println("Numero a base 8: " + acumulador);
        return ValorD;
    }
     public int getValorD3() {
     Scanner Base = new Scanner(System.in);
        int numero;
        int resultado;
        int residuo;
        int finalCiclo;
        String cadena;
        String acumulador="";
        
        System.out.println("Ingrese un Decimal");
        numero = Base.nextInt();
        
        finalCiclo = numero;
        
        for (int i = 1; i<=finalCiclo; i++) {
            resultado=numero/3;
            residuo=numero%3;
            numero=resultado;
            cadena = String.valueOf(residuo);
            
            
            acumulador = cadena + acumulador;
            if (numero==0) {
                i = finalCiclo+1;
            }
            
        }
            
        System.out.println("Numero a base 3: " + acumulador);
         return ValorD;
     }
     public double getValorB4() {
      Scanner decimal = new Scanner(System.in);
        
        String Cuaternario;
        int largo;
        
        int i;
       
        int exp;
        double operacion;
        double operacion2;
        double operacion3;
        double suma = 0;
          String digito;
     

        System.out.println("ingrese un numero Cuaternario");
        Cuaternario = decimal.nextLine();
        largo = Cuaternario.length();
           exp=largo;
        for (int j = 0; j < largo; j++) {
            exp = exp-1;
            digito=Cuaternario.substring(j,j+1);
            
            if (digito.equals("1")) {
                operacion =Math.pow(4, exp);
                suma = operacion + suma;
            }
            if (digito.equals("2")) {
                operacion =Math.pow((4), exp);
                operacion2=operacion*2;
                suma = operacion2 + suma;
            }
            if (digito.equals("3")) {
                operacion =Math.pow((4), exp);
                operacion3=operacion*3;
                suma = operacion3 + suma;
            }
            
            
       }
        System.out.println("la base 10 del numero Cuaternario "+Cuaternario+" es: "+suma); 
       

    
         return ValorB;
     
     }
     public double getValorB7(){
       Scanner decimal = new Scanner(System.in);
        
        String Heptal;
        int largo;
        
        int i;
       
        int exp;
        double operacion;
        double operacion2;
        double operacion3;
         double operacion4;
          double operacion5;
           double operacion6;
        double suma = 0;
          String digito;
     

        System.out.println("ingrese un numero Heptal");
        Heptal = decimal.nextLine();
        largo = Heptal.length();
           exp=largo;
        for (int j = 0; j < largo; j++) {
            exp = exp-1;
            digito=Heptal.substring(j,j+1);
            
            if (digito.equals("1")) {
                operacion =Math.pow(7, exp);
                suma = operacion + suma;
            }
            if (digito.equals("2")) {
                operacion =Math.pow((7), exp);
                operacion2=operacion*2;
                suma = operacion2 + suma;
            }
            if (digito.equals("3")) {
                operacion =Math.pow((7), exp);
                operacion3=operacion*3;
                suma = operacion3 + suma;
            }
            if (digito.equals("4")) {
                operacion =Math.pow((7), exp);
                operacion4=operacion*4;
                suma = operacion4 + suma;
            }
            if (digito.equals("5")) {
                operacion =Math.pow((7), exp);
                operacion5=operacion*5;
                suma = operacion5 + suma;
            }
            if (digito.equals("6")) {
                operacion =Math.pow((7), exp);
                operacion6=operacion*6;
                suma = operacion6 + suma;
            }
            
            
       }
        System.out.println("la base 10 del numero Heptal "+Heptal+" es: "+suma);
         return ValorB;
     }
    public void setValorD(int ValorD) {
        this.ValorD = ValorD;
    }

    public double getValorB() {
        return ValorB;
    }

    public void setValorB(double ValorB) {
        this.ValorB = ValorB;
    }
    
}
