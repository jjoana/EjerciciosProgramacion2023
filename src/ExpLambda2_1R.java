import java.util.Scanner;

public class ExpLambda2_1R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor");
        int entrada = sc.nextInt();

        I_operacionR suma = (valor) -> {
            int resultado = 0;
            if (valor > 0) {
                resultado += I_operacionR(valor - 1);
            }
            return resultado;
        };

    }

    @FunctionalInterface
    interface I_operacionR {
        public int calculaOperacion(int valor);
    }
}
