package Escopo_Estrutura_Controle;
import java.util.Scanner;
public class CaixaEletronica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo = 100;
        double valorSolicitado ;

        System.out.println("Seja bem vindo ao Banco Magnífica");
        System.out.println("\nQual a opcão você deseja ?");
        System.out.println("\n-------------------------------");
        System.out.println("\n[1] - Visualizar Saldo");
        System.out.println("\n[2] - Retirar Dinheiro");
        System.out.println("\n[3] - Adicionar Dinheiro");
        System.out.println("\n[4] - Sair do Banco Magnifica");

        int opcao = input.nextInt();
        switch (opcao){
            case 1 :
                System.out.println("O Valor do seu saldo =  R$" + saldo );
                break;
            case 2 :
                System.out.println("Informe qual é o valor que você deseja retirar do seu Saldo :\n ");
                valorSolicitado = input.nextDouble();
                String saldoAtual = (saldo > valorSolicitado) ?
                                    "Valor retirado da conta, com Sucesso! \nSeu saldo Atual : R$" + String.valueOf(saldo - valorSolicitado) :
                                    "Valor insuficiente para retirada de dinheiro";
                System.out.println(saldoAtual);

                break;
            case 3 :
                System.out.println("Informe qual é o valor que você deseja adicionar no seu Saldo :\n ");
                valorSolicitado = input.nextDouble();
                String saldoAtual2 = (valorSolicitado > 0 && valorSolicitado < 5000) ?
                        "Valor adicionado na conta, com Sucesso! \nSeu saldo Atual : R$" + String.valueOf(saldo + valorSolicitado) :
                        "Valor Solicitado incorreto !";
                System.out.println(saldoAtual2);

                break;
            case 4 :
                System.out.println("\nVolte sempre ao Banco Magnifica");
                break;
            default:
                System.out.println("INDEFINIDO");

        }

    }
}
