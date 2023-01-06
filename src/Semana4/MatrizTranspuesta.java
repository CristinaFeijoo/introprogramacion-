package Semana4;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        char letras[][]={
                {'a','b','c'},
                {'d','e','f'},
        }; //dimension 2x3
        int filas = letras.length;
        int cols = letras[0].length;
        char transpuesta [][]= new char[cols][filas];
        for (int fila = 0; fila < cols; filas++) {
            for (int col = 0; col <filas; col++) {
                transpuesta[fila][col]=letras[col][fila];
                System.out.println(transpuesta[fila][col]+ "\t");
            }
            System.out.println();
        }
    }
}
