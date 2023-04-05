package learn.vector;

public class Vector {

    private String[] elementos;
    private int tamanho;

    public Vector(int elemento){
        this.elementos = new String[elemento];
        this.tamanho = 0;
    }

    /*public void add(String valor){
        for(int i = 0; i < this.contador.length; i++){
            if(this.contador[i] == null){
                this.contador[i] = valor;
                break;
            }
        }
    }*/

    public boolean add(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public  String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida para esse dado");
        }
        return this.elementos[posicao];
    }

    public  int busca(String elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
            return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;
    }

}