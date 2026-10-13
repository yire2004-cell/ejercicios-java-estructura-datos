public class EjercicioListaEnlazada {
     // Clase interna que define la estructura de cada elemento (Nodo)
    private static class Nodo {
        int dato;
        Nodo siguiente;

        // El constructor inicializa el nodo con un dato y su referencia en null
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Puntero principal que indica el inicio de la lista
    private Nodo cabeza;

    public EjercicioListaEnlazada() {
        this.cabeza = null;
    }

    // Verifica si la lista no contiene elementos (O(1))
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Inserta un elemento al inicio de la lista modificando la cabeza (O(1))
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // Recorre la lista hasta el final para insertar un nuevo nodo (O(n))
    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    // Recorre la lista buscando una coincidencia con el dato proporcionado (O(n))
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Elimina la primera aparición de un dato reasignando los punteros (O(n))
    public boolean eliminar(int dato) {
        if (cabeza == null) return false;

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.dato == dato) {
                anterior.siguiente = actual.siguiente; // El Garbage Collector liberará el nodo
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    // Cuenta el total de nodos iterando desde la cabeza (O(n))
    public int contar() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // Retorna el valor en un índice específico (O(n))
    public int obtener(int indice) {
        if (indice < 0) throw new IndexOutOfBoundsException("Índice negativo");
        Nodo actual = cabeza;
        int posicion = 0;
        while (actual != null) {
            if (posicion == indice) return actual.dato;
            actual = actual.siguiente;
            posicion++;
        }
        throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
    }

    // Imprime la lista enlazada de forma visual
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" → ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

}
