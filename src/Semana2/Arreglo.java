package Semana2;

public class Arreglo {
    public static void main(String[] args) {
        // creacion de arrelos con valores prederterminados
        String universidades [] = {"utpl","unl","espol", "ucuenca","usfq","uide"};
        int tam = universidades.length; // obtener el tamaño del arreglo
        System.out.println("tamaño del arreglo" +  tam);
        for (int indice = 0; indice < tam; indice++) {
            System.out.println(universidades[indice] + " ");
        }
        //creacion de un arreglo de tipo eENTERO
        int notas [] = {8,2,3,4,54};
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println(notas[indice]);
        }
        //creacion de arreglo de tipo CHAR
        char vocales[] ={ 'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.println(vocales[indice]);
        }
        // creacion de arreglos tipo BOOLEAN
        boolean valores []={true,false,true,false};
        for (int indice = 0; indice < valores.length; indice++) {

        }
        //creacion de arreglos tipo DECIMAL
        double decimales []= {2.3 ,4.5 ,6.4};

    }
}
