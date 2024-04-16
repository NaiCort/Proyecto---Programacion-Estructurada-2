public class Pilas_Libros_Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro(12345,"Algoritmo Python", "Gerardelli", "IVES");
        Libro libro2 = new Libro(12346, "Programacion JAVA", "Gerardelli", "IVES");
        Libro libro3 = new Libro(12347, "Programacion C++", "Nacho", "IVES");
        Libro libro4 = new Libro(12348, "Programacion PHP", "Gerardelli", "IVES");
        Libro libro5 = new Libro(12349, "Programacion Ruby", "Gerardelli", "IVES");

        Pilas_Libros pilaLibro = new Pilas_Libros();

        pilaLibro.apilar(libro1);
        pilaLibro.apilar(libro2);
        pilaLibro.apilar(libro3);
        pilaLibro.apilar(libro4);
        pilaLibro.apilar(libro5);

        System.out.println(pilaLibro.length());
        pilaLibro.obtenerLibro();

        pilaLibro.desapilarN(2);


        System.out.println(pilaLibro.length());

    }
}