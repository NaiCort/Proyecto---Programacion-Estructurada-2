import java.util.Scanner;

public class AB_Menu_Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila_Main2 pila = new Pila_Main2();
        Listas_Enlazadas listaEnlazada = new Listas_Enlazadas();
        Colas_Pedidos colaPedidos = new Colas_Pedidos();
        Arbol_Binario abb = new Arbol_Binario(); // Agregamos una instancia de Arbol_Binario

        boolean salir = false;

        do {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    accederPilas(scanner, pila);
                    break;
                case 2:
                    accederListasEnlazadas(scanner, listaEnlazada);
                    break;
                case 3:
                    accederColas(colaPedidos);
                    break;
                case 4:
                    accederArbolBinario(scanner, abb); // Nueva opción para acceder al árbol binario
                    break;
                case 5:
                    accederPilasLibros(); // Opción para acceder a las funciones de Pilas_Libros_Main
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (!salir);

        // Cerrar el scanner al salir del programa
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú Principal");
        System.out.println("1. Pilas");
        System.out.println("2. Listas Enlazadas");
        System.out.println("3. Colas");
        System.out.println("4. Árbol Binario"); // Nueva opción para el árbol binario
        System.out.println("5. Pilas de Libros"); // Nueva opción para las funciones de Pilas_Libros_Main
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void accederPilas(Scanner scanner, Pila_Main2 pila) {
        int opcion;

        do {
            mostrarMenuPilas();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.next();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.next();
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.next();
                    pila.apilar(isbn, autor, titulo);
                    break;
                case 2:
                    pila.desapilar();
                    break;
                case 3:
                    pila.obtenerTope();
                    break;
                case 4:
                    System.out.println("Contenido de la pila:");
                    pila.mostrarPila();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }

        } while (opcion != 5);
    }

    private static void mostrarMenuPilas() {
        System.out.println("\nFunciones de Pilas");
        System.out.println("1. Agregar elemento");
        System.out.println("2. Eliminar elemento");
        System.out.println("3. Obtener elemento en la cima");
        System.out.println("4. Mostrar la pila");
        System.out.println("5. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void accederListasEnlazadas(Scanner scanner, Listas_Enlazadas lista) {
        int opcion;

        do {
            mostrarMenuListasEnlazadas();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    int valorInicio = scanner.nextInt();
                    lista.insertarAlInicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    int valorFinal = scanner.nextInt();
                    lista.insertarAlFinal(valorFinal);
                    break;
                case 3:
                    System.out.print("Ingrese la posición: ");
                    int posicion = scanner.nextInt();
                    System.out.print("Ingrese el valor a insertar: ");
                    int valorPosicion = scanner.nextInt();
                    lista.insertarEnPosicion(posicion, valorPosicion);
                    break;
                case 4:
                    lista.mostrarNodos();
                    break;
                case 5:
                    lista.contar();
                    break;
                case 6:
                    System.out.print("Ingrese la posición del nodo a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    lista.eliminarNodo(posicionEliminar);
                    break;
                case 7:
                    lista.eliminarAlInicio();
                    break;
                case 8:
                    lista.eliminarAlFinal();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }

        } while (opcion != 9);
    }

    private static void mostrarMenuListasEnlazadas() {
        System.out.println("\nFunciones de Listas Enlazadas");
        System.out.println("1. Insertar elemento al inicio");
        System.out.println("2. Insertar elemento al final");
        System.out.println("3. Insertar elemento en una posición");
        System.out.println("4. Mostrar los nodos");
        System.out.println("5. Contar nodos");
        System.out.println("6. Eliminar nodo en una posición");
        System.out.println("7. Eliminar primer nodo");
        System.out.println("8. Eliminar último nodo");
        System.out.println("9. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void accederColas(Colas_Pedidos colaPedidos) {
        // Código para acceder a las colas, sin cambios
    }

    private static void accederArbolBinario(Scanner scanner, Arbol_Binario abb) {
        int opcion;

        do {
            mostrarMenuArbolBinario();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    int valor = scanner.nextInt();
                    abb.insertar(valor);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    abb.eliminar(valorEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valorBuscar = scanner.nextInt();
                    Arbol_Binario_Nodo nodo = abb.buscar(valorBuscar);
                    if (nodo != null) {
                        System.out.println("Se encontró el nodo con valor: " + nodo.valor);
                    } else {
                        System.out.println("No se encontró el nodo con el valor especificado.");
                    }
                    break;
                case 4:
                    System.out.println("Recorrido en orden:");
                    abb.inOrden(abb.raiz);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Recorrido en preorden:");
                    abb.prePorden(abb.raiz);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Recorrido en postorden:");
                    abb.postOrden(abb.raiz);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Altura del árbol: " + abb.alturaArbol());
                    break;
                case 8:
                    System.out.println("Número de nodos: " + abb.contarNodos());
                    break;
                case 9:
                    System.out.println("Número de hojas: " + abb.contarHojas());
                    break;
                case 10:
                    System.out.println("Valor mínimo del árbol: " + abb.valorMinimo(abb.raiz));
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }

        } while (opcion != 11);
    }

    private static void mostrarMenuArbolBinario() {
        System.out.println("\nFunciones de Árbol Binario");
        System.out.println("1. Insertar valor");
        System.out.println("2. Eliminar valor");
        System.out.println("3. Buscar valor");
        System.out.println("4. Recorrido en orden");
        System.out.println("5. Recorrido en preorden");
        System.out.println("6. Recorrido en postorden");
        System.out.println("7. Altura del árbol");
        System.out.println("8. Número de nodos");
        System.out.println("9. Número de hojas");
        System.out.println("10. Valor mínimo del árbol");
        System.out.println("11. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void accederPilasLibros() {
        Pilas_Libros_Main.main(null); // Llamada al método main de Pilas_Libros_Main para acceder a sus funciones
    }
}
