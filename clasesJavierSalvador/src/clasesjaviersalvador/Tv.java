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
public class Tv {

    private int nocanal = 1;
    private int volumencanal=10;
    private boolean estado = false;

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
           
            if (this.nocanal == 0) {

                this.nocanal = 5;
            }
            if (this.nocanal == 1) {

                this.nocanal = 1;
            }
            if (this.nocanal == 5) {

                this.nocanal = 5;
            }
            
            System.out.println("TV Encendida, Canal:"+this.nocanal);
        } else {
            this.estado = false;
            System.out.println("TV Apadado");

        }
        return this.estado;
    }

    public boolean encendido2() {
        this.estado = true;
        return this.estado;
    }

    public void setNocanal(int nocanal) {
        this.nocanal = nocanal;

    }

    public int getnocanalS() {

        if (this.estado == true) {

            this.nocanal = this.nocanal + 1;
            System.out.println("Subio al canal:" + this.nocanal);
            if (this.nocanal == 5) {

                this.nocanal = 0;
            }

        } else if (this.estado == false) {
            System.out.println("TV Apagada, enciendala");
        }
        return nocanal;
    }

    public int getnocanalR() {

        if (this.estado == true) {
            if (this.nocanal == 0) {

                this.nocanal = 5;
            }
            if (this.nocanal == 1) {

                this.nocanal = 6;
            }

            this.nocanal = this.nocanal - 1;
            System.out.println("Bajo al canal:" + this.nocanal);
        } 
        else if (this.estado == false) {
            System.out.println("TV Apagada, enciendala");
        }
        return nocanal;
    }

    public int getVolumencanalS() {
        if (estado == true) {
             if (this.volumencanal==25) 
            {
              this.volumencanal=25;
            }
             else
             {
                 this.volumencanal++;
             }
               
            
            
             System.out.println("Subio el volumen a:" + this.volumencanal);
             
                
        }
       
         else if (this.estado == false) {
            System.out.println("TV Apagada, enciendala");
        }
        return volumencanal;
    }
    public int getVolumencanalB() {
        if (estado == true) {
             if (this.volumencanal==1) 
            {
              this.volumencanal=1;
            }
             else
             {
                 this.volumencanal--;
             }
               
            
            
             System.out.println("Bajo el volumen a:" + this.volumencanal);
             
                
        }
       
         else if (this.estado == false) {
            System.out.println("TV Apagada, enciendala");
        }
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
