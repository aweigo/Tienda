package vista.paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Cursor;

/**
 * 
 * @author joseemilio
 *
 */

public class Articulos extends JPanel {

	protected JTextField idAltaArticulo;
	protected JTextField nombreAltaArticulo;
	protected JTextArea descripcionAltaArticulo;
	protected JTextField precioAltaArticulo;
	protected JTextArea idBuscarArticulo;
	protected JTextField nombreBuscarArticulo;
	protected JTextArea precioBuscarArticulo;
	protected JTextArea descripcionBuscarArticulo;
	protected JButton botonModificarPrecioArticulo;
	protected JButton botonBuscarArticulo;
	protected JButton botonAltaArticulo;
	protected JLabel mensajeBuscarArticulo;
	protected JLabel mensajeAltaArticulo;

	public Articulos() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Art\u00EDculos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 127, 80));
		lblNewLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setUI(new MyTabbedPane());
		add(tabbedPane);
		
		JPanel altaArticulo = new JPanel();
		tabbedPane.addTab("Alta", null, altaArticulo, null);
		altaArticulo.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCamposAltaArticulos = new JPanel();
		panelCamposAltaArticulos.setBorder(new EmptyBorder(5, 5, 15, 5));
		altaArticulo.add(panelCamposAltaArticulos, BorderLayout.CENTER);
		GridBagLayout gbl_panelCamposAltaArticulos = new GridBagLayout();
		gbl_panelCamposAltaArticulos.columnWidths = new int[]{634, 0};
		gbl_panelCamposAltaArticulos.rowHeights = new int[] {60, 60, 60, 60, 0};
		gbl_panelCamposAltaArticulos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCamposAltaArticulos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelCamposAltaArticulos.setLayout(gbl_panelCamposAltaArticulos);
		
		JPanel panelIdAltaArticulo = new JPanel();
		panelIdAltaArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelIdAltaArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelIdAltaArticulo.add(lblNewLabel_1, BorderLayout.NORTH);
		
		idAltaArticulo = new JTextField();
		idAltaArticulo.setDisabledTextColor(new Color(0, 0, 0));
		idAltaArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelIdAltaArticulo.add(idAltaArticulo);
		idAltaArticulo.setColumns(10);
		GridBagConstraints gbc_panelIdAltaArticulo = new GridBagConstraints();
		gbc_panelIdAltaArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelIdAltaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelIdAltaArticulo.gridx = 0;
		gbc_panelIdAltaArticulo.gridy = 0;
		panelCamposAltaArticulos.add(panelIdAltaArticulo, gbc_panelIdAltaArticulo);
		
		JPanel panelNombreAltaArticulo = new JPanel();
		panelNombreAltaArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelNombreAltaArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelNombreAltaArticulo.add(lblNombre, BorderLayout.NORTH);
		
		nombreAltaArticulo = new JTextField();
		nombreAltaArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		nombreAltaArticulo.setColumns(10);
		panelNombreAltaArticulo.add(nombreAltaArticulo);
		GridBagConstraints gbc_panelNombreAltaArticulo = new GridBagConstraints();
		gbc_panelNombreAltaArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelNombreAltaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelNombreAltaArticulo.gridx = 0;
		gbc_panelNombreAltaArticulo.gridy = 1;
		panelCamposAltaArticulos.add(panelNombreAltaArticulo, gbc_panelNombreAltaArticulo);
		
		JPanel panelDescripcionAltaArticulo = new JPanel();
		panelDescripcionAltaArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelDescripcionAltaArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelDescripcionAltaArticulo.add(lblDescripcion, BorderLayout.NORTH);
		
		descripcionAltaArticulo = new JTextArea();
		descripcionAltaArticulo.setDisabledTextColor(new Color(0, 0, 0));
		descripcionAltaArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDescripcionAltaArticulo.add(descripcionAltaArticulo);
		GridBagConstraints gbc_panelDescripcionAltaArticulo = new GridBagConstraints();
		gbc_panelDescripcionAltaArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelDescripcionAltaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelDescripcionAltaArticulo.gridx = 0;
		gbc_panelDescripcionAltaArticulo.gridy = 2;
		panelCamposAltaArticulos.add(panelDescripcionAltaArticulo, gbc_panelDescripcionAltaArticulo);
		
		JPanel panelPrecioAltaArticulo = new JPanel();
		panelPrecioAltaArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelPrecioAltaArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelPrecioAltaArticulo.add(lblPrecio, BorderLayout.NORTH);
		
		precioAltaArticulo = new JTextField();
		precioAltaArticulo.setDisabledTextColor(new Color(0, 0, 0));
		precioAltaArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		precioAltaArticulo.setColumns(10);
		panelPrecioAltaArticulo.add(precioAltaArticulo);
		GridBagConstraints gbc_panelPrecioAltaArticulo = new GridBagConstraints();
		gbc_panelPrecioAltaArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelPrecioAltaArticulo.gridx = 0;
		gbc_panelPrecioAltaArticulo.gridy = 3;
		panelCamposAltaArticulos.add(panelPrecioAltaArticulo, gbc_panelPrecioAltaArticulo);
		
		JPanel panel = new JPanel();
		altaArticulo.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		mensajeAltaArticulo = new JLabel("");
		mensajeAltaArticulo.setBorder(new EmptyBorder(5, 0, 5, 0));
		mensajeAltaArticulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensajeAltaArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(mensajeAltaArticulo, BorderLayout.NORTH);
		
		botonAltaArticulo = new JButton("Alta art\u00EDculo");
		panel.add(botonAltaArticulo);
		botonAltaArticulo.setFocusPainted(false);
		botonAltaArticulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonAltaArticulo.setBackground(new Color(176, 196, 222));
		botonAltaArticulo.setBorder(new EmptyBorder(10, 0, 10, 0));
		
		JPanel buscarArticulo = new JPanel();
		tabbedPane.addTab("Buscar", null, buscarArticulo, null);
		buscarArticulo.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCamposBuscarArticulos = new JPanel();
		panelCamposBuscarArticulos.setBorder(new EmptyBorder(5, 5, 15, 5));
		buscarArticulo.add(panelCamposBuscarArticulos, BorderLayout.CENTER);
		GridBagLayout gbl_panelCamposBuscarArticulos = new GridBagLayout();
		gbl_panelCamposBuscarArticulos.columnWidths = new int[]{634, 0};
		gbl_panelCamposBuscarArticulos.rowHeights = new int[] {60, 60, 60, 60, 0};
		gbl_panelCamposBuscarArticulos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCamposBuscarArticulos.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelCamposBuscarArticulos.setLayout(gbl_panelCamposBuscarArticulos);
		
		JPanel panelIdBuscarArticulo = new JPanel();
		panelIdBuscarArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelIdBuscarArticulo = new GridBagConstraints();
		gbc_panelIdBuscarArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelIdBuscarArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelIdBuscarArticulo.gridx = 0;
		gbc_panelIdBuscarArticulo.gridy = 0;
		panelCamposBuscarArticulos.add(panelIdBuscarArticulo, gbc_panelIdBuscarArticulo);
		panelIdBuscarArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelIdBuscarArticulo.add(label, BorderLayout.NORTH);
		
		idBuscarArticulo = new JTextArea();
		idBuscarArticulo.setDisabledTextColor(new Color(0, 0, 0));
		idBuscarArticulo.setBackground(new Color(211, 211, 211));
		idBuscarArticulo.setEditable(false);
		idBuscarArticulo.setEnabled(false);
		idBuscarArticulo.setColumns(10);
		idBuscarArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelIdBuscarArticulo.add(idBuscarArticulo, BorderLayout.CENTER);
		
		JPanel panelNombreBuscarArticulo = new JPanel();
		panelNombreBuscarArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelNombreBuscarArticulo = new GridBagConstraints();
		gbc_panelNombreBuscarArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelNombreBuscarArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelNombreBuscarArticulo.gridx = 0;
		gbc_panelNombreBuscarArticulo.gridy = 1;
		panelCamposBuscarArticulos.add(panelNombreBuscarArticulo, gbc_panelNombreBuscarArticulo);
		panelNombreBuscarArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelNombreBuscarArticulo.add(label_1, BorderLayout.NORTH);
		
		nombreBuscarArticulo = new JTextField();
		nombreBuscarArticulo.setColumns(10);
		nombreBuscarArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelNombreBuscarArticulo.add(nombreBuscarArticulo, BorderLayout.CENTER);
		
		JPanel panelDescripcionBuscarArticulo = new JPanel();
		panelDescripcionBuscarArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelDescripcionBuscarArticulo = new GridBagConstraints();
		gbc_panelDescripcionBuscarArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelDescripcionBuscarArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelDescripcionBuscarArticulo.gridx = 0;
		gbc_panelDescripcionBuscarArticulo.gridy = 2;
		panelCamposBuscarArticulos.add(panelDescripcionBuscarArticulo, gbc_panelDescripcionBuscarArticulo);
		panelDescripcionBuscarArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel label_2 = new JLabel("Descripcion");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelDescripcionBuscarArticulo.add(label_2, BorderLayout.NORTH);
		
		descripcionBuscarArticulo = new JTextArea();
		descripcionBuscarArticulo.setDisabledTextColor(new Color(0, 0, 0));
		descripcionBuscarArticulo.setBackground(new Color(211, 211, 211));
		descripcionBuscarArticulo.setEditable(false);
		descripcionBuscarArticulo.setEnabled(false);
		descripcionBuscarArticulo.setFont(new Font("Courier New", Font.PLAIN, 12));
		descripcionBuscarArticulo.setWrapStyleWord(true);
		descripcionBuscarArticulo.setLineWrap(true);
		descripcionBuscarArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JScrollPane descripcionBuscarArticuloScroll = new JScrollPane(descripcionBuscarArticulo);
		descripcionBuscarArticuloScroll.setBorder(null);
		panelDescripcionBuscarArticulo.add(descripcionBuscarArticuloScroll, BorderLayout.CENTER);
		
		JPanel panelPrecioBuscarArticulo = new JPanel();
		panelPrecioBuscarArticulo.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelPrecioBuscarArticulo = new GridBagConstraints();
		gbc_panelPrecioBuscarArticulo.fill = GridBagConstraints.BOTH;
		gbc_panelPrecioBuscarArticulo.gridx = 0;
		gbc_panelPrecioBuscarArticulo.gridy = 3;
		panelCamposBuscarArticulos.add(panelPrecioBuscarArticulo, gbc_panelPrecioBuscarArticulo);
		panelPrecioBuscarArticulo.setLayout(new BorderLayout(0, 0));
		
		JLabel label_3 = new JLabel("Precio");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelPrecioBuscarArticulo.add(label_3, BorderLayout.NORTH);
		
		precioBuscarArticulo = new JTextArea();
		precioBuscarArticulo.setDisabledTextColor(new Color(0, 0, 0));
		precioBuscarArticulo.setFont(new Font("Monospaced", Font.BOLD, 11));
		precioBuscarArticulo.setBackground(new Color(255, 255, 255));
		precioBuscarArticulo.setEditable(false);
		precioBuscarArticulo.setEnabled(false);
		precioBuscarArticulo.setColumns(10);
		precioBuscarArticulo.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrecioBuscarArticulo.add(precioBuscarArticulo, BorderLayout.CENTER);
		
		botonModificarPrecioArticulo = new JButton("Modificar precio");
		botonModificarPrecioArticulo.setEnabled(false);
		botonModificarPrecioArticulo.setFocusPainted(false);
		botonModificarPrecioArticulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonModificarPrecioArticulo.setBackground(new Color(176, 196, 222));
		botonModificarPrecioArticulo.setBorder(new EmptyBorder(8, 10, 8, 10));
		panelPrecioBuscarArticulo.add(botonModificarPrecioArticulo, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		buscarArticulo.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		mensajeBuscarArticulo = new JLabel("");
		mensajeBuscarArticulo.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeBuscarArticulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensajeBuscarArticulo.setBorder(new EmptyBorder(5, 0, 5, 0));
		panel_1.add(mensajeBuscarArticulo, BorderLayout.NORTH);
		
		botonBuscarArticulo = new JButton("Buscar art\u00EDculo");
		panel_1.add(botonBuscarArticulo, BorderLayout.SOUTH);
		botonBuscarArticulo.setFocusPainted(false);
		botonBuscarArticulo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonBuscarArticulo.setBackground(new Color(176, 196, 222));
		botonBuscarArticulo.setBorder(new EmptyBorder(10, 0, 10, 0));
		
		JPanel consultarPrecio = new JPanel();
		tabbedPane.addTab("Consultar precio", null, consultarPrecio, null);
		consultarPrecio.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPendiente = new JLabel("En proceso...");
		consultarPrecio.add(lblPendiente, BorderLayout.NORTH);
	}
	
	public void limpiarCamposAltaArticulo() {
		this.idAltaArticulo.setText("");
		this.nombreAltaArticulo.setText("");
		this.descripcionAltaArticulo.setText("");
		this.precioAltaArticulo.setText("");
	}

	public JTextField getIdAltaArticulo() {
		return idAltaArticulo;
	}

	public JTextField getNombreAltaArticulo() {
		return nombreAltaArticulo;
	}

	public JTextArea getDescripcionAltaArticulo() {
		return descripcionAltaArticulo;
	}

	public JTextField getPrecioAltaArticulo() {
		return precioAltaArticulo;
	}

	public JTextArea getIdBuscarArticulo() {
		return idBuscarArticulo;
	}

	public JTextField getNombreBuscarArticulo() {
		return nombreBuscarArticulo;
	}

	public JTextArea getPrecioBuscarArticulo() {
		return precioBuscarArticulo;
	}

	public JTextArea getDescripcionBuscarArticulo() {
		return descripcionBuscarArticulo;
	}

	public JButton getBotonModificarPrecioArticulo() {
		return botonModificarPrecioArticulo;
	}

	public JButton getBotonBuscarArticulo() {
		return botonBuscarArticulo;
	}

	public JButton getBotonAltaArticulo() {
		return botonAltaArticulo;
	}

	public JLabel getMensajeBuscarArticulo() {
		return mensajeBuscarArticulo;
	}

	public JLabel getMensajeAltaArticulo() {
		return mensajeAltaArticulo;
	}

}
