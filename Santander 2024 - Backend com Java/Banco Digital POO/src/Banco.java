import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Banco {
    @Setter
    @Getter
    public  String nome;
    private ArrayList<Conta> contas;

    public Banco(){
        contas = new ArrayList<Conta>();
    }

}



