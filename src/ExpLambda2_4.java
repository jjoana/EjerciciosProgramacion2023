import java.util.ArrayList;
import java.util.Scanner;

public class ExpLambda2_4 {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Introduzca los numeros que quiera para su lista: ");
        
        while(sc.hasNextInt()){
            valor = sc.nextInt();
            lista.add(valor);
        }
        sc.close();

        SumaListaI operacion = (milista) -> {
            int resultado = 0;
            milista.size();
            for (int i = milista.size() - 1; i >= 0; i--) {
                resultado += milista.get(i);
            }
            return resultado;

        };
        
        int resultado= operacion.calculaLista(lista);
        System.out.println(resultado);

    }
}

@FunctionalInterface
interface SumaListaI {
    public int calculaLista(ArrayList<Integer>lista);
}
