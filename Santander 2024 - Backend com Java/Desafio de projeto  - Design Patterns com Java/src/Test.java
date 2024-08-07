import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;

public class Test {

    public static void main(String[] args) {

        // testes relacionados ao DesingPattern Singleton
        SingletonLazy lazy  = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);



        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Testes Strategy

        Comportamento normal     = new ComportamentoNormal();
        Comportamento defensivo  = new ComportamentoDefencivo();
        Comportamento agressivo  = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        //Faces
        Facade facade = new Facade();
        facade.migrarCliente("Estela","12228450");



    }
}
