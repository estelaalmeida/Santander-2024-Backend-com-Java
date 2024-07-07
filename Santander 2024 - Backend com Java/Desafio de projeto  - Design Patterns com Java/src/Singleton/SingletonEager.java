package Singleton;
/**
 * Sigleton " Apressado"
 * @autor estela.almeida
 */

public class SingletonEager {

    private static  SingletonEager instacia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instacia;
    }

}
