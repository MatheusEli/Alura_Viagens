package br.com.alura.aluraviagens.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.aluraviagens.model.Pacote;

public class PacoteDAO {

    public List<Pacote> lista() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal(243.99)),
                new Pacote("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(421.50)),
                new Pacote("Recife", "recife_pe", 4, new BigDecimal(754.20)),
                new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(532.55)),
                new Pacote("Salvador", "salvador_ba", 5, new BigDecimal(899.99)),
                new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(289.90))));
        return pacotes;
    }

}