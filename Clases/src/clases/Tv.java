/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author toshiba2
 */
public class Tv {
//    se definira atributo y metodos

    //Atributo
    private String marca;
    private String tipo;
    private int tamanio;//la Ñ es un caracter especial(no se usa)
    private double precio;
    private boolean estado;
    //METODOS

    public Tv(String marca,String tipo,int tamanio,double precio){
//     Metodo Constructor
     this.marca=marca;
     this.tipo=tipo;
     this.estado=false;//false=apagado-true=encendido
     this.tamanio=tamanio;
     this.precio=precio;
        System.out.println("television creada");
    }
    //sobre cargar metodo
    public Tv(){
        //Constructor
    }
    //Metodo de acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
//Para mostrar todos los datos del tiron
    @Override
    public String toString() {
        return "Tv{" + "marca=" + marca + ", tipo=" + tipo + ", tamanio=" + tamanio + ", precio=" + precio + ", estado=" + estado + '}';
    }
    
    public void encenderApagar(){
        
        if (estado==true) {
            System.out.println("la tv esta encendida, se apagara");
            this.estado=false;
        }
        else
        {
            System.out.println("tv apagada, se encendera");
            this.estado=true;
        }
    }
    public void cAMBIARCANAL(){
        
        if (estado==true) {
            System.out.println("se puede cambiar de canal");
            
        }
        else
        {
            System.out.println("encienda la tv");
            
        }
    }
    }
    