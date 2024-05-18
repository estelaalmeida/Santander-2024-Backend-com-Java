
import java.util.Scanner;
//Condições, Loops e Exceções na Prática com Java
//Desafio:  1 / 5 - Operações Bancárias Simples com Switch
//@Author : Estela Almeida Oliveira
public class SimulacaoBancaria {
    public static void main(String[] args) {
            System.out.println("Simular conta bamcária");
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair

        while (true) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
                // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.

                case 1:  // depositar:

                    double saldoConta =  scanner.nextDouble();
                    saldo = saldoConta;

                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2: //Sacar:

                    double saldoRetirada =  scanner.nextDouble();
                    if(saldoRetirada <= saldo){
                        saldo -= saldoRetirada;

                        System.out.println("Saldo atual: "+ saldo);

                    }else{

                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3: //Consultar Saldo:

                    System.out.println("Saldo atual: " + saldo );
                    break;

                case 0 : //   Encerrar
                    System.out.println(" Programa encerrado.");

                    return;

                default :  // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }

}
