package controlador.acciones;

import controlador.ParaUI;
import modelo.acceso.AlmacenIndice;
import modelo.data.Cliente;

public class AccionesCliente {

	private ParaUI paraUI;
	private AlmacenIndice almacenIndice;

	public AccionesCliente(ParaUI paraUI) {
		this.paraUI = paraUI;
		this.almacenIndice = new AlmacenIndice<>("data/clientes/indice.data", "data/clientes/clientes.data");
	}

	public boolean darAlta() {
		String NIF = this.paraUI.getNifAltaCliente().getText();
		String razonSocial = this.paraUI.getRazonSocialAltaCliente().getText();
		String direccion = this.paraUI.getDireccionAltaCliente().getText();
		String telefono = this.paraUI.getTelefonoAltaCliente().getText();

		Cliente cliente = new Cliente(NIF, razonSocial, direccion, telefono);
		
		return this.almacenIndice.grabar(cliente, NIF);
	}
}
