package Escopo_Estrutura_Controle;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    selecaoCandidatos();

    }
    public static void selecaoCandidatos(){
        String[] candidatos = {"João Vinicius","Estevão Silva","Catarine Rots","Gabriela Rodrigues","Flávio Leandro"};

        int candidatosSelecionados = 0 ;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado : "+ candidato + " Solicitou este valor de salário %d.2" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosSelecionados++;
        }
    }
    public static double valorPretendido(){
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
