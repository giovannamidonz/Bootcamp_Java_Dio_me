package EstruturaDados;

public class AppPilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No2(1));
        minhaPilha.push(new No2(2));
        minhaPilha.push(new No2(3));
        minhaPilha.push(new No2(4));
        minhaPilha.push(new No2(5));
        minhaPilha.push(new No2(6));

        System.out.println(minhaPilha);

        System.out.println("pop -> " + minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(new No2(23));
        System.out.println(minhaPilha);
    }

}
