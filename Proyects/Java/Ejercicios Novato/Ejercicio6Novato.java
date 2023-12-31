import java.util.Scanner;

public class Ejercicio6Novato {
    public static void main(String[] args) {
        float num1,num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresa el primer numero:");
        num1 = entrada.nextFloat();


        System.out.println("ingresa el segundo numero:");
        num2 = entrada.nextFloat();
        entrada.close(); 
        float mayor = num1>num2 ? num1:num2;

        if (mayor % 2 ==0){
        System.out.println(mayor+" es divisible entre 2");
        }else {System.out.println("No es divisible entre 2");}
        if (mayor % 5 ==0){
            System.out.println(mayor+" es divisible entre 5");

        }else {
            System.out.println("El numero no es divisible con 2 o 5");
        }


    }
        
    }
    

