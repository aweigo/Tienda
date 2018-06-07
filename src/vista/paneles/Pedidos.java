package vista.paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * 
 * @author joseemilio
 *
 */

public class Pedidos extends JPanel {

	protected JTextField idAltaPedido;
	protected JButton botonAltaPedido;
	protected JLabel mensajeConsultarPedido;
	protected JLabel mensajeAltaPedido;
	private JTextField buscadorArticuloAlta;
	private JTextField buscadorClienteAlta;
	private JTable tablaLineasPedido;
	private JLabel totalPedido;
	private JTable tablaArticulos;
	private JTable tablaClientes;

	public Pedidos() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Pedidos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 127, 80));
		lblNewLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setUI(new MyTabbedPane());
		add(tabbedPane);
		
		JPanel altaPedido = new JPanel();
		tabbedPane.addTab("Alta", null, altaPedido, null);
		altaPedido.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCamposAltaPedido = new JPanel();
		panelCamposAltaPedido.setBorder(new EmptyBorder(5, 5, 15, 5));
		altaPedido.add(panelCamposAltaPedido, BorderLayout.CENTER);
		panelCamposAltaPedido.setLayout(new BorderLayout(0, 5));
		
		JPanel panelIdAltaPedido = new JPanel();
		panelIdAltaPedido.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelIdAltaPedido.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		panelIdAltaPedido.add(lblNewLabel_1, BorderLayout.NORTH);
		
		idAltaPedido = new JTextField();
		idAltaPedido.setFont(new Font("Tahoma", Font.ITALIC, 9));
		idAltaPedido.setBackground(new Color(211, 211, 211));
		idAltaPedido.setEditable(false);
		idAltaPedido.setEnabled(false);
		idAltaPedido.setDisabledTextColor(new Color(0, 0, 0));
		idAltaPedido.setBorder(new EmptyBorder(3, 3, 3, 3));
		panelIdAltaPedido.add(idAltaPedido, BorderLayout.WEST);
		idAltaPedido.setColumns(10);
		panelCamposAltaPedido.add(panelIdAltaPedido, BorderLayout.NORTH);
		
		String nombreColumnasArticulos[] = {"Nombre"};
		
		JPanel panel5 = new JPanel();
		panelCamposAltaPedido.add(panel5, BorderLayout.CENTER);
		
		JPanel panelArticulosAltaPedido = new JPanel();
		panelArticulosAltaPedido.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelArticulosAltaPedido.setLayout(new BorderLayout(0, 3));
		tablaArticulos = new JTable(new DefaultTableModel(null, nombreColumnasArticulos));
		tablaArticulos.setFillsViewportHeight(true);
		
		JScrollPane scrollPaneArticulos = new JScrollPane(tablaArticulos);
		scrollPaneArticulos.setViewportBorder(null);
		scrollPaneArticulos.setBorder(null);
		panelArticulosAltaPedido.add(scrollPaneArticulos, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panelArticulosAltaPedido.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Introduzca el nombre del art\u00EDculo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBorder(new EmptyBorder(2, 0, 2, 0));
		panel_3.add(lblNewLabel_2, BorderLayout.CENTER);
		
		buscadorArticuloAlta = new JTextField();
		panel_3.add(buscadorArticuloAlta, BorderLayout.SOUTH);
		buscadorArticuloAlta.setBorder(new EmptyBorder(5, 5, 5, 5));
		buscadorArticuloAlta.setColumns(10);
		
		JLabel lblArtculos = new JLabel("Art\u00EDculos");
		lblArtculos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		panel_3.add(lblArtculos, BorderLayout.NORTH);
		
		JPanel panelClientesAltaPedido = new JPanel();
		panelClientesAltaPedido.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelClientesAltaPedido.setLayout(new BorderLayout(0, 3));
		
		String nombreColumnasClientes[] = {"Nombre"};
		
		tablaClientes = new JTable(new DefaultTableModel(null, nombreColumnasClientes));
		tablaClientes.setFillsViewportHeight(true);
		
		JScrollPane scrollPaneClientes = new JScrollPane(tablaClientes);
		scrollPaneClientes.setViewportBorder(null);
		scrollPaneClientes.setBorder(null);
		panelClientesAltaPedido.add(scrollPaneClientes, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panelClientesAltaPedido.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Introduzca el nombre del cliente");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBorder(new EmptyBorder(2, 0, 2, 0));
		panel_4.add(lblNewLabel_3, BorderLayout.CENTER);
		
		buscadorClienteAlta = new JTextField();
		buscadorClienteAlta.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_4.add(buscadorClienteAlta, BorderLayout.SOUTH);
		buscadorClienteAlta.setColumns(10);
		
		JLabel Clientes = new JLabel("Clientes");
		Clientes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		panel_4.add(Clientes, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(2, 10, 2, 10));
		
		String nombreColumnasLineasPedido[] = {"Nombre artículo", "Cantidad"};
		panel_5.setLayout(new BorderLayout(0, 3));
		
		JLabel lblLneas = new JLabel("L\u00EDneas de pedido");
		lblLneas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		panel_5.add(lblLneas, BorderLayout.NORTH);
		
		tablaLineasPedido = new JTable(new DefaultTableModel(null, nombreColumnasLineasPedido));
		tablaLineasPedido.setFillsViewportHeight(true);
		
		JScrollPane scrollPaneLineasPedido = new JScrollPane(tablaLineasPedido);
		scrollPaneLineasPedido.setViewportBorder(null);
		panel_5.add(scrollPaneLineasPedido, BorderLayout.CENTER);
		scrollPaneLineasPedido.setBorder(null);
		GroupLayout gl_panel5 = new GroupLayout(panel5);
		gl_panel5.setHorizontalGroup(
			gl_panel5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel5.createSequentialGroup()
					.addComponent(panelArticulosAltaPedido, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(panelClientesAltaPedido, GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
				.addGroup(gl_panel5.createSequentialGroup()
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
					.addGap(1))
		);
		gl_panel5.setVerticalGroup(
			gl_panel5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel5.createSequentialGroup()
					.addGroup(gl_panel5.createParallelGroup(Alignment.LEADING)
						.addComponent(panelArticulosAltaPedido, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(panelClientesAltaPedido, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
					.addGap(5)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
					.addGap(1))
		);
		panel5.setLayout(gl_panel5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 255, 240));
		panel_6.setBorder(new EmptyBorder(5, 10, 5, 10));
		panelCamposAltaPedido.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_6.add(lblTotal, BorderLayout.NORTH);
		
		totalPedido = new JLabel("");
		totalPedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_6.add(totalPedido, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		altaPedido.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		mensajeAltaPedido = new JLabel("");
		mensajeAltaPedido.setBorder(new EmptyBorder(5, 0, 5, 0));
		mensajeAltaPedido.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensajeAltaPedido.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(mensajeAltaPedido, BorderLayout.NORTH);
		
		botonAltaPedido = new JButton("Alta pedido");
		panel.add(botonAltaPedido);
		botonAltaPedido.setFocusPainted(false);
		botonAltaPedido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonAltaPedido.setBackground(new Color(176, 196, 222));
		botonAltaPedido.setBorder(new EmptyBorder(10, 0, 10, 0));
		
		JPanel consultarPedido = new JPanel();
		tabbedPane.addTab("Consultar", null, consultarPedido, null);
		consultarPedido.setLayout(new BorderLayout(0, 0));
		
		mensajeConsultarPedido = new JLabel("");
		consultarPedido.add(mensajeConsultarPedido, BorderLayout.SOUTH);
		mensajeConsultarPedido.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeConsultarPedido.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensajeConsultarPedido.setBorder(new EmptyBorder(5, 0, 5, 0));
		
		JLabel lblEnProceso = new JLabel("En proceso...");
		consultarPedido.add(lblEnProceso, BorderLayout.NORTH);
	}

	public JTextField getNifAltaCliente() {
		return idAltaPedido;
	}

	public JButton getBotonAltaCliente() {
		return botonAltaPedido;
	}

	public JLabel getMensajeBuscarCliente() {
		return mensajeConsultarPedido;
	}

	public JLabel getMensajeAltaCliente() {
		return mensajeAltaPedido;
	}

}
