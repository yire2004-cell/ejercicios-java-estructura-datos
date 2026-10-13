public class EjercicioMain {
 public static void main(String[] args) {
        EjercicioListaEnlazada lista = new EjercicioListaEnlazada();

        System.out.println("¿Está vacía? " + lista.estaVacia()); 

        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        System.out.print("Tras insertar 10, 20, 30 al final: ");
        lista.imprimir(); 

        lista.insertarAlInicio(5);
        System.out.print("Tras insertar 5 al inicio: ");
        lista.imprimir(); 

        System.out.println("¿Contiene 20? " + lista.buscar(20)); 
        System.out.println("¿Contiene 99? " + lista.buscar(99)); 

        System.out.println("Tamaño: " + lista.contar()); 
        System.out.println("Elemento en índice 2: " + lista.obtener(2)); 

        lista.eliminar(10);
        System.out.print("Tras eliminar 10: ");
        lista.imprimir(); 

        lista.eliminar(5); 
        System.out.print("Tras eliminar la cabeza (5): ");
        lista.imprimir(); 

        lista.eliminar(30); 
        System.out.print("Tras eliminar el último (30): ");
        lista.imprimir(); 

        lista.eliminar(20); 
        System.out.print("Tras eliminar todo: ");
        lista.imprimir(); 
    }
   
}
