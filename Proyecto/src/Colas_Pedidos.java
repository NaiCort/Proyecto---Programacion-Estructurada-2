public class Colas_Pedidos {
    //se estan declarando dos variables de tipo NodoPedido
    //Las variables no estan inicializadas por tanto su valor por defecto es null
    private NodoPedido cabeza, cola;

    public class NodoPedido{
        public int numeroPedido;
        public String nombreCliete;
        public NodoPedido next = null; //apuntador

        //metodo constructor de la clase NodoPedido
        public NodoPedido(int numPedido, String nombreCliete) {
            this.numeroPedido = numPedido;
            this.nombreCliete = nombreCliete;
        }
    }

    public boolean isEmptyTail(){
        if(cabeza == null && cola == null){
            return true;
        }else
            return false;
    }

    public void agregarCola(int pedido, String cliente) {
        NodoPedido nuevoPedido = new NodoPedido(pedido, cliente);
        if(cabeza == null && cola == null){
            cabeza = nuevoPedido;
        }else {
            cola.next = nuevoPedido;
        }
        cola = nuevoPedido;
    }

    public void eliminar() {
        if(cabeza != null){
            NodoPedido eliminar = cabeza;
            cabeza = cabeza.next;
            eliminar.next = null;
            if(cabeza == null){
                cola = null;
            }
        }
    }

    public void obtener() {
        if (cabeza == null){
            System.out.println("No hay elementos");;
        }else {
            NodoPedido primero = cabeza;
            //System.out.println("id: " + primero.numeroPedido + " cliente: " + primero.nombreCliete);
            System.out.println("Los datos del pedido son:  {id:" + primero.numeroPedido + " cliente: " + primero.nombreCliete + "}");
        }
    }

    public void obtenerSiguiente(){
        if(!isEmptyTail()){
            System.out.printf("No hay elementos en la cola");
        }else {
            if(cabeza.next == null){
                System.out.println("La cola solo tiene un elemento");
            }else{
                NodoPedido pedidoNext = cabeza.next;
                System.out.println("Los datos del siguiente pedido son: " + "id: " + pedidoNext.numeroPedido + " cliente: " + pedidoNext.nombreCliete);
            }
        }
    }
}
