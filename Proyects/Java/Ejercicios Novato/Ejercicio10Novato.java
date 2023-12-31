import java.util.Scanner;

public class Ejercicio10Novato {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado;
        System.out.println("introduce un numero para imprimir su trabla de multiplicar");
        int num = entrada.nextInt();
        for (int i=1; i<=10;i++){
           resultado = num*i;
           System.out.println(num+" X "+i+" = "+resultado);

        }
    entrada.close();
}
}