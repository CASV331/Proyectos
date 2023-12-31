public class Condiciones {
    public static void main(String[] args) {
       
        int x=6;
        
        switch (x) {
            case 1:
            case 2:
            case 3:
                 System.out.println("El valor de x estaba entre el 1 y 3"); break;
            case 4:
            case 5:
                System.out.println("El valor de x era 4 o 5"); break;
            case 6:
                 System.out.println("El valor de x era 6");
                 x=10;
                 System.out.println("Operaciones auxiliares completadas");
                break;
        
            default:
                 System.out.println("El valor de x no estaba entre 1 y 6");
                break;
        }
       
    }
    
}
