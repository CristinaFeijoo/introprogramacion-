package Semana4;

public class Matriz {
    public static void main(String[] args) {
        //int matriz [][]= new int[2][3];
        //System.out.println(matriz[1][2]);
        //creacion de una matriz con valores prederteminados
        String univ [][]={
                {"utpl","ucuenca","espol"},
                 {"unl","uAzuay","uide"}
        };
        //System.out.println("dimension de la matriz");
        //System.out.println("filas = " + univ.length);
        //System.out.println("columnas =" + univ[1].length);
        int filas = univ.length;
        int columnas = univ [1].length;
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println(univ[fila][col] + " \t");
            }
            System.out.println();
        }
    }
}
