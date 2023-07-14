package EstruturaDados;

import java.util.List;
/*
        UNKNOWN WILDCARD

public class Generics {
    public static void main(String[] args) {
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);
    }

    public static void imprimeLista(List<?> lista){
        for(Object obj : lista){
            System.out.println(obj);
        }
    }
}
*/

/*
            UPPERBOIUNDED WILDCARD

public class Generis{
    public static void main(String[] args{
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);
    }

    public static void imprimeLista(List<? extends Pessoa> listaPessoas){
        for(Pessoa p : listaPessoas){
        System.out.prinln(p);
    }
}
 */

/*
            LOWEBOUNDED WILDCARD

public class Generis{
    public static void main(String[] args{
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);
    }

    public static void imprimeLista(List<? extends Pessoa> EstaPessoas){
        for(Pessoa p : EstaPessoas){
        System.out.prinln(p);
    }
}
 */
/*
            CONVERSÃO

- K para "Key"     EXp : Map<K,V>
- V para "Value"   EXp : Map<K,V>
- E para "Element" EXp : List<E>
- T para "Type"    EXp : Collections''addAll
- ? quando generico

 */



