import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.21; 
        
        System.out.print("Ingresa el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        
        double montoIVA = precioOriginal * IVA;
        double precioFinal = precioOriginal + montoIVA;
        
        System.out.println("\n--- Resumen de Compra ---");
        System.out.printf("Precio original: $%.2f%n", precioOriginal);
        System.out.println("IVA aplicado: 21%");
        System.out.printf("Precio final con IVA: $%.2f%n", precioFinal);
        
        scanner.close();
    }
}
