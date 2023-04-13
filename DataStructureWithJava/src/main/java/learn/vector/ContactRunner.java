package learn.vector;

public class ContactRunner {
    public static void main(String[] args){
        Contact ct1 = new Contact("Joao", "5555-5555", "joao@email.com");
        Contact ct2 = new Contact("Pedro", "2222-2222", "pedro@email.com");
        Contact ct3 = new Contact("Ávila", "7777-7777", "avila@email.com");
        Contact ct4 = new Contact("Santos", "8888-8888", "santos@email.com");
        Contact ct5 = new Contact("Felicio", "1010-1010", "felicio@email.com");


        VectorObject vo = new VectorObject(5);
        vo.add(ct1);
        vo.add(ct2);
        vo.add(ct3);
        vo.add(ct4);

        System.out.println(vo.tamanho());
        vo.adiciona(0, ct5);

        System.out.println(vo);
    }
}
