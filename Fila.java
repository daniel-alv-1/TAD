public class Fila {
    private Celula inicio;
    private Celula fim;

    public boolean isEmpty() {
        return inicio == null;
    }

    public void inserir(int valor) {
        Celula nova = new Celula();

        nova.setElemento(valor);
        nova.setProximo(null);

        if (isEmpty()) {
            inicio = nova;
            fim = nova;
        } else {
            fim.setProximo(nova);
            fim = nova;
        }
    }

    public int remover() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }

        int valor = inicio.getElemento();
        inicio = inicio.getProximo();

        if (inicio == null) {
            fim = null;
        }

        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }

        return inicio.getElemento();
    }
}
