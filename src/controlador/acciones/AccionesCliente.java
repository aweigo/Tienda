package controlador.acciones;

import javax.swing.SwingWorker;
import controlador.ParaUI;
import modelo.data.Cliente;
import util.validacion.Validator;

public class AccionesCliente {

	private ParaUI paraUI;

	public AccionesCliente(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	public void darAlta() {

		final SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				Thread.sleep(1500);
				paraUI.getMensajeAltaCliente().setText("");
				return null;
			}

		};

		String NIF = this.paraUI.getNifAltaCliente().getText();
		String razonSocial = this.paraUI.getRazonSocialAltaCliente().getText();
		String direccion = this.paraUI.getDireccionAltaCliente().getText();
		String telefono = this.paraUI.getTelefonoAltaCliente().getText();

		if ((Validator.isNIF(NIF) || Validator.isCIF(NIF)) && Validator.isNombre(razonSocial)
				&& Validator.isNombre(direccion) && Validator.isPhone(telefono)) {

			if (this.paraUI.darAltaCliente(NIF, razonSocial, direccion, telefono)) {
				this.paraUI.getMensajeAltaCliente().setText("Cliente dado de alta correctamente");
				this.paraUI.limpiarCamposAltaCliente();
				worker.execute();
			} else {
				this.paraUI.getMensajeAltaCliente().setText("Error al dar de alta el cliente");
				worker.execute();
			}
		}
	}

	public void buscar() {

		final SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				Thread.sleep(1500);
				paraUI.getMensajeBuscarCliente().setText("");
				return null;
			}
		};

		if (Validator.isNombre(this.paraUI.getRazonSocialBuscarCliente().getText())) {
			Cliente cliente = this.paraUI.buscarCliente(this.paraUI.getRazonSocialBuscarCliente().getText());

			if (cliente != null) {
				this.paraUI.getCifBuscarCliente().setText(cliente.getDniCif());
				this.paraUI.getDireccionBuscarCliente().setText(cliente.getDireccion());
				this.paraUI.getTeléfonoBuscarCliente().setText(cliente.getTelefono());
				this.paraUI.getBotonBorrarCliente().setEnabled(true);

				this.paraUI.getMensajeBuscarCliente().setText("Cliente encontrado correctamente");
				worker.execute();
			} else {
				this.paraUI.getMensajeBuscarCliente().setText("Error al buscar el cliente");
				worker.execute();
			}
		}
	}
}
