public class Pilas_Libros {

    private Nodo tope = null;
    private int longitud;

    public class Nodo{
        public Libro libro;
        public Nodo next = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    public boolean isEmptyStack(){
        return tope == null;
    }
    public int length(){
        return longitud;
    }

    public void apilar(Libro libro){
        Nodo nodoPush = new Nodo(libro);
        nodoPush.next = tope;
        tope = nodoPush;
        longitud++;
    }

    public void desapilar(){
        if(tope!=null){
            Nodo nodoPop = tope;
            tope = tope.next;
            nodoPop = null;
        }
        longitud--;
    }

    public void desapilarN(int cantidad){
        if(!isEmptyStack()){
            if(length() >= cantidad){
                for (int contador=0; contador <cantidad; contador++){
                    desapilar();
                }
            }
        }else {
            System.out.println("La pila no tiene el numero de libros para eliminar");
        }

    }

    public void obtenerLibro(){
        if(!isEmptyStack()){
            Nodo nodoLibro = tope;
            System.out.println("Los datos del libro son: [" + nodoLibro.libro.getIsbn() + ", " + nodoLibro.libro.getAutor() + "]");
        }else
            System.out.println("No hay");
    }

    public void destructor(){
        while (!isEmptyStack()){
            desapilar();
        }
    }


}