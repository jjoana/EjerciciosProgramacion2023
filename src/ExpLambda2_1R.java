import java.util.Scanner;
import java.util.function.*;;

public class ExpLambda2_1R {

    Function<Integer, Integer> sumaNumeroLambda;

    public ExpLambda2_1R(int valor) {
        sumaNumeroLambda = (i) -> {
            if (i > 0)
                return i + sumaNumeroLambda.apply(i - 1);
            {
            }
            return i;
        };
        System.out.println(sumaNumeroLambda.apply(valor));
    }

    public static void main(String[] args) {
        new ExpLambda2_1R(6);
    }

}
