public class main {
    public static void main(String[] args) {
        Cliente estela = new Cliente();
        estela.setNome("Estela");


        IConta cc = new ContaCorrente(estela);
        IConta poupanca = new ContaPoupanca(estela);
        IConta investimento = new ContaInvestimento(estela);

        cc.depositar(1.0000);

        cc.transferir(1600.0000,poupanca);
        cc.transferir(15.0000 , investimento);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        investimento.imprimirExtrato();





    }
}
