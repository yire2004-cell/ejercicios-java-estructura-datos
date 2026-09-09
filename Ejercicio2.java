public  class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {8, 10, 7, 9, 6};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
 
    

