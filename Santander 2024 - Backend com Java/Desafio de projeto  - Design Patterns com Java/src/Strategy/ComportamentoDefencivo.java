package Strategy;

public class ComportamentoDefencivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("movendo-se defencivamente");
    }
}
