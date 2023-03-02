import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2_5_6 {
    public static void main (String[] args){
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

        Calculo objeto = new Calculo(lista);
        System.out.println(objeto.mediaAritmeticaRecursivo(tamano));
        System.out.println(objeto.mediaAritmeticaIterativa(lista,tamano));1
    }
}

class Calculo{
    int tamanoLista;
    ArrayList<Float> listaI;

    public Calculo(ArrayList<Float> miLista){
        listaI = (ArrayList<Float>)miLista.clone();
        tamanoLista=miLista.size();
    }

    public float mediaAritmeticaRecursivo(int tamano){
        float valor = listaI.get(0)/tamanoLista;
        listaI.remove(0);
        if(tamano>1){
            valor+=mediaAritmeticaRecursivo(tamano-1);
        }
        return valor;
    }

    public float mediaAritmeticaIterativa(ArrayList<Float>miLista, int tamano){
        float valor= 0f;
        for (int i = miLista.size() - 1; i >= 0; i--) {
            valor += miLista.get(i)/tamanoLista;
        }
        return valor;

    }
}
