package Escopo_Estrutura_Controle;
import java.util.*;
public class Desafio_pedra_ataque_papel {
    // Abaixo segue um exemplo de código que você pode ou não utilizar
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("quantas partidas você deseja jogar ?");
            int N = leitor.nextInt();
            String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
            for (int i = 0; i < N; i++) {
                System.out.println("é sua vez jogador 1 ");
                jogador1 = leitor.next();
                System.out.println("é sua vez jogador 2 ");
                jogador2 = leitor.next();
                if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
                else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
                else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
                else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 Venceu");
                else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 Venceu");
                else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 Venceu");
                else System.out.println("Sem ganhador");
            }
        }
    }

