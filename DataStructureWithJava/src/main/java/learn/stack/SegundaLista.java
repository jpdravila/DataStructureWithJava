package learn.stack;

public class SegundaLista<T> extends EstruturaEstatica<T> {

    public SegundaLista(int capacidade) {
        super(capacidade);
    }

    public SegundaLista() {
        super();
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }

    public void remove(int posicao){
        super.remove(posicao);
    }

    public T busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        return elementos[posicao];
    }

    public int busca(T elemento){
        for (int i=0; i<tamanho ;i++){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
}