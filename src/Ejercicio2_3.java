import java.util.ArrayList;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Potencia objeto = new Potencia();
        System.out.println(objeto.potenciaIterativa(2,2));
        System.out.println(objeto.potenciaRecursiva(2, 5));
    }
}

class Potencia {
    public int potenciaIterativa(int base, int exponente) {
        int resultado=1;
        for (int i = exponente; i > 0; i--) {
            resultado*= base;
        }
        return resultado;
    }

    public int potenciaRecursiva(int base, int exponente){
        int resultado=base;
        if(exponente>0){
            resultado *= potenciaRecursiva(base, exponente-1);
        }else{
            return 1;
        }
        return resultado;
    }    
}