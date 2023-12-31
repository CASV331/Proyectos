public class FuncionesMatematicas {
    public static void main(String[] args) {
        int n=5, m=5;
        int radio = (int)(Math.random()*3+1); //Radio es un aleatorio entre el 1 y 3
        double resultado = Math.pow(n, m);
        double raiz = Math.sqrt(resultado);
        double area = Math.PI*radio*radio;
        System.out.println(n+" elevado a "+m+" = "+resultado);
        System.out.println("La raiz de "+resultado+" es: "+ raiz);
        System.out.println("El area de un circulo de "+radio+" es: "+ area);
        System.out.println("El area de un circulo redondeada es:"+(int)Math.round(area));
        System.out.println("El area de un circulo por arriba es:"+(int)Math.ceil(area));
        System.out.println("El area de un circulo por abajo es:"+(int)Math.floor(area));
        System.out.println("La raiz cuadrada de -2 es un NaN: "+Double.isNaN(Math.sqrt(-2)));
        System.out.println("1.0/0.0 = "+(1.0/0.0));
    }
    
}
