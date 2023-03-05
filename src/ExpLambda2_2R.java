import java.util.Scanner;
import java.util.function.*;

public class ExpLambda2_2R {




    
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor");
        int entrada = sc.nextInt();

        class Helper{
            
            UnaryOperator<Integer> factorial = (n) -> {
                if (n==0){
                    return 1;
                } else{
                    n*=this.factorial.apply(n-1);
                }
                return n;
            };
        }

        System.out.println(factorial.apply(entrada));

    }
}

