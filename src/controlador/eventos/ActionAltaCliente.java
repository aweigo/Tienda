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
		this.paraUI.darAltaCliente();
	}

}
