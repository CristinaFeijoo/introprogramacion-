package Semana4;

public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros [][]={
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };
        double suma_total = 0;
        //recorrer la matriz
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                suma_total=suma_total+numeros[fila][col];

            }
        }
        int num_elementos= numeros.length * numeros[0].length;
        double promedio = suma_total/ num_elementos;
        System.out.println("suma: "+ suma_total);
        System.out.println("promedio: "+ promedio);
    }
}
