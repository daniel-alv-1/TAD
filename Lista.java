public class Lista {

    private Celula inicio;
    
    public void add(int valor){
        Celula c = new Celula();
        c.setElemento(valor);
        c.setProximo(inicio);
        inicio = c;
}
    public void remover(){
        
    }
}