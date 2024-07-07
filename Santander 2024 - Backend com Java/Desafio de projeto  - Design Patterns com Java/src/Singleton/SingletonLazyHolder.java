package Singleton;
/**
 * Sigleton " ApressadoSingletonLazyHolder"
 * @autor estela.almeida
 */
public class SingletonLazyHolder {
    private  static  class instanceHolder{
        public static SingletonLazyHolder intancia =new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static  SingletonLazyHolder getInstance(){
        return instanceHolder.intancia;
    }
}
