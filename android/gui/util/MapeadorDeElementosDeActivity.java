package br.com.waiso.kidz.android.gui.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import br.com.waiso.kidz.abstratas.Classe;
import br.com.waiso.kidz.abstratas.ClasseActivity;
import android.app.Activity;
import android.view.View;

public class MapeadorDeElementosDeActivity extends Classe {

	public static void mapearElementos (ClasseActivity activity) {
		if (existe(activity)) {
			Class tipo = activity.getClass();
			List<Field> atributos = Arrays.asList(tipo.getDeclaredFields());
			for (Field atributo : atributos) {
				Class<?> tipoDoAtributo = atributo.getType();
				boolean atributoEhUmElementoDeTela = tipoDoAtributo.getSuperclass().equals(View.class);
				if (atributoEhUmElementoDeTela) {
					MapeadorDeElementoBotao mapeador = new MapeadorDeElementoBotao(activity);
					mapeador.mapear(activity.getClass().getdeclar);
				}
			}
		}
	}
	
}
