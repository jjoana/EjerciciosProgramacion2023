import java.util.Scanner;
import java.util.function.*;

public class ExpLambda2_2R {

    Function<Integer, Integer> factorial_lambda;

    public ExpLambda2_2R(int valor) {
        factorial_lambda = (i) -> {
            if (i == 0) {
                return 1;
            } else {
                return i * factorial_lambda.apply(i - 1);
            }
        };
        System.out.println(factorial_lambda.apply(valor));
    }

    public static void main(String[] args) {
        new ExpLambda2_2R(4);
    }
}
