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
	
	public boolean borrarCliente(String CIF) {
		return this.almacenCliente.borrar(CIF);
	}
	
	public boolean comprobarClienteExistente(String razonSocial) {
		return this.almacenCliente.obtener(razonSocial) == null;
	}
	
	public boolean darAlta(Articulo articulo) {
		String pathDatos = "data/articulos/" + articulo.getIdArticulo() + ".art";
		
		return new AlmacenIndice<>("data/articulos/articulo.dat", pathDatos).grabar(articulo, articulo.getNombre());
	}
}
