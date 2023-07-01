package Escopo_Estrutura_Controle;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[] candidatos = { "Giovanna", "Kayo","Leonardo","Delgado","Kel","Rodrigo","Marllyson"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso! ");
        }while (continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("Conseguimos entrar em contato " + candidato);
        else
            System.out.println("Não Conseguimos entrar em contato "+ candidato) ;
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] nomeCandidatos = { "Giovanna", "Kayo","Leonardo","Delgado","Kel","Rodrigo","Marllyson"};
        System.out.println("Imprimindo a Lista de Candidatos Informando o indice do elemento");

        for(String apres : nomeCandidatos){
            System.out.println("O candidato selecionado foi  " + apres);
        }
    }

    

    static void selecaoCandidatos(){
        String[] candidatos = {"João"," Vinicius","Estevão"," Silva","Catarine Rots","Gabriela"," Rodrigues","Flávio", "Leandro"};

        int candidatosSelecionados = 0 ;
        int candidatosAtual = 0 ;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado : "+ candidato + " Solicitou este valor de salário" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosSelecionados += 1 ;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    public static String analisarSalario(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            return "Ligar para o candidato";
        }else if(salarioBase == salarioPretendido){
            return " Ligar para o candidato com uma Contra propostar";
        }else{
            return "Aguardando Resultado dos demais candidatos";
        }

    }
}
