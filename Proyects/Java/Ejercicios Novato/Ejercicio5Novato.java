import java.util.Scanner;

public class Ejercicio5Novato {
    public static void main(String[] args) {
        
        float nota1,nota2,nota3,prom;
        Scanner nota = new Scanner(System.in);

        System.out.println("Ingresa la primera nota: ");
        nota1 = nota.nextFloat();
        System.out.println("Ingresa la segunda nota: ");
        nota2 = nota.nextFloat();
        System.out.println("Ingresa la tercer nota: ");
        nota3 = nota.nextFloat();
        nota.close();
        prom=((nota1+nota2+nota3)/3);
        if (prom<=5){
          System.out.println("Reprobaste, tu promedio es: "+prom);
        }else if(prom>5) {
            System.out.println("Aprobaste, tu promedio es: "+prom);
        }else{
            System.out.println("Revisa las notas que ingresaste de nuevo");
        }

        

        

    }
    
}
