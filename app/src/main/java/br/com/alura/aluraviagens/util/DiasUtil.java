package br.com.alura.aluraviagens.util;

public class DiasUtil {

    public static final String SINGULAR = " dia";
    public static final String PLURAL = " dias";

    public static String formataEmTexto(int quantidadeDeDias) {
        if(quantidadeDeDias == 1){

            return quantidadeDeDias + SINGULAR;
        }

            return quantidadeDeDias + PLURAL;

    }
}
