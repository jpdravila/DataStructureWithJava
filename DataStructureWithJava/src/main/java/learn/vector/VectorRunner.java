package learn.vector;

public class VectorRunner {
    public static void main(String[] args){
        Vector vc = new Vector(5);

        vc.add("Banana");
        vc.add("Milk");
        vc.add("Apple");

        //System.out.println(vc.busca(1));

        System.out.println(vc.busca("Applejj"));
    }
}
