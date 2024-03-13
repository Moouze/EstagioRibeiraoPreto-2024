package Questoes;

public class Problema5 {
    public static void main(String[] args) {

        String stringOriginal = "Exemplo";

        System.out.println("String original: " + stringOriginal);


        String stringInvertida = inverterString(stringOriginal);


        System.out.println("String invertida: " + stringInvertida);
    }


    public static String inverterString(String str) {

        char[] caracteres = str.toCharArray();


        char[] invertido = new char[caracteres.length];


        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }


        String stringInvertida = new String(invertido);

        return stringInvertida;
    }
}

