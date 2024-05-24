package iPhone;

public interface NavegadorInternet {
    void atualizarPagina();
    void adicionarNovaAba();
    void exibirPagina(String url);
    default void atualizarNavegacao() {
        System.out.println("Página atualizada.");
    }

}
