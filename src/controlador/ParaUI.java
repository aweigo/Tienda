package controlador;

import controlador.acciones.AccionesCliente;
import controlador.eventos.ActionAltaCliente;
import logica.Logica;
import modelo.data.Cliente;
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
		getBotonBuscarCliente().addActionListener(new ActionBuscarCliente(this));
	}

	public void darAltaCliente() {
		accionesCliente.darAlta();
	}

	public boolean darAltaCliente(String DNI, String razonSocial, String direccion, String telefono) {
		return logica.darAltaCliente(DNI, razonSocial, direccion, telefono);
	}

	public Cliente buscarCliente(String razonSocial) {
		return logica.buscarCliente(razonSocial);
	}

	public void buscarCliente() {
		accionesCliente.buscar();
	}

}
