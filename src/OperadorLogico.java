public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE OPERADORES LÍDICOS O BOOLEANOS");
        boolean valor = (5==5); //operador relacional
        boolean valor_logico =((5==5) || (4>=3)); //v or v
        boolean valor_logico_and =((5==5) && (4>=3)); //v or v
        System.out.println("valor "  +valor);
        System.out.println("valor_logico "  +valor_logico);
        System.out.println("valor_logico_and "+valor_logico_and);
        System.out.println("negaciones de valor_logico   "+!valor_logico);
    }
}
