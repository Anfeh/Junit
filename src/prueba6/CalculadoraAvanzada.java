package prueba6;

public class CalculadoraAvanzada {

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double logaritmoNatural(double numero) {
        return Math.log(numero);
    }

    public long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número debe ser mayor o igual a 0.");
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}