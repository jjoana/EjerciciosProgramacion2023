import java.util.Scanner;

public class ExpLambda2_2I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor");
        int entrada = sc.nextInt();

        factorial operacion = (valor) -> {
            int calculand0 = 1;
            for (int i = valor; i > 1; i--) {
                calculand0 *= i;
            }
            return calculand0;

        };
        int resultado= operacion.CalculaFactorial(entrada);
        System.out.println(resultado);
    }
}

@FunctionalInterface
interface factorial {
    public int CalculaFactorial(int valor);
}
