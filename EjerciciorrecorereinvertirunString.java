public class EjerciciorrecorereinvertirunString {
    public static String invertir(String texto) {
        // Caso base
        if (texto.isEmpty() || texto.length() == 1) {
            return texto;
        }
        // Llamada recursiva: invierte el resto del string y añade el primer carácter al final
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Recursividad";
        System.out.println("Original: " + original);
        System.out.println("Invertido: " + invertir(original));
    }

}
