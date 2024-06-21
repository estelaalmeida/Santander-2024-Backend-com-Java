
import java.util.Scanner;

//Orientação a Objetos na Prática com Java
//Desafio: 5 / 5 - Cofres Seguros: Dominando o Encapsulamento e Abstração
//@Author : Estela Almeida Oliveira
public class Cofre {
    public String tipo;

    public String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {

        this.tipo = tipo;

        this.metodoAbertura = metodoAbertura;

    }

    public void imprimirInformacoes() {

        System.out.println("Tipo: " + this.tipo);

        System.out.println("Metodo de abertura: " + this.metodoAbertura);

    }

}

class CofreDigital extends Cofre {

    public int senha;

    public CofreDigital(int senha) {

        super("Cofre Digital", "Senha");

        this.senha = senha;

    }

    public boolean validarSenha(int confirmacaoSenha) {

        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {

        super("Cofre Fisico", "Chave");
    }
}

public class Desafio {

    public static void main(String[] args) {

        // Lê o tipo de cofre (primeira linha da entrada)

        Scanner scanner = new Scanner(System.in);

        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:

        if (tipoCofre.equalsIgnoreCase("digital")) {

            int senha = scanner.nextInt();

            int confirmacaoSenha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);

            cofreDigital.imprimirInformacoes();

            if(senha == confirmacaoSenha){

                System.out.println("Cofre aberto!");

            }else{

                System.out.println("Senha incorreta!") ;

            }

        }else{

            CofreFisico cofreFisico = new CofreFisico();

            cofreFisico.imprimirInformacoes();

        }

        scanner.close();
    }
}
