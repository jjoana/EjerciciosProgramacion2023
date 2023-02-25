import java.util.ArrayList;

public class Ejercicio2_5_6 {
    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int tamano;
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        tamano=lista.size();

        Calculo objeto = new Calculo(lista);
        System.out.println(objeto.mediaAitmeticaRecursivo(tamano));
    }
}

class Calculo{

    ArrayList<Integer> listaii = new ArrayList<Integer>();
    
    public Calculo(ArrayList<Integer> listaTrabajo){
        listaii = listaTrabajo;
    }

    public float mediaAitmeticaRecursivo(int tamano){
        float valor = listaii.get(0)/tamano;
        listaii.remove(0);
        if(tamano>1){
            valor= mediaAitmeticaRecursivo(tamano-1);
        }
        return valor;
    }
}
