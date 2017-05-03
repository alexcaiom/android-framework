/**
 * 
 */
package br.com.waiso.kidz.android.gui.util;

import android.view.View;
import br.com.waiso.kidz.abstratas.ClasseActivity;

/**
 * @author Alex
 *
 */
public abstract class MapeadorDeElemento {

	protected Class<? extends View> tipoDeElemento;
	protected ClasseActivity activity;
	
	public abstract void mapear (View elemento);
	public abstract void proximo ();
	
}
