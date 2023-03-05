import java.util.Scanner;

public class ExpLambda2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor");
        int entrada = sc.nextInt();

        I_operacion suma = (valor) -> {
            int calculando = 0;
            for (int i = valor; i > 0; i--) {
                calculando += i;
            }
            return calculando;
        };

        int resultado = suma.calculaOperacion(entrada);
        System.out.println(resultado);
    }
}

@FunctionalInterface
interface I_operacion {
    public int calculaOperacion(int valor);
}