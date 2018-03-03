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
public class Tablero {

    String matriz[][] = null;
    int filas, columnas, dificultad;

    public Tablero(int dificultad) {
        if (dificultad == 1) {
            this.filas = 5;
            this.columnas = 8;
            this.dificultad = dificultad;
            this.matriz = new String[this.filas][this.columnas];

        } else if (dificultad == 2) {
            this.filas = 20;
            this.columnas = 10;
            this.dificultad = dificultad;
            this.matriz = new String[this.filas][this.columnas];

        }

    }

    public String[][] getMatriz() {
        //tambien tengo que hace que limpie y que envie los caracteres
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public void Ponertexto(String simbolo) {
        //buscar diseño de tablero
        int numero = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (numero <= 9) {
                    matriz[i][j] = "{" + simbolo + "    " + numero + "}";
                } else if (numero >= 10 && numero <= 99) {
                    matriz[i][j] = "{" + simbolo + "   " + numero + "}";
                } else if (numero >= 100) {
                    matriz[i][j] = "{" + simbolo + "  " + numero + "}";
                }

                if (dificultad == 1) {
                    if (i % 2 == 0) {
                        if (j == 7) {
                            numero += 8;
                        } else {
                            numero++;
                        }
                    } else {
                        if (j == 7) {
                            numero += 8;
                        } else {
                            numero--;
                        }
                    }
                } else if (dificultad == 2) {
                    if (i % 2 == 0) {
                        if (j == 9) {
                            numero += 10;
                        } else {
                            numero++;
                        }
                    } else {
                        if (j == 9) {
                            numero += 10;
                        } else {
                            numero--;
                        }
                    }

                }

            }
        }
    }

    public void Imprimirtablero() {
        //recorrer filas de arriba para abajo
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
