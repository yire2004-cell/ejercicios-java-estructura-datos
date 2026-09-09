 public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 22, 19, 4, 33, 8, 15, 60, 41};
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
 }
