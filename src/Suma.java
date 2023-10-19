public class Suma implements OperacionesI{

    @Override
    public double operar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }
}
