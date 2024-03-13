package Questoes;

import java.sql.SQLOutput;

public class Problema1 {
    public static void main(String[] args) {

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
        //RESULTADO = 91
    }
}
