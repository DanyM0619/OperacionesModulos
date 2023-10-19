import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Suma oper1 = new Suma();
        System.out.println("Esta es la suma: "+ oper1.operar(sc.nextDouble(),sc.nextDouble()));

        Resta oper2 = new Resta();
        System.out.println("Este es el resta: " + oper2.operar(sc.nextDouble(), sc.nextDouble()));

        Multiplicacion oper3 = new Multiplicacion();
        System.out.println("Este es la multiplicacion: "+ oper3.operar(sc.nextDouble(), sc.nextDouble()));

        Division oper4 = new Division();
        System.out.println("Este es la division: " + oper4.operar(sc.nextDouble(), sc.nextDouble()));

        Modulo oper5 = new Modulo();
        System.out.println("Este es la modulo: " + oper5.operar(sc.nextDouble(), sc.nextDouble()));*/


        System.out.println("Ingrese el numero del primer arreglo");
        int arreglo1 = sc.nextInt();
        System.out.println("Ingrese el numero del segundo arreglo");
        int arreglo2 = sc.nextInt();

        int[] array1= new int[arreglo1];
        int[] array2= new int[arreglo2];

        for(int i=0; i<array1.length; i++){
            System.out.println("Llenando el primer arreglo "+ i);
            array1[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------------");
        for(int i=0; i<array2.length; i++){
            System.out.println("Llenando el segundo arreglo "+ i);
            array2[i] = sc.nextInt();
        }

        int[] matrizFinal = new int[array1.length];
        for(int i=0; i<array1.length; i++){
            matrizFinal[i] = array1[i] + array2[i];
        }

        System.out.println("Primer arreglo");
        resultadosMatriz(array1);
        System.out.println("Segundo arreglo");
        resultadosMatriz(array2);
        System.out.println("La suma de los dos arreglos");
        resultadosMatriz(matrizFinal);
    }
    public static void resultadosMatriz(int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print(" "+arreglo[i]);
        }
        System.out.println();
    }

}