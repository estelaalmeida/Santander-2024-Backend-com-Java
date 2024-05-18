import java.util.Scanner;

//Condições, Loops e Exceções na Prática com Java
//Desafio: 2 / 5 - Verificação de Número de Conta Bancária
//@Author : Estela Almeida Oliveira
public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificar conta bancária");
//Inicialize um bloco try-catch para capturar exceções:

        try {
//Leia a entrada do usuário como uma string representando o número da conta:
            String numeroConta = scanner.next();

//Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);

// Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");

// Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
        }catch (IllegalArgumentException e ){
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {


// Verifique se o número da conta tem exatamente 8 dígitos:
        int contadorConta = numeroConta.length();
        int numeroDigitado = 0;

        for (int i = 0; i < contadorConta; i++) {
            numeroDigitado ++;
        }
// Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
        if (numeroDigitado != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
