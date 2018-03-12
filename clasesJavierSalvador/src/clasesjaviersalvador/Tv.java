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
public class Tv {

    private int nocanal=1;
    private int volumencanal;
    private boolean estado;

    public Tv() {
    }

    public Tv(int nocanal, int volumencanal, boolean estado) {
        this.nocanal = nocanal;
        this.volumencanal = volumencanal;
        this.estado = false;

    }

    public boolean encendido() {
        if (estado == false) {
            this.estado = true;
            System.out.println("Tv encendida, se encuentra en el canal 1");
        } else {
            this.estado = false;
            System.out.println("Tv apagada");

        }
        return this.estado;
    }
public boolean encendido2() {
        this.estado=true;
        return this.estado;
    }
    
    public void setNocanal(int nocanal) {
        this.nocanal = nocanal;

    }

    public int getnocanalS() {
      this.nocanal=this.nocanal+1;
        if (this.nocanal==5) {
            
           this.nocanal=1; 
        }
        return nocanal;
    }
    public int getnocanalR() {
      this.nocanal=this.nocanal-1;
        if (this.nocanal==1) {
            
           this.nocanal=5; 
        }
        return nocanal;
    }

    public int getVolumencanal() {
        return volumencanal;
    }

    public void setVolumencanal(int volumencanal) {
        this.volumencanal = volumencanal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
