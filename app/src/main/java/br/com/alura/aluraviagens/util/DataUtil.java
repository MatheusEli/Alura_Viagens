package br.com.alura.aluraviagens.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {


    public static final String DIA_MES = "dd/MM";

    public static String periodoEmTexto(int dias) {
        Calendar dataDeIda = Calendar.getInstance();
        Calendar dataDeVolta = Calendar.getInstance();
        dataDeVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formataBrasileiro = new SimpleDateFormat(DIA_MES);
        String idaFormatada = formataBrasileiro.format(dataDeIda.getTime());
        String voltaFormatada = formataBrasileiro.format(dataDeVolta.getTime());
        return idaFormatada + " - " + voltaFormatada + " de " + dataDeVolta.get(Calendar.YEAR);
    }
}
