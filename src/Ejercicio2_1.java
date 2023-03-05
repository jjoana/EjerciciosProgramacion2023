import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        SumaNumeros objeto = new SumaNumeros();

        Scanner sc = new Scanner(System.in);
        int valor;
        int resultado;

        System.out.println("Introduzca el valor");
        valor = sc.nextInt();

        resultado = objeto.SumaNumerosR(valor);
        System.out.println(resultado);

        resultado = objeto.SumaNumeroI(valor);
        System.out.println(resultado);
    }
}

class SumaNumeros {
    public int SumaNumerosR(int n) {
        if (n > 0) {
            n += SumaNumerosR(n - 1);
        }
        return n;
    }

    public int SumaNumeroI(int n) {
        int valor = 0;
        for (int i = n; i > 0; i--) {
            valor += i;
        }
        return valor;
    }
}