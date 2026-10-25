public class Celula {
    int elemento;
    Celula proximo;

    public Celula(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    public Celula(){}

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    
}