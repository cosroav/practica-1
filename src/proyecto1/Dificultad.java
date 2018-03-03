/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author Mery Padilla
 */
public class Dificultad {

    int dificultad;
    Scanner lector = new Scanner(System.in);
    Scanner lector1 = new Scanner(System.in);
    Tablero tt = null;
    int cant_maxjugadores, cant_minjugadores;
    int cant_maxsubidas, cant_minsubidas;
    int cant_maxbajones, cant_minbajones;
    int cant_jugadores;
    String usuario[] = null;
    Parametros log = null;
    String caracter;
    int par, par1, par2;

    public void Dificultad_del_juego() {
        while (true) {
            System.out.println("1. Fácil");
            System.out.println("2. Difícil");
            System.out.println("3. Regresar");
            dificultad = lector.nextInt();

            switch (dificultad) {

                case 1:
//                    tt = new Tablero(dificultad);
//                    tt.Ponertexto("@");
//                    tt.Imprimirtablero();
                    System.out.println("Dificultad facil seleccionada");
                    System.out.println("Jugadores de 2 a 3");
                    System.out.println("Subidas 5 a 10");
                    System.out.println("Bajadas 5 a 10");

                    break;

                case 2:
//                    tt = new Tablero(dificultad);
//                    tt.Ponertexto(" ");
//                    tt.Imprimirtablero();
                    System.out.println("Dificultad dificil seleccionada");
                    System.out.println("Jugadores de 2 a 4");
                    System.out.println("Subidas 20 a 40");
                    System.out.println("Bajadas 20 a 40");

                    break;
                case 3:

                    Menu_Principal otro = new Menu_Principal();
                    otro.Menu_principal();
               
                    break;
            }
        }
    }

    public void Parametros() {
        while (true) {
            System.out.println("1. Jugadores");
            System.out.println("2. Subidas y bajones");
            System.out.println("3. Regresar");
            this.dificultad = lector1.nextInt();

            switch (dificultad) {

                case 1:
                    System.out.println("ingrese dificultad 1 ó 2");
                    this.dificultad = lector1.nextInt();
                    log = new Parametros(dificultad);
                    
                    
                    System.out.println("Ingrese numero de jugadores");

                    cant_jugadores = lector.nextInt();

                    if (dificultad == 1) {
                        if (cant_jugadores < cant_minjugadores) {

                            System.out.println("ingrese de nuevo el # de jugadores");

                            cant_jugadores = lector.nextInt();
                        } else if (cant_jugadores > cant_maxjugadores) {
                            System.out.println("ingrese de nuevo el # de jugadores1");
                            cant_jugadores = lector.nextInt();
                        }
                    } else if (dificultad == 2) {
                        if (cant_jugadores < cant_minjugadores) {

                            System.out.println("ingrese de nuevo el # de jugadores2");

                            cant_jugadores = lector.nextInt();
                        } else if (cant_jugadores > cant_maxjugadores) {
                            System.out.println("ingrese de nuevo el # de jugadores3");
                            cant_jugadores = lector.nextInt();
                        }
                    }

//                    usuario = new String[cant_jugadores];
//                    usuario[cant_jugadores] = "";
//                    for (int i = 0; cant_jugadores < usuario.length; i++) {
//                        System.out.println("Ingrese el nombre del Usuario " + (i + 1) + ":");
//                        caracter = "";
//                        caracter = lector.nextLine();
//                    }

                    break;

                case 2:

                    break;
                case 3:
                    Menu_Principal otro1 = new Menu_Principal();
                    otro1.Menu_principal();
                    break;

            }

        }
    }
}
