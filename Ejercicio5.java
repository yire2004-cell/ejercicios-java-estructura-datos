public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("--- Lista de números del 1 al 100 ---");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n--- Números divisibles entre 2 y 3 ---");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("El número " + i + " es divisible entre 2 y 3.");
            }
        }
    }
}
