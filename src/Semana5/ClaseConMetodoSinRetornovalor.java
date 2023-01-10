package Semana5;

import java.util.Locale;

public class ClaseConMetodoSinRetornovalor {
    public static void main(String[] args) {
        //Crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornovalor llamada=new ClaseConMetodoSinRetornovalor();
        //llamada.saludar();
       saludar_con_nombre("Cris");
    }
    public static void saludar (){
        System.out.println("Bienvenido a la creacion de metodos");
        System.out.println("metodo creado en JAVA");
    }

    public static void  saludar_con_nombre (String nombre){
        System.out.println("Bienvenido"+nombre.toUpperCase()+"a la creacion de metodos");
        System.out.println("metodo creado en JAVA");    }
}
