import java.util.ArrayList;

public class Ejercicio2_3 {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        ListaNumeros listado = new ListaNumeros(lista);
        System.out.println(listado.sumaListadoRecursivo(lista));

    }

    class ListaNumeros {


        private ArrayList<Integer> listado;
    
        public ListaNumeros(ArrayList<Integer> listado) {
            this.listado = listado;
    
        }
    
        public int sumaListadoRecursivo(ArrayList<Integer> lista) {
            
            int valor=0;
            if (!lista.isEmpty()) {
                valor = lista.get(0);
                lista.remove(0);
                valor += sumaListadoRecursivo(lista);
            }
            return valor;
        }
    }
    
}