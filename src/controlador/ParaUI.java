package controlador;

import controlador.acciones.AccionesCliente;
import controlador.eventos.ActionAltaCliente;
import logica.Logica;
import vista.UI;

/**
 * 
 * @author joseemilio
 *
 */

public class ParaUI extends UI {

	private Logica logica;
	private AccionesCliente accionesCliente;
	
	public ParaUI() {
		this.logica = new Logica();
		this.accionesCliente = new AccionesCliente(this);
		establecerActionAltaCliente();
	}
	
	public void establecerActionAltaCliente() {
		getBotonAltaCliente().addActionListener(new ActionAltaCliente(this));
	}

	public boolean darAltaCliente() {
		return accionesCliente.darAlta();
	}
	
}
