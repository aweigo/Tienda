package modelo.data;

import modelo.acceso.AlmacenIndice;
import modelo.acceso.AlmacenRutaMapeada;
import modelo.acceso.DAO;

public class Datos {
	
	private AlmacenIndice<Cliente, String> almacenCliente;
	private AlmacenRutaMapeada<Articulo, String> almacenArticulo;
	private DAO<Object> dao;
	
	public Datos() {
		this.almacenCliente = new AlmacenIndice<>("data/clientes/indice.data", "data/clientes/clientes.data");
		this.almacenArticulo = new AlmacenRutaMapeada<>("art", "data/articulos", "articulo.dat");
		this.dao = new DAO<Object>();
	}
	
	public boolean darAlta(Cliente cliente) {
		return this.almacenCliente.grabar(cliente, cliente.getRazonSocial());
	}
	
	public boolean darAlta(Articulo articulo) {
		return almacenArticulo.grabar(articulo, articulo.getNombre(), articulo.getIdArticulo());
	}
	
	public Cliente buscarCliente(String razonSocial) {
		return this.almacenCliente.obtener(razonSocial);
	}
	
	public Articulo buscarArticulo(String nombre) {
		return this.almacenArticulo.obtener(nombre);
	}
	
	public boolean borrarCliente(String CIF) {
		return this.almacenCliente.borrar(CIF);
	}
	
	public boolean comprobarClienteExistente(String razonSocial) {
		return this.almacenCliente.obtener(razonSocial) == null;
	}

	public boolean grabar(String path, Object t) {
		return dao.grabar(path, t);
	}

}
