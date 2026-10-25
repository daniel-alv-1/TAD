public class Pilha {
    private Celula topo;

    public boolean isEmpty(){
        return(topo == null);
    }
    
    public void push(int valor){
        Celula nova = new Celula(); 

        nova.setElemento(valor);
        nova.setProximo(topo);

        topo = nova;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");  
        }     

        int valor = topo.getElemento();
        topo = topo.getProximo();
        return valor;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new NullPointerException("Pilha vazia");
        }
        return (topo.getElemento());
    }
    
}
