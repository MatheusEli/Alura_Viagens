package br.com.alura.aluraviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DiasUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private final Context contexto;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context contexto) {
        this.pacotes = pacotes;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int posicao) {
        return pacotes.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {

        View viewCriada = LayoutInflater.from(contexto).inflate(R.layout.item_pacote,viewGroup, false);

        mostraLocal(posicao, viewCriada);
        mostraDias(posicao, viewCriada);
        mostraPreco(posicao, viewCriada);
        mostraImagem(posicao, viewCriada);

        return viewCriada;
    }

    private void mostraPreco(int posicao, View viewCriada) {
        TextView preco = viewCriada.findViewById(R.id.item_pacote_preco);
        String moedaBrasileira = MoedaUtil.formataParaBrasileiro(pacotes.get(posicao).getPreco());
        preco.setText(moedaBrasileira);
    }

    private void mostraDias(int posicao, View viewCriada) {
        TextView dias = viewCriada.findViewById(R.id.item_pacote_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacotes.get(posicao).getDias());
        dias.setText(diasEmTexto);
    }

    private void mostraImagem(int posicao, View viewCriada) {
        ImageView imagem = viewCriada.findViewById(R.id.item_pacote_imagem);
        Drawable drawableImagemPacote = ResourceUtil.devolveDrawable(contexto, pacotes.get(posicao).getImagem());
        imagem.setImageDrawable(drawableImagemPacote);
    }

    private void mostraLocal(int posicao, View viewCriada) {
        TextView local = viewCriada.findViewById(R.id.item_pacote_local);
        local.setText(pacotes.get(posicao).getLocal());
    }
}
