package Fundamentos_de_Java;

import java.util.Scanner;
public class SimulandoContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idNumero;
        String Agencia;
        String nomeCliente;
        double saldo;
        System.out.println();
        System.out.println("informe o nome do Cliente : ");
        nomeCliente = input.nextLine();
        System.out.println("informe o numero da Agência : ");
        Agencia = input.nextLine();
        System.out.println("informe o indeficador Númerico  : ");
        idNumero = input.nextInt();
        System.out.println("informe o saldo da conta : ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta Bancaria \n" + "Sua agência é " + Agencia + " e você possuí " + saldo + " na conta.");

    }
}