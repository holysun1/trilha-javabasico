package Operadores;
import java.util.Calendar;
import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        //System.out.println(numero);
        final double VALOR_DE_PI = 3.14;
         //VALOR_DE_PI = 10.75; - PELA VARIÁVEL SER FINAL , NÃO PODE SER ATRUBUIDO OUTRO VALOR
    }
}
