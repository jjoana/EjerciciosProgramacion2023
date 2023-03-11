public class CalculoNumeroPi {
    public static void main(String[] args) {

        ClaseAuxiliar objeto = new ClaseAuxiliar();
        int numero_intentos = 3000;
        double puntos_dentro = objeto.calculo_numeros_dentro(numero_intentos);
        double numeroPI = 4 * puntos_dentro / numero_intentos;
        System.out.println(numeroPI);
    }
}

class ClaseAuxiliar {

    double coordenadaX;
    double coordenadaY;
    double numero = 0;

    public double calculo_numeros_dentro(int numerointentos) {
        if (numerointentos > 0) {
            coordenadaX = 1 - 2 * Math.random();
            coordenadaY = 1 - 2 * Math.random();
            if (Math.sqrt(Math.pow(coordenadaX, 2) + Math.pow(coordenadaY, 2)) <= 1) {
                numero = 1 + calculo_numeros_dentro(numerointentos - 1);
                return numero;
            } else {
                numero = numero + calculo_numeros_dentro(numerointentos - 1);
                return numero;
            }
        }
        return numero;
    }
}