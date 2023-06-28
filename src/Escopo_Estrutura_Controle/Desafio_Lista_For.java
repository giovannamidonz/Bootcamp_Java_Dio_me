package Escopo_Estrutura_Controle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Desafio_Lista_For {
    public static void main(String[] args) {
        Scanner leito = new Scanner(System.in);

        List<String> nome = new ArrayList<String>();

        for(int i = 0 ; i <= 10;i++){
            System.out.println("Digite um nome: " );
            nome.add(leito.nextLine());

        }
        for(String univ : nome){
            System.out.println(univ);
        }

    }
}

