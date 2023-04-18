package learn.vector.ArrayList;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        //Inicializa o ArrayList com essa instância
        ArrayList<String> arrayList = new ArrayList<String>();

        //Adiciona novos elemêntos a lista
        arrayList.add("A");
        arrayList.add("C");

        //Adiciona elmento e posição
        arrayList.add(1, "B");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //Imprime a lista
        System.out.println(arrayList);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //Inicia uma variável para conferir
        boolean existe  = arrayList.contains("C");

        //Confere a existência de dados na lista
        if(existe){
            System.out.println("Elemento existe no Array");
        }else{
            System.out.println("Elemento não existe no Array");
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //Confere a existência de dados na lista
        int pos = arrayList.indexOf("B");
        if(pos > -1){
            System.out.println("Elemento existe no Array na posição: " + pos);
        }else {
            System.out.println("Elemento não existe no Array na posição: " + pos);
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //Busca o elemento pela posição desejada
        System.out.println(arrayList.get(2));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //Remove elementos da lista
        /*arrayList.remove(1);
        arrayList.remove("A");
        System.out.println(arrayList);*/

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        //Conta o tamanho de variáveis da respectiva lista
        System.out.println(arrayList.size());
    }

}
