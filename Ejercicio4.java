 import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {4, 15, 23, 8, 42, 16, 90, 31, 12, 5};

        System.out.print("Introduce el número a buscar: ");
        int buscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscado + " sí está en el arreglo.");
        } else {
            System.out.println("El número " + buscado + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }
}
