/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Mery Padilla
 */
public class Menu_Principal {

    public void Menu_principal() {
        System.out.println("Subidas y Bajones");
        System.out.println("");
        System.out.println("1. Dificultad del Juego");
        System.out.println("2. Parámetros del Juegos");
        System.out.println("3. Iniciar el Juego");
        System.out.println("4. Salir");
        Scanner intro = new Scanner(System.in);
        int seleccion = intro.nextInt();
        switch (seleccion) {
            case 1:
                Dificultad otro = new Dificultad();
                otro.Dificultad_del_juego();

                break;
            case 2:
                Dificultad otro3 = new Dificultad();
                otro3.Parametros();

                break;
            case 3:
                
                break;
            case 4:
                System.out.println("");
                exit(0);
                break;

        }

    }
}
