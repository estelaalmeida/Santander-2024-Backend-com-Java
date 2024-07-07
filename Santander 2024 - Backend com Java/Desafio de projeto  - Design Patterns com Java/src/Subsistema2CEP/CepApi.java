package Subsistema2CEP;

import Singleton.SingletonEager;

public class CepApi {

        private static CepApi instacia = new CepApi();

        private CepApi() {

            super();
        }

        public static CepApi getInstance(){
            return instacia;
        }
        public  String recuperarCidade(String cep){
            return "São José dos Campos";
        }
        public  String recuperarEstado(String cep){
        return "SP";
    }


}