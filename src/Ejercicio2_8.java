import java.util.ArrayList;

public class Ejercicio2_8 {
    public static void main(String[] args){
        ArrayList<Integer> lista =  new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        calculoListaPares objeto = new calculoListaPares(lista);
        System.out.println(objeto.ListaParesIterativo());
    }
}

class calculoListaPares{
    ArrayList<Integer> listaInicial; 
    ArrayList<Integer> listaPares = new ArrayList<Integer>();

    public calculoListaPares(ArrayList<Integer> lista) {
        listaInicial = lista;
    }

    public ArrayList<Integer> ListaParesIterativo(){
        for(int i=1; i<= listaInicial.size(); i++){
            if(i % 2 == 0){
                listaPares.add(listaInicial.get(i-1));
            }
        }
        return(listaPares);
    }
}
