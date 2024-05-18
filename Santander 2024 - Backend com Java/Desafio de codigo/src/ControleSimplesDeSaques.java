import java.util.Scanner;

//Condições, Loops e Exceções na Prática com Java
//Desafio: 4 / 5 - Verificação de Cheque Especial
//@Author : Estela Almeida Oliveira

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solicite o valor do saque:");
        double limiteDiario = scanner.nextDouble();
        double saque  = 0;


// Crie um loop 'for' para iterar sobre os saques:
        for (double valorSaque  = saque; limiteDiario > valorSaque ;limiteDiario -= valorSaque)
            {

// Solicite ao usuário o valor do saque:
            saque = scanner.nextDouble();

// Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;

            }else if (saque <= limiteDiario){
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
//não ultrapassar o limite diário, subtraia o valor do saque do limite diário:

            }else{

// TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                return;
            }
        }
// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
