package learn.vector;

public class VectorObjectRunner {
    public static void main(String[] args){
        VectorObject vo = new VectorObject(5);

        vo.add(3);
        vo.add(2);
        vo.add(1);
        vo.add(0);

        System.out.println(vo);
        System.out.println(vo.tamanho());

    }
}
