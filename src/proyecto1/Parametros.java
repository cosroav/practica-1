/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

//import java.util.Random;

/**
 *
 * @author Mery Padilla
 */
public class Parametros {

    int dificultad;
    int cant_maxjugadores, cant_minjugadores;
    int cant_maxsubidas, cant_minsubidas;
    int cant_maxbajones, cant_minbajones;
    int cant_jugadores;

    public Parametros(int dificultad) {
        if (dificultad == 1) {
            this.dificultad = dificultad;
            this.cant_maxbajones = 8;
            this.cant_minbajones = 5;
            this.cant_maxsubidas = 8;
            this.cant_minsubidas = 5;
            this.cant_minjugadores = 2;
            this.cant_maxjugadores = 3;
        } else if (dificultad == 2) {
            this.dificultad = dificultad;
            this.cant_maxbajones = 40;
            this.cant_minbajones = 20;
            this.cant_maxsubidas = 40;
            this.cant_minsubidas = 20;
            this.cant_minjugadores = 2;
            this.cant_maxjugadores = 4;
        }

    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getCant_maxjugadores() {
        return cant_maxjugadores;
    }

    public void setCant_maxjugadores(int cant_maxjugadores) {
        this.cant_maxjugadores = cant_maxjugadores;
    }

    public int getCant_minjugadores() {
        return cant_minjugadores;
    }

    public void setCant_minjugadores(int cant_minjugadores) {
        this.cant_minjugadores = cant_minjugadores;
    }

    public int getCant_maxsubidas() {
        return cant_maxsubidas;
    }

    public void setCant_maxsubidas(int cant_maxsubidas) {
        this.cant_maxsubidas = cant_maxsubidas;
    }

    public int getCant_minsubidas() {
        return cant_minsubidas;
    }

    public void setCant_minsubidas(int cant_minsubidas) {
        this.cant_minsubidas = cant_minsubidas;
    }

    public int getCant_maxbajones() {
        return cant_maxbajones;
    }

    public void setCant_maxbajones(int cant_maxbajones) {
        this.cant_maxbajones = cant_maxbajones;
    }

    public int getCant_minbajones() {
        return cant_minbajones;
    }

    public void setCant_minbajones(int cant_minbajones) {
        this.cant_minbajones = cant_minbajones;
    }

    public int getCant_jugadores() {
        return cant_jugadores;
    }

    public void setCant_jugadores(int cant_jugadores) {
        this.cant_jugadores = cant_jugadores;
    }
//    Random dado = new Random();
//    int num;
//    num = (dado.nextInt(6)+1);
}
