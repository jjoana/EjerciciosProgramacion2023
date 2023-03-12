public class calculoNumeroPiI {
    public static void main(String[] args) {
        NumeroPi objeto = new NumeroPi();
        System.out.println("El valor del numero Pi será: " + objeto.NumeroPiI(10000000));
    }
}

class NumeroPi {

    float total=0f;
    float circulo=0f;

    public float NumeroPiI(int intentos) {
        for (int i = 1; i <= intentos; i++) {
            double coordenadasDeX = -1 + 2* Math.random();
            double coordenadasDeY = -1 + 2* Math.random();

            // Dependiendo de donde caiga el punto, aumentaré el total o solo el del circulo
            if (Math.sqrt(Math.pow(coordenadasDeX, 2) + Math.pow(coordenadasDeY, 2))<=1) {
                circulo++;
            }
            total++;
        }
        float valorPi= 4* (circulo/total);
        return valorPi;
    }

}
