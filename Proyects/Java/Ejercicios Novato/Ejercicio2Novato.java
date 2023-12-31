import java.util.Scanner;

public class Ejercicio2Novato {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("introduzca el radio del circulo. ");
        
        double radio = entrada.nextDouble();

        double areaCirculo = Math.PI*(Math.pow( radio,2));
        
        System.out.println("El area del ciruclo es: "+areaCirculo);
        entrada.close();
    }
    
}
