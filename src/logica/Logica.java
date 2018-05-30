package logica;

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

}
