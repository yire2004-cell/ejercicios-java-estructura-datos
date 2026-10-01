public class Ejerciciopotenciarecursiba {
     public static int calcularPotencia(int base, int exponente) {
        // Caso base
        if (exponente == 0) {
            return 1;
        }
        // Llamada recursiva
        return base * calcularPotencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + calcularPotencia(base, exponente));
    }

}
