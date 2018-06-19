package controlador.acciones;

import javax.swing.SwingWorker;
import controlador.ParaUI;
import modelo.data.Articulo;
import util.validacion.Validator;

public class AccionesArticulo {

	private ParaUI paraUI;

	public AccionesArticulo(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	public void darAlta() {

		final SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				Thread.sleep(1500);
				paraUI.getMensajeAltaArticulo().setText("");
				return null;
			}

		};

		if (Validator.isID(this.paraUI.getIdAltaArticulo().getText())
				&& Validator.isNombre(this.paraUI.getNombreAltaArticulo().getText())
				&& Validator.isPrecio(String.valueOf(this.paraUI.getPrecioAltaArticulo().getText()))) {

			int idArticulo = Integer.parseInt(this.paraUI.getIdAltaArticulo().getText());
			String nombre = this.paraUI.getNombreAltaArticulo().getText();
			String descripcion = this.paraUI.getDescripcionAltaArticulo().getText();
			float precio = Float.parseFloat(this.paraUI.getPrecioAltaArticulo().getText());

			if (this.paraUI.darAltaArticulo(idArticulo, nombre, descripcion, precio)) {
				this.paraUI.getMensajeAltaArticulo().setText("Articulo dado de alta");
				this.paraUI.limpiarCamposAltaArticulo();
				worker.execute();
			} else {
				this.paraUI.getMensajeAltaArticulo().setText("Error al dar de alta el articulo");
				worker.execute();
			}
		}
	}
	
	public void buscarArticulo() {
		
		final SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				Thread.sleep(1500);
				paraUI.getMensajeBuscarArticulo().setText("");
				return null;
			}

		};
		
		Articulo articulo = this.paraUI.buscarArticulo(this.paraUI.getNombreBuscarArticulo().getText());
		
		if(articulo != null) {
			this.paraUI.getIdBuscarArticulo().setText(String.valueOf(articulo.getIdArticulo()));
			this.paraUI.getNombreBuscarArticulo().setText(articulo.getNombre());
			this.paraUI.getDescripcionBuscarArticulo().setText(articulo.getDescripcion());
			this.paraUI.getPrecioBuscarArticulo().setText(String.valueOf(articulo.getCurrentPrice()));
			
			this.paraUI.getBotonModificarPrecioArticulo().setEnabled(true);
			this.paraUI.getMensajeBuscarArticulo().setText("Articulo encontrado");
			worker.execute();
		} else {
			this.paraUI.getMensajeBuscarArticulo().setText("Error al buscar el articulo");
			worker.execute();
		}
		
	}
	
	public void modificarPrecio() {
		
		final SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				Thread.sleep(1500);
				paraUI.getMensajeBuscarArticulo().setText("");
				return null;
			}

		};
		
		String precio = this.paraUI.getPrecioBuscarArticulo().getText();
		
		if(Validator.isPrecio(precio)) {
			if(this.paraUI.modificarPrecioArticulo(this.paraUI.getNombreBuscarArticulo().getText(), Float.parseFloat(precio))) {
				this.paraUI.getMensajeBuscarArticulo().setText("Precio modificado");
				worker.execute();
			} else {
				this.paraUI.getMensajeBuscarArticulo().setText("Error al modificar el precio");
				worker.execute();
			}
		} else {
			this.paraUI.getMensajeBuscarArticulo().setText("No hay ningun precio especificado");
			worker.execute();
		}
	}
}
