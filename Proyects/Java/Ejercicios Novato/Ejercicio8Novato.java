import java.util.Scanner;

public class Ejercicio8Novato {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int entradas, contador=0;
        float pago;
        String tarjeta, dia;
        Scanner entrada = new Scanner(System.in); 
       
        System.out.println("¡Bienvenido a Cinemex!");
        System.out.println(" ");
        System.out.println("¿Cuantas entradas quieres?");
        entradas = entrada.nextInt();
        System.out.println("¿Que dia asistiras?");
        entrada.nextLine();
        dia = entrada.nextLine();
        System.out.println("¿Tienes tarjeta de miembro?");
        tarjeta = entrada.nextLine();
        switch (dia) {
            case "miercoles":
             pago = entradas * 5;
             if(tarjeta.equalsIgnoreCase("si")){
                System.out.println("Tienes descuento!! tu pago es de: "+ (pago=pago-(pago*0.10f)));
                break;
             }else System.out.println("Tu pago es de: "+ pago);

                 break;
            case "jueves":
              pago = entradas * 8;
               do{
                if (entradas<2){
                entradas=entradas-2;
                contador++;
                }
            }while (contador<=1);

            System.out.println("Son "+contador+" grupos de 11 euros y"+entradas+"impar de 8 euros, su pago sera: "+ (pago =(contador*11)+ entradas * 8)); {
                
            }
                break;
            default: pago = entradas * 8;
            System.out.println("Tu pago es de: "+pago);
                break;
        } entrada.close();





    }
    
}
