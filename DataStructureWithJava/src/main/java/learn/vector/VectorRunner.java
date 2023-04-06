package learn.vector;

public class VectorRunner {
    public static void main(String[] args){
        Vector vc = new Vector(10);

        /*vc.add("Banana");
        vc.add("Milk");
        vc.add("Apple");*/

        //System.out.println(vc.busca(1));

        //System.out.println(vc.busca("Apple"));

        vc.add("B");
        vc.add("C");
        vc.add("E");
        vc.add("F");
        vc.add("G");

        System.out.println(vc);

        vc.adiciona(0, "A");
        vc.adiciona(3, "D");

        System.out.println(vc);
    }
}
