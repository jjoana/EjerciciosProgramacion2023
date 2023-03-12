import java.util.Scanner;

public class Ejercicio2_2 {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        try {
            Scanner sc = new Scanner(System.in);
            int valor;
            int resultado;
            
            System.out.println("Introduzca el valor");
            valor = sc.nextInt();

            resultado = factorial.factorialRecursivo(valor);
            System.out.println(resultado);

            resultado = factorial.factorialIterativo(valor);
            System.out.println(resultado);

        } catch (NegativeNumberException e) {
            System.out.println("El numero que ha introducido es negativo");
        }
    }
}

class Factorial {
    public int factorialIterativo(int n) throws NegativeNumberException {
        if (n < 0) {
            throw (new NegativeNumberException());
        }
        int valor = 1;
        for (int i = n; i > 1; i--) {
            valor *= i;
        }
        return valor;
    }

    public int factorialRecursivo(int n) throws NegativeNumberException {
        if (n < 0) {
            throw (new NegativeNumberException());
        }
        if (n > 0) {
            n *= factorialRecursivo(n - 1);
        } else {
            return 1;
        }
        return n;
    }
}

class NegativeNumberException extends Exception {

}