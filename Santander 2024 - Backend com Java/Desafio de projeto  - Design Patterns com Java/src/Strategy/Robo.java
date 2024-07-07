package Strategy;

public class Robo {

    private  Comportamento comportamento;
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    private Comportamento comportameto;


    public void mover(){
        comportamento.mover();
    }
}
