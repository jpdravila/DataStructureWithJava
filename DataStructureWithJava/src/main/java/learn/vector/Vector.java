package learn.vector;

public class Vector {

    private String[] contador;

    public Vector(int indice){
        this.contador = new String[indice];
    }

    public void add(String valor){
        for(int i = 0; i < this.contador.length; i++){
            if(this.contador[i] == null){
                this.contador[i] = valor;
                break;
            }
        }
    }

}