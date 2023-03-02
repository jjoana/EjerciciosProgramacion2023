import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Introduzca numero en la lista. Si quiere salir pulse cualquiewr caracter no numkerico y luego enter: ");
        
        while(sc.hasNextInt()){
            System.out.println("Introduzca numero en la lista. Si quiere salir pulse cualquiewr caracter no numkerico y luego enter: ");
            valor = sc.nextInt();
            lista.add(valor);
        }
        sc.close();

        ListaNumeros objeto = new ListaNumeros();

        /// hacer una copia de la lista original usando el método clone()
        ArrayList<Integer> listaCopia = (ArrayList<Integer>) lista.clone();

        // hacer una copia de la lista original usando el constructor de ArrayList
        //ArrayList<Integer> listaCopia = new ArrayList<Integer>(lista);

        System.out.println(objeto.ListaNumerosRecursivo(lista));
        
        System.out.println(objeto.ListaNumerosIterativo(listaCopia));

    }
}
    class ListaNumeros {

        public int ListaNumerosRecursivo(ArrayList<Integer> milista) {
            int resultado = 0;
            if (!milista.isEmpty()) {
                resultado = milista.get(0);
                milista.remove(0);
                resultado += ListaNumerosRecursivo(milista);

            }
            return resultado;
        }

        public int ListaNumerosIterativo(ArrayList<Integer> milista) {
            int resultado = 0;
            milista.size();
            for (int i = milista.size() - 1; i >= 0; i--) {
                resultado += milista.get(i);
            }
            return resultado;
        }
    }

