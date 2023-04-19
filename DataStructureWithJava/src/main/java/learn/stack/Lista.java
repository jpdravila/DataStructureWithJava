package learn.stack;

public class Lista<T> extends EstruturaEstatica<T>{
    public Lista(int elemento) {
        super(elemento);
    }

    protected boolean adiciona(T elemento){
        return super.adiciona(elemento);
    };

    protected boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    };

}
