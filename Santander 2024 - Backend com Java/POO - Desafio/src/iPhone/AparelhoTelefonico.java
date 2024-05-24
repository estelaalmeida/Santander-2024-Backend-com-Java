package iPhone;

import java.util.ArrayList;

public interface AparelhoTelefonico {
    void atender();
    void iniciarCorreioVoz();
    void ligar(String numero);
    int selecionar(Strng musica);

    default void encerrarLigacao() {
    System.out.println("Ligação encerrada");
    }
}