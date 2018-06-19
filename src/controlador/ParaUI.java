package controlador;

import controlador.acciones.AccionesArticulo;
import controlador.acciones.AccionesCliente;
import logica.Logica;
import modelo.data.Articulo;
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
	private AccionesArticulo accionesArticulo;
	
	public ParaUI() {
		this.logica = new Logica();
		this.accionesCliente = new AccionesCliente(this);
		this.accionesArticulo = new AccionesArticulo(this);
		establecerEventos();
	}
	
	public void establecerEventos() {
		getBotonAltaCliente().addActionListener(e -> darAltaCliente());
		getBotonBuscarCliente().addActionListener(e -> buscarCliente());
		getBotonBorrarCliente().addActionListener(e -> borrarCliente());
		getBotonAltaArticulo().addActionListener(e -> darAltaArticulo());
		getBotonBuscarArticulo().addActionListener(e -> buscarArticulo());
		getBotonModificarPrecioArticulo().addActionListener(e -> modificarPrecio());
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
	
	public boolean borrarCliente(String CIF) {
		return logica.borrarCliente(CIF);
	}

	public void borrarCliente() {
		accionesCliente.borrar();
	}
	
	public boolean comprobarClienteExistente(String razonSocial) {
		return logica.comprobarClienteExistente(razonSocial);
	}

	public boolean darAltaArticulo(int idArticulo, String nombre, String descripcion, float precio) {
		return logica.darAltaArticulo(idArticulo, nombre, descripcion, precio);
	}

	public void darAltaArticulo() {
		accionesArticulo.darAlta();
	}

	public Articulo buscarArticulo(String nombre) {
		return logica.buscarArticulo(nombre);
	}

	public boolean modificarPrecioArticulo(String nombreArticulo, float nuevoPrecio) {
		return logica.modificarPrecioArticulo(nombreArticulo, nuevoPrecio);
	}

	public void buscarArticulo() {
		accionesArticulo.buscarArticulo();
	}

	public void modificarPrecio() {
		accionesArticulo.modificarPrecio();
	}

}
