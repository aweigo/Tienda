package logica;

import modelo.data.Articulo;
import modelo.data.Cliente;
import modelo.data.Datos;

public class Logica {

	private Datos datos;
	
	public Logica() {
		this.datos = new Datos();
	}

	public boolean darAltaCliente(String DNI, String razonSocial, String direccion, String telefono) {
		return this.datos.darAlta(new Cliente(DNI, razonSocial, direccion, telefono));
	}
	
	public Cliente buscarCliente(String razonSocial) {
		return this.datos.buscarCliente(razonSocial);
	}
	
	public boolean borrarCliente(String CIF) {
		return this.datos.borrarCliente(CIF);
	}
	
	public boolean comprobarClienteExistente(String razonSocial) {
		return this.datos.comprobarClienteExistente(razonSocial);
	}

	public boolean darAltaArticulo(int idArticulo, String nombre, String descripcion, float precio) {
		return this.datos.darAlta(new Articulo(idArticulo, nombre, descripcion, precio));
	}
}
