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
public class Empleado {
   private String Codigoempleado;
 private String Nombre;
private String Apellido;
private String Nocarnet;
private double SueldoBase;
private double Bonificacion;
private double Descuentos;
private double Liquido;
private double aumento;
private double IGGS;



public Empleado() {
 }

public Empleado(String Codigo,String Nombre,String Apellido,String Nocarnet,double SueldoBase,double Bonificacion,double Descuentos,double liquido,double aumento,double IGGS)
{
 this.Codigoempleado=Codigo;
 this.Nombre=Nombre;
 this.Apellido=Apellido;
 this.Nocarnet=Nocarnet;
 this.SueldoBase=SueldoBase;
 this.Bonificacion=Bonificacion;
 this.Descuentos=Descuentos;
 this.Liquido=liquido;
 this.aumento=aumento;
 this.IGGS=IGGS;
 

}


public String getCodigoempleado() {
        return Codigoempleado;
    }

    public void setCodigoempleado(String Codigoempleado) {
        this.Codigoempleado = Codigoempleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNocarnet() {
        return Nocarnet;
    }

    public void setNocarnet(String Nocarnet) {
        this.Nocarnet = Nocarnet;
    }
    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase=SueldoBase;
    }
    
public void setIGGS(double IGGS) {
        this.IGGS=IGGS;
    }

    public double getSueldoBase() {
        this.IGGS=0.0483*(this.SueldoBase);
        
        return this.IGGS;
    }
    
public double getLiquido(){
     this.Liquido=this.SueldoBase+this.Bonificacion - (0.0483*this.SueldoBase);
     return this.Liquido;
}
public double getaumento(){
     this.aumento=(this.SueldoBase*0.10)+this.SueldoBase;
     return this.aumento;
    
}
public double getaumento2(){
   this.aumento=((this.SueldoBase*0.10)+this.SueldoBase*0.10)+this.SueldoBase;
     return this.aumento;
}
public double getaumento3(){
   this.aumento=(((this.SueldoBase*0.10)+this.SueldoBase*0.10)+this.SueldoBase*0.10+this.SueldoBase);
     return this.aumento;
}
   

    public double getBonificacion() {
        return Bonificacion;
    }
 
 
    public void setBonificacion(double Bonificacion) {
        this.Bonificacion = Bonificacion;
    }

    public double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(double Descuentos) {
        this.Descuentos = Descuentos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Codigoempleado=" + Codigoempleado + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Nocarnet=" + Nocarnet + ", SueldoBase=" + SueldoBase + ", Bonificacion=" + Bonificacion + ", Descuentos=" + Descuentos + '}';
    }


}