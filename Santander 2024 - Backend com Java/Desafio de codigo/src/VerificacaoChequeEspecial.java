import java.util.Scanner;

//Condições, Loops e Exceções na Prática com Java
//Desafio: 4 / 5 - Verificação de Cheque Especial
//@Author : Estela Almeida Oliveira
public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;


        // Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saque <= saldo){
            System.out.println("Transacao realizada com sucesso.");

        //Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:

        }else if ( saque <= saldo + limiteChequeEspecial){
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");

        // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial

        }else{
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }

}
