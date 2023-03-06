import java.util.ArrayList;
import java.util.Scanner;

public class ExpLambda2_5_6I {

    public static void main(String[] args){
        ArrayList<Float> lista = new ArrayList<Float>();
        int tamano;
        Scanner sc = new Scanner(System.in);
        float valor;

        System.out.println("Añadimos el valor: ");
        while(sc.hasNextFloat()){
            valor = sc.nextFloat();
            lista.add(valor);
        }
        sc.close();
        tamano=lista.size();

        MediaAritmeticaI operacion = (miLista) -> {
            float resultado= 0f;
            for (int i = miLista.size() - 1; i >= 0; i--) {
                resultado += miLista.get(i)/tamano;
            }
            return resultado;
        };

        float resultado= operacion.calculaLista(lista);
        System.out.println(resultado);

    }

}

@FunctionalInterface 
interface MediaAritmeticaI{
    public float calculaLista(ArrayList<Float>lista);
}