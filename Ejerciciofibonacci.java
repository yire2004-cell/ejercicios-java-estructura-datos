public class Ejerciciofibonacci {
     public static int fibonacci(int n) {
        // Casos base
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        // Llamada recursiva doble
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int posicion = 6;
        System.out.println("El número de Fibonacci en la posición " + posicion + " es: " + fibonacci(posicion));
    }

}
