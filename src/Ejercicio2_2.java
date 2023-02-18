public class Ejercicio2_2{

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println("El valor es: " + factorial.factorialIterativo(5));
        System.out.println("El valor es: " + factorial.factorialRecursivo(5));
    }
}

class Factorial{
    public int factorialIterativo(int n){
        int valor = 1;
        for (int i=n; i>1; i--){
          valor*=i;
        }
        return valor;
    }
    
    public int factorialRecursivo(int n){
        if(n>1){
            n*= factorialRecursivo(n-1);
        }
        return n;
    }
}