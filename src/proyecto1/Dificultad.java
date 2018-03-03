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
    Scanner lector2 = new Scanner(System.in);
    Scanner lector3 = new Scanner(System.in);
    Tablero tt = null;
    int cant_maxjugadores, cant_minjugadores;
    int cant_maxsubidas, cant_minsubidas;
    int cant_maxbajones, cant_minbajones;
    int cant_jugadores;
    String usuario[] = null;
    Parametros log = null;
    String caracter;
    int par;
    int cant_subidas, cant_bajones;

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
            par = lector1.nextInt();

            switch (par) {
                case 1:
                    System.out.println("Seleccione su dificultad 1 ó 2");
                    dificultad = lector1.nextInt();
                    log = new Parametros(dificultad);
                    System.out.println("Ingrese numero de jugadores");
                    cant_jugadores = lector.nextInt();
                    if (dificultad == 1) {
                        if (cant_jugadores < cant_minjugadores || cant_jugadores > cant_maxjugadores) {
                            System.out.println("# invalido min 2, max 3, ingrese de nuevo");
                            cant_jugadores = lector.nextInt();
                        }

                    } else if (dificultad == 2) {
                        if (cant_jugadores < cant_maxjugadores || cant_jugadores > cant_maxjugadores) {
                            System.out.println("# invalido min 2, max 4");
                            cant_jugadores = lector.nextInt();
                        }
                    }
                    break;

                case 2:
                    System.out.println("Seleccione su dificultad 1 ó 2");
                    dificultad = lector1.nextInt();
                    log = new Parametros(dificultad);
                    System.out.println("Ingrese el numero de subidas");
                    cant_subidas = lector2.nextInt();
                    if (dificultad == 1) {
                        if (cant_subidas < cant_minsubidas || cant_subidas > cant_maxsubidas) {
                            System.out.println("# invalido min 5, max 10, ingrese de nuevo");
                            cant_subidas = lector2.nextInt();
                        }

                    } else if (dificultad == 2) {
                        if (cant_subidas < cant_minsubidas || cant_subidas > cant_maxsubidas) {
                            System.out.println("# invalido min 20, max 40, ingrese de nuevo");
                            cant_subidas = lector2.nextInt();
                        }
                    }
                     System.out.println("Elija el simbolo a utilizar");
                     

                    System.out.println("Ahora ingrese numero de bajones");
                    cant_bajones = lector3.nextInt();
                    if (dificultad == 1) {
                        if (cant_bajones < cant_minbajones || cant_bajones > cant_bajones) {
                            System.out.println("# invalido min 5, max 10, ingrese de nuevo");
                            cant_bajones = lector3.nextInt();
                        }
                    } else if (cant_bajones < cant_minbajones || cant_bajones > cant_bajones) {
                        System.out.println("# invalido min 20, max 40, ingrese de nuevo");
                        cant_bajones = lector3.nextInt();
                    }
                    break;
                case 3:
                    Menu_Principal otro1 = new Menu_Principal();
                    otro1.Menu_principal();
                    break;

            }

        }
    }
}
