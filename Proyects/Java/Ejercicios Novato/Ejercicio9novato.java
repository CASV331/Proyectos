import java.util.Scanner;

public class Ejercicio9novato {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String eleccion;
        String cpueleccion;
        System.out.println("Ingresa una opcion:");
        eleccion = entrada.nextLine();
        entrada.close();
        int num = (int) (Math.random()*5+1);
        switch (num) {
            case 1:
                cpueleccion = "tijeras";
                switch (eleccion) {
                    case "papel":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "lagarto":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "piedra": 
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "spock":
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    default:
                         System.out.println("      EMPATE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+ eleccion+ " :jugador");
                        break;
                }
                break;
        
            case 2:
                cpueleccion = "papel";
                switch (eleccion) {
                    case "piedra":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "spock":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "lagarto": 
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "tijeras":
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    default:
                         System.out.println("      EMPATE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+ eleccion+ " :jugador");
                        break;
                }
                break;
            case 3:
                cpueleccion = "piedra";
                switch (eleccion) {
                    case "tijeras":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "lagarto":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "papel": 
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "spock":
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    default:
                         System.out.println("      EMPATE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+ eleccion+ " :jugador");
                        break;
                }
                break;
            case 4:
                cpueleccion = "spock";
                switch (eleccion) {
                    case "tijeras":
                         System.out.println("    PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "piedra":
                         System.out.println("    PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "lagarto": 
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "papel":
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    default:
                         System.out.println("      EMPATE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+ eleccion+ " :jugador");
                        break;
                }
                break;
            case 5:
                cpueleccion = "lagarto";
                switch (eleccion) {
                    case "papel":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "spock":
                         System.out.println("     PERDISTE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "piedra": 
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    case "tijeras":
                          System.out.println("     GANASTE");
                          System.out.println("CPU: "+cpueleccion+" ------ "+eleccion+ " :jugador");
                        break;
                    default:
                         System.out.println("      EMPATE");
                         System.out.println("CPU: "+cpueleccion+" ------ "+ eleccion+ " :jugador");
                        break;
                }
                break;            
        }
        
           
        
        
    }
    
}
