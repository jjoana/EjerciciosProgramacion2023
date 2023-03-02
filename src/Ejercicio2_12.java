import java.util.Scanner;

public class Ejercicio2_12 {

    public static void main(String[] args) {

        Fibonacci objeto = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int valor;
        int resultado;

        System.out.println("Indique el idice de la serie de Fibonacci");
        valor = sc.nextInt();
        
        resultado = objeto.FibonacciR(valor);
        System.out.println(resultado);
    }
}

class Fibonacci {
    public int FibonacciR(int n) {
        int resultado;
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                resultado = FibonacciR(n - 1) + FibonacciR(n - 2);
                return resultado;
            }
        }
    }

    public int FibonacciI(int n){

        
    }
}
