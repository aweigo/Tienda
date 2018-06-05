package controlador.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controlador.ParaUI;

public class ActionAltaArticulo implements ActionListener {
	
	private ParaUI paraUI;
	
	public ActionAltaArticulo(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.darAltaArticulo();
	}

}
