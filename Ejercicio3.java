public   class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {14, 55, 3, 89, 42, 11, 78, 25};
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
}

