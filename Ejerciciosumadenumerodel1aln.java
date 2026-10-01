public class Ejerciciosumadenumerodel1aln {
     public static int sumar(int n) {
        // Caso base
        if (n <= 1) {
            return 1;
        }
        // Llamada recursiva
        return n + sumar(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de 1 hasta " + n + " es: " + sumar(n));
    }

}
   