package modelo.data;

import modelo.acceso.AlmacenIndice;

public class Datos {
	
	private AlmacenIndice<Cliente, String> almacenCliente;
	
	public Datos() {
		this.almacenCliente = new AlmacenIndice<>("data/clientes/indice.data", "data/clientes/clientes.data");
	}
	
	public boolean darAlta(Cliente cliente) {
		return this.almacenCliente.grabar(cliente, cliente.getRazonSocial());
	}
	
	public Cliente buscarCliente(String razonSocial) {
		return this.almacenCliente.obtener(razonSocial);
	}
}
