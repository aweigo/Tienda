package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBuscarCliente implements ActionListener {
	
	private ParaUI paraUI;
	
	public ActionBuscarCliente(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.paraUI.buscarCliente();
	}

}
