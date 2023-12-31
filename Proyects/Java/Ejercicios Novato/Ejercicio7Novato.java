import java.util.Scanner;

public class Ejercicio7Novato {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String cadena;
        int num;
        boolean comparativo;
        Scanner entrada = new Scanner(System.in);
    do{
        System.out.println("Ingresa un numero que sea postivo y con maximo 5 cifras");
        num = entrada.nextInt();
        cadena = String.valueOf(num);
           comparativo = num > 0 && cadena.length() <=5 ? true:false;
        if (comparativo)
            System.out.println("Numero ingresado: "+num+ ", primer numero: "+ cadena.charAt(0)+", ultimo numero: "+cadena.charAt(cadena.length()-1));

        else System.out.println("El numero ingesado no es positivo o es mayor a 5 caracteres, intenta de nuevo");
        
    }while (comparativo==false);
     entrada.close();
        

    }
}