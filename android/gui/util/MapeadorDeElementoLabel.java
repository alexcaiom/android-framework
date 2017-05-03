package br.com.waiso.kidz.android.gui.util;

import br.com.waiso.kidz.abstratas.ClasseActivity;
import br.com.waiso.kidz.android.gui.util.annotations.Botao;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MapeadorDeElementoLabel extends MapeadorDeElemento{

	public MapeadorDeElementoLabel(ClasseActivity activity) {
		this.tipoDeElemento = Button.class;
		this.activity = activity;
	}
	
	@Override
	public void mapear(View elemento) {
		Class<? extends View> tipoDoElementoPassadoPorParametro = elemento.getClass();
		if (tipoDoElementoPassadoPorParametro.equals(tipoDeElemento)) {
			boolean possuiAnotacao = tipoDoElementoPassadoPorParametro.isAnnotationPresent(Botao.class);
			if (possuiAnotacao) {
				realizarMapeamento(elemento);
			}
		}
		
	}

	private void realizarMapeamento(View elemento) {
		Botao botao = elemento.getClass().getAnnotation(Botao.class);
		elemento = this.activity.mapear(botao.id());
	}

	@Override
	public void proximo() {
		
		
	}

}
