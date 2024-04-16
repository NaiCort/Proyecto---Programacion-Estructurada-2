import java.util.EmptyStackException;

public class Pila_Main2 {
    private NodoPila cima;

    private static class NodoPila {
        String isbn; // Cambiar el tipo de dato de int a String
        String autor;
        String titulo;
        NodoPila siguiente;

        public NodoPila(String isbn, String autor, String titulo) { // Cambiar el tipo de dato del parámetro isbn
            this.isbn = isbn;
            this.autor = autor;
            this.titulo = titulo;
            this.siguiente = null;
        }
    }

    public void apilar(String isbn, String autor, String titulo) { // Cambiar el tipo de dato del parámetro isbn
        NodoPila nuevoNodo = new NodoPila(isbn, autor, titulo);
        if (estaVacia()) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
        System.out.println("Libro apilado correctamente.");
    }

    public void desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        NodoPila temp = cima;
        cima = cima.siguiente;
        temp.siguiente = null;
        System.out.println("Libro desapilado correctamente.");
    }

    public void obtenerTope() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        System.out.println("Libro en la cima de la pila:");
        System.out.println("ISBN: " + cima.isbn);
        System.out.println("Autor: " + cima.autor);
        System.out.println("Título: " + cima.titulo);
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.println("Contenido de la pila:");
        NodoPila actual = cima;
        while (actual != null) {
            System.out.println("ISBN: " + actual.isbn);
            System.out.println("Autor: " + actual.autor);
            System.out.println("Título: " + actual.titulo);
            actual = actual.siguiente;
        }
    }

    public boolean estaVacia() {
        return cima == null;
    }
}