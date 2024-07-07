package Singleton;

/**
 * Sigleton " preguiçoso
 * @autor estela.almeida
 */

public class SingletonLazy {
    private static  SingletonLazy instacia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){
        if(instacia == null){
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
