/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesjaviersalvador;

/**
 *
 * @author toshiba2
 */
public class calculadora {

    private int valor1;
    private int valor2;
    private int valor3;
    private int valor4;
    private int suma;
    private int resta;
    private int multiplicacion;
    private double promedio;
     private int mayor;
      private int menor;
       

    public calculadora() {

    }

    public calculadora(int valor1, int valor2, int valor3, int valor4, int suma,int resta,int multiplicacion,double promedio,int mayor,int menor) {

        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
        this.suma = suma;
        this.resta=resta;
        this.multiplicacion = multiplicacion;
        this.promedio = promedio;
        this.mayor = mayor;
        this.menor = menor;
        

    }

    public int suma() {
        this.suma = this.valor1 + this.valor2 + this.valor3 + this.valor4;
        return this.suma;
}
public int resta() {
        this.resta = this.valor1 - this.valor4;
        return this.resta;
}
public int multiplicacion() {
        multiplicacion = this.valor1 * this.valor2 * this.valor3 * this.valor4;
        return this.multiplicacion;
}
  public double promedio() {
        promedio = (this.valor1 + this.valor2 + this.valor3 + this.valor4)/4;
        return this.promedio;
}  
  public int mayor(){
      if (valor1>valor2&&valor3<valor1&&valor4<valor1) {
          System.out.println("el mayor es:"+valor1);    
      }
      
         else if (valor2>valor1&&valor3<valor2&&valor4<valor2) {
          System.out.println("el mayor es:"+valor2);    
      }
      else if (valor3>valor1&&valor3>valor2&&valor4<valor3) {
          System.out.println("el mayor es:"+valor3);    
      }
       else if (valor4>valor1&&valor4>valor2&&valor4>valor3) {
          System.out.println("el mayor es:"+valor4);    
      }
      return this.mayor;
  }
  public int menor(){
      if (valor1<valor2&&valor3>valor1&&valor4>valor1) {
          System.out.println("el menor es:"+valor1);    
      }
      
         else if (valor2<valor1&&valor3>valor2&&valor4>valor2) {
          System.out.println("el menor es:"+valor2);    
      }
      else if (valor3<valor1&&valor3<valor2&&valor4>valor3) {
          System.out.println("el menor es:"+valor3);    
      }
       else if (valor4<valor1&&valor4<valor2&&valor4<valor3) {
          System.out.println("el menor es:"+valor4);    
      }
      return this.menor;
  }
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor4() {
        return valor4;
    }

    public void setValor4(int valor4) {
        this.valor4 = valor4;
    }

    

}
