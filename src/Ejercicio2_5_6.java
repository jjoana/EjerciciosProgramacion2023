import java.util.ArrayList;

public class Ejercicio2_5_6 {
    public static void main (String[] args){
        ArrayList<Float> lista = new ArrayList<Float>();
        int tamano;
        lista.add(3f);
        lista.add(2f);
        lista.add(6f);
        tamano=lista.size();

        Calculo objeto = new Calculo(lista);
        System.out.println(objeto.mediaAritmeticaRecursivo(tamano));
        System.out.println(objeto.mediaAritmeticaIterativa(lista,tamano));
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
