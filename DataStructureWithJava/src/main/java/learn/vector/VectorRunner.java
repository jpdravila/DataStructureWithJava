package learn.vector;

public class VectorRunner {
    public static void main(String[] args){
        Vector vc = new Vector(5);

        vc.add("Análise 00");
        vc.add("Análise 01");
        vc.add("Análise 02");

        System.out.println(vc.busca(1));
    }
}
