
import java.util.Scanner;

//Orientação a Objetos na Prática com Java
//Desafio: 3 / 5 - Conta Bancária com Construtor em POO
//@Author : Estela Almeida Oliveira
public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);



        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;

    }

    public void depositar(double valor) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        saldo += valor;
        System.out.printf("Deposito feito.\n");
        imprimirSaldo();
    }



    public void sacar(double valor) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        if(valor <= saldo){
            saldo -= valor;

            // Se sim, atualizar o saldo e imprimir "Saque feito."
            System.out.printf("Saque feito.\n");

        }else{

            System.out.printf("Saldo insuficiente. Saque não realizado.\n");
        }
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."

        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }


}
