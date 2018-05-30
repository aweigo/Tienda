package controlador.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.ParaUI;

public class ActionAltaCliente implements ActionListener {

	private ParaUI paraUI;

	public ActionAltaCliente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.paraUI.darAltaCliente()) {
			this.paraUI.getMensajeAltaCliente().setText("Cliente dado de alta correctamente");
		} else {
			this.paraUI.getMensajeAltaCliente().setText("Error");
		}
	}

}
