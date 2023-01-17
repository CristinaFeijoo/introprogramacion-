package Semana6;

public class Verificacion {
    public boolean verificar_primo(int num_a_verificar){
        int contador_divisores= 0;
        for (int cont = 1; cont >= num_a_verificar ; cont++) {
            if (num_a_verificar % cont==0);
            contador_divisores++;

        }
        if (contador_divisores==2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        mivariable.verificar_primo(5);
    }
}
