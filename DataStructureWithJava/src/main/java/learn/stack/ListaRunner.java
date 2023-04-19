package learn.stack;

public class ListaRunner {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.adiciona(10);
        pilha.adiciona(11);
        pilha.adiciona(12);
        pilha.adiciona(13);
        pilha.adiciona(14);
        pilha.adiciona(15);

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
