public class Arbol_Binario {

    Arbol_Binario_Nodo raiz;

    public Arbol_Binario(){
        this.raiz = null;
    }
 /*
    class Nodo{
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        public Nodo(int valor){
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
    }*/

    public void insertar(int valor){
        raiz = insertarNodo(raiz, valor);
    }

    private Arbol_Binario_Nodo insertarNodo(Arbol_Binario_Nodo currentRoot, int valor){
        if(currentRoot == null)
            return new Arbol_Binario_Nodo(valor);
        if(valor < currentRoot.valor){
            currentRoot.izquierdo = insertarNodo(currentRoot.izquierdo, valor);
        } else if (valor > currentRoot.valor) {
            currentRoot.derecho = insertarNodo(currentRoot.derecho, valor);
        }

        return currentRoot;
    }

    public void inOrden(Arbol_Binario_Nodo nodo){
        if(nodo != null){
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    public void prePorden(Arbol_Binario_Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.valor + " ");
            prePorden(nodo.izquierdo);
            prePorden(nodo.derecho);
        }
    }

    public void postOrden(Arbol_Binario_Nodo nodo){
        if (nodo != null){
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.valor);
        }
    }

    public void eliminar(int valor){
        raiz = eliminarNodo(raiz, valor);
    }

    private Arbol_Binario_Nodo eliminarNodo(Arbol_Binario_Nodo currentRoot, int valor){
        if (currentRoot == null)
            return currentRoot;

        if (valor < currentRoot.valor){
            currentRoot.izquierdo = eliminarNodo(currentRoot.izquierdo, valor);
        } else if (valor > currentRoot.valor) {
            currentRoot.derecho = eliminarNodo(currentRoot.derecho, valor);
        }else {
            if (currentRoot.izquierdo == null){
                return currentRoot.derecho;
            } else if (currentRoot.derecho == null){
                return currentRoot.izquierdo;
            }

            Arbol_Binario_Nodo sucesor = encontarSucesor(currentRoot.derecho);
            currentRoot.valor = sucesor.valor;
            currentRoot.derecho = eliminarNodo(currentRoot.derecho, sucesor.valor);
        }
        return currentRoot;
    }

    private Arbol_Binario_Nodo encontarSucesor(Arbol_Binario_Nodo nodo){
        Arbol_Binario_Nodo actual = nodo;
        while (actual.izquierdo != null){
            actual = actual.izquierdo;
        }
        return actual;
    }

    public Arbol_Binario_Nodo buscar(int valor){
        return buscarNodo(raiz, valor);
    }

    private Arbol_Binario_Nodo buscarNodo(Arbol_Binario_Nodo currentRoot, int valor){
        if(currentRoot == null || currentRoot.valor == valor)
            return currentRoot;
        if (valor < currentRoot.valor){
            return buscarNodo(currentRoot.izquierdo, valor);
        }else {
            return buscarNodo(currentRoot.derecho, valor);
        }
    }

    public int contarNodos(){
        return contarNodosR(raiz);
    }
    private int contarNodosR(Arbol_Binario_Nodo nodo){
        if (nodo == null)
            return 0;

        return 1 + contarNodosR(nodo.izquierdo) + contarNodosR(nodo.derecho);
    }

    public int alturaArbol(){
        return alturaArbolR(raiz);
    }

    private int alturaArbolR(Arbol_Binario_Nodo nodo){
        if (nodo == null)
            return 0;

        return 1 + Math.max(alturaArbolR(nodo.izquierdo) , alturaArbolR(nodo.derecho));
    }

    public int contarHojas(){
        return contarHojasR(raiz);
    }

    private int contarHojasR(Arbol_Binario_Nodo nodo){
        if (nodo == null)
            return 0;
        if (nodo.izquierdo == null && nodo.derecho==null)
            return 1;

        return contarHojasR(nodo.izquierdo) + contarHojasR(nodo.derecho);
    }

    public int valorMinimo(Arbol_Binario_Nodo nodo){
        if (nodo == null)
            throw new NullPointerException("Esta vacio");

        if (nodo.izquierdo==null)
            return nodo.valor;

        return valorMinimo(nodo.izquierdo);
    }

}