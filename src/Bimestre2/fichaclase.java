package Bimestre2;

import java.util.Scanner;

public class fichaclase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        int indice =0;
        String nombres[] = new String[100];
        int edades[] = new int[100];
        String univerdades[] = new String[100];
        while (interruptor) {
            System.out.println("ingrese nombre del estudiante");
            nombres[indice] =teclado.nextLine();
            System.out.println("ingrese du edad");
            edades[indice]=teclado.nextInt();
            teclado.nextLine(); //para leer la edad despues de un enter
            System.out.println("ingrese universidad");
            univerdades[indice] = teclado.nextLine();
            indice++;
            System.out.println("¿desea ingresar un nuevo estudiante? si/no");
            String resp= teclado.nextLine().toLowerCase(); // en minusculas
            if (resp.equals("no"));
               interruptor = false;
        }
        for (int indice2 = 0; indice2 <= edades.length-1; indice2++) {
            for (int elemento = 0; elemento <= edades.length-2; elemento++) {
                //verificar si realizamos el intercambio
                if (edades[elemento]>edades[elemento+1]){
                    int aux_n = edades[elemento];
                    edades[elemento]= edades[elemento+1];
                    edades[elemento+1]= aux_n;
                    String aux_u= univerdades[elemento];
                    univerdades[elemento]= univerdades[elemento+1];
                    univerdades[elemento+1]= aux_u;
                    String nom= nombres[elemento];
                            nombres[elemento]=nombres[elemento+1];
                            nombres[elemento+1]=nom;
                        }
                }
                    }
        for (int pos = 0; pos < nombres.length; pos++) {
            if (nombres[pos]!= null){
                System.out.println("nombres "+ nombres[pos]);
                System.out.println("edades "+ edades[pos]);
                System.out.println("universidad  "+ univerdades[pos]);
            }
                }
            }
        }