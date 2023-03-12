import java.util.Scanner;

public class Ejercicio2_2 {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner sc = new Scanner(System.in);
        long valor;
        long resultado;
        
        System.out.println("Introduzca el valor");
        valor = sc.nextLong();

        try {
            resultado = factorial.factorialRecursivo(valor);
            System.out.println(resultado);
            resultado = factorial.factorialIterativo(valor);
            System.out.println(resultado);
        } catch (NegativeNumberException e) {
            System.out.println("El numero que ha introducido es negativo");
        } catch (ToLargeNumberException e){
            System.out.println("El numero es demasiado grande");
        }
    }
}

class Factorial {
    public long factorialIterativo(long n) throws NegativeNumberException, ToLargeNumberException {
        if (n < 0) {
            throw (new NegativeNumberException());
        }

        if(n>=21){
            throw (new ToLargeNumberException());
        }

        long valor = 1;
        for (long i = n; i > 1; i--) {
            valor *= i;
        }
        return valor;
    }

    public long factorialRecursivo(long n) throws NegativeNumberException, ToLargeNumberException {
        if (n < 0) {
            throw (new NegativeNumberException());
        }

        if(n>=21){
            throw (new ToLargeNumberException());
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

class ToLargeNumberException extends Exception{
}