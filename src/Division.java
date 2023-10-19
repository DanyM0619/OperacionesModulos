public class Division implements OperacionesI{

    @Override
    public double operar(double numero1, double numero2) {
        if(numero2 != 0){
            return numero1 / numero2;
        }else{
            System.out.println("No es divisible por el numero2 "+numero2);
            return 0;
        }
    }
}
