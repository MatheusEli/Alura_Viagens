package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context contexto, String imagemEmTexto) {
        Resources resources = contexto.getResources();
        int idDoDrawable = resources.getIdentifier(imagemEmTexto, DRAWABLE, contexto.getPackageName());
        Drawable drawableImagemPacote = resources.getDrawable(idDoDrawable);

        return drawableImagemPacote;
    }
}
