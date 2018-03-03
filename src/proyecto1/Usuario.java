/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Mery Padilla
 */
public class Usuario {//tine caracter y posicion que es fila y columna

    String simbolo;
    int fila;
    int columna;

    public Usuario(String simbolo) {
//        establecer que valores va a tener cada variable
         this.simbolo= simbolo;
         
         //genera un ramdom por turno por metodo tirar dado
         
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

}
