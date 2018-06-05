package vista.paneles;

import javax.swing.JPanel;
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
import java.awt.GridLayout;

/**
 * 
 * @author joseemilio
 *
 */

public class Pedidos extends JPanel {

	protected JTextField nifAltaCliente;
	protected JTextField razonSocialAltaCliente;
	protected JTextField direccionAltaCliente;
	protected JTextField telefonoAltaCliente;
	protected JTextArea cifBuscarCliente;
	protected JTextField razonSocialBuscarCliente;
	protected JTextField teléfonoBuscarCliente;
	protected JTextField direccionBuscarCliente;
	protected JButton botonConsultarPedido;
	protected JButton botonAltaPedido;
	protected JLabel mensajeConsultarPedido;
	protected JLabel mensajeAltaPedido;

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
		GridBagLayout gbl_panelCamposAltaPedido = new GridBagLayout();
		gbl_panelCamposAltaPedido.columnWidths = new int[]{634, 0};
		gbl_panelCamposAltaPedido.rowHeights = new int[] {60, 60, 60, 60, 0};
		gbl_panelCamposAltaPedido.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCamposAltaPedido.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCamposAltaPedido.setLayout(gbl_panelCamposAltaPedido);
		
		JPanel panelNifAltaCliente = new JPanel();
		panelNifAltaCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelNifAltaCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("NIF-CIF");
		lblNewLabel_1.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelNifAltaCliente.add(lblNewLabel_1, BorderLayout.NORTH);
		
		nifAltaCliente = new JTextField();
		nifAltaCliente.setDisabledTextColor(new Color(0, 0, 0));
		nifAltaCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelNifAltaCliente.add(nifAltaCliente);
		nifAltaCliente.setColumns(10);
		GridBagConstraints gbc_panelNifAltaCliente = new GridBagConstraints();
		gbc_panelNifAltaCliente.fill = GridBagConstraints.BOTH;
		gbc_panelNifAltaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelNifAltaCliente.gridx = 0;
		gbc_panelNifAltaCliente.gridy = 0;
		panelCamposAltaPedido.add(panelNifAltaCliente, gbc_panelNifAltaCliente);
		
		JPanel panelRazonSocialAltaCliente = new JPanel();
		panelRazonSocialAltaCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelRazonSocialAltaCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNombre = new JLabel("Raz\u00F3n Social");
		lblNombre.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelRazonSocialAltaCliente.add(lblNombre, BorderLayout.NORTH);
		
		razonSocialAltaCliente = new JTextField();
		razonSocialAltaCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		razonSocialAltaCliente.setColumns(10);
		panelRazonSocialAltaCliente.add(razonSocialAltaCliente);
		GridBagConstraints gbc_panelRazonSocialAltaCliente = new GridBagConstraints();
		gbc_panelRazonSocialAltaCliente.fill = GridBagConstraints.BOTH;
		gbc_panelRazonSocialAltaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelRazonSocialAltaCliente.gridx = 0;
		gbc_panelRazonSocialAltaCliente.gridy = 1;
		panelCamposAltaPedido.add(panelRazonSocialAltaCliente, gbc_panelRazonSocialAltaCliente);
		
		JPanel panelDireccionAltaCliente = new JPanel();
		panelDireccionAltaCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelDireccionAltaCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDescripcion = new JLabel("Direcci\u00F3n");
		lblDescripcion.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelDireccionAltaCliente.add(lblDescripcion, BorderLayout.NORTH);
		
		direccionAltaCliente = new JTextField();
		direccionAltaCliente.setColumns(10);
		direccionAltaCliente.setDisabledTextColor(new Color(0, 0, 0));
		direccionAltaCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDireccionAltaCliente.add(direccionAltaCliente);
		GridBagConstraints gbc_panelDireccionAltaCliente = new GridBagConstraints();
		gbc_panelDireccionAltaCliente.fill = GridBagConstraints.BOTH;
		gbc_panelDireccionAltaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelDireccionAltaCliente.gridx = 0;
		gbc_panelDireccionAltaCliente.gridy = 2;
		panelCamposAltaPedido.add(panelDireccionAltaCliente, gbc_panelDireccionAltaCliente);
		
		JPanel panelTelefonoAltaCliente = new JPanel();
		panelTelefonoAltaCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		panelTelefonoAltaCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPrecio = new JLabel("Tel\u00E9fono");
		lblPrecio.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelTelefonoAltaCliente.add(lblPrecio, BorderLayout.NORTH);
		
		telefonoAltaCliente = new JTextField();
		telefonoAltaCliente.setColumns(10);
		telefonoAltaCliente.setDisabledTextColor(new Color(0, 0, 0));
		telefonoAltaCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelTelefonoAltaCliente.add(telefonoAltaCliente);
		GridBagConstraints gbc_panelTelefonoAltaCliente = new GridBagConstraints();
		gbc_panelTelefonoAltaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelTelefonoAltaCliente.fill = GridBagConstraints.BOTH;
		gbc_panelTelefonoAltaCliente.gridx = 0;
		gbc_panelTelefonoAltaCliente.gridy = 3;
		panelCamposAltaPedido.add(panelTelefonoAltaCliente, gbc_panelTelefonoAltaCliente);
		
		JPanel panel = new JPanel();
		altaPedido.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		mensajeAltaPedido = new JLabel("");
		mensajeAltaPedido.setBorder(new EmptyBorder(5, 0, 5, 0));
		mensajeAltaPedido.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensajeAltaPedido.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(mensajeAltaPedido, BorderLayout.NORTH);
		
		botonAltaPedido = new JButton("Alta");
		panel.add(botonAltaPedido);
		botonAltaPedido.setFocusPainted(false);
		botonAltaPedido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonAltaPedido.setBackground(new Color(176, 196, 222));
		botonAltaPedido.setBorder(new EmptyBorder(10, 0, 10, 0));
		
		JPanel consultarPedido = new JPanel();
		tabbedPane.addTab("Consultar", null, consultarPedido, null);
		consultarPedido.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCamposConsultarPedido = new JPanel();
		panelCamposConsultarPedido.setBorder(new EmptyBorder(5, 5, 15, 5));
		consultarPedido.add(panelCamposConsultarPedido, BorderLayout.CENTER);
		GridBagLayout gbl_panelCamposConsultarPedido = new GridBagLayout();
		gbl_panelCamposConsultarPedido.columnWidths = new int[]{634, 0};
		gbl_panelCamposConsultarPedido.rowHeights = new int[] {60, 60, 60, 60, 0};
		gbl_panelCamposConsultarPedido.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCamposConsultarPedido.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCamposConsultarPedido.setLayout(gbl_panelCamposConsultarPedido);
		
		JPanel panelNifBuscarCliente = new JPanel();
		panelNifBuscarCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelNifBuscarCliente = new GridBagConstraints();
		gbc_panelNifBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_panelNifBuscarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelNifBuscarCliente.gridx = 0;
		gbc_panelNifBuscarCliente.gridy = 0;
		panelCamposConsultarPedido.add(panelNifBuscarCliente, gbc_panelNifBuscarCliente);
		panelNifBuscarCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNifcif = new JLabel("NIF-CIF");
		lblNifcif.setHorizontalAlignment(SwingConstants.LEFT);
		lblNifcif.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNifcif.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelNifBuscarCliente.add(lblNifcif, BorderLayout.NORTH);
		
		cifBuscarCliente = new JTextArea();
		cifBuscarCliente.setFont(new Font("Monospaced", Font.PLAIN, 11));
		cifBuscarCliente.setDisabledTextColor(new Color(0, 0, 0));
		cifBuscarCliente.setBackground(new Color(211, 211, 211));
		cifBuscarCliente.setEditable(false);
		cifBuscarCliente.setEnabled(false);
		cifBuscarCliente.setColumns(10);
		cifBuscarCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelNifBuscarCliente.add(cifBuscarCliente, BorderLayout.CENTER);
		
		JPanel panelRazonSocialBuscarCliente = new JPanel();
		panelRazonSocialBuscarCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelRazonSocialBuscarCliente = new GridBagConstraints();
		gbc_panelRazonSocialBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_panelRazonSocialBuscarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelRazonSocialBuscarCliente.gridx = 0;
		gbc_panelRazonSocialBuscarCliente.gridy = 1;
		panelCamposConsultarPedido.add(panelRazonSocialBuscarCliente, gbc_panelRazonSocialBuscarCliente);
		panelRazonSocialBuscarCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRaznSocial = new JLabel("Raz\u00F3n Social");
		lblRaznSocial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRaznSocial.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelRazonSocialBuscarCliente.add(lblRaznSocial, BorderLayout.NORTH);
		
		razonSocialBuscarCliente = new JTextField();
		razonSocialBuscarCliente.setColumns(10);
		razonSocialBuscarCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelRazonSocialBuscarCliente.add(razonSocialBuscarCliente, BorderLayout.CENTER);
		
		JPanel panelDireccionBuscarCliente = new JPanel();
		panelDireccionBuscarCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelDireccionBuscarCliente = new GridBagConstraints();
		gbc_panelDireccionBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_panelDireccionBuscarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelDireccionBuscarCliente.gridx = 0;
		gbc_panelDireccionBuscarCliente.gridy = 2;
		panelCamposConsultarPedido.add(panelDireccionBuscarCliente, gbc_panelDireccionBuscarCliente);
		panelDireccionBuscarCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccin.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelDireccionBuscarCliente.add(lblDireccin, BorderLayout.NORTH);
		
		direccionBuscarCliente = new JTextField();
		panelDireccionBuscarCliente.add(direccionBuscarCliente, BorderLayout.CENTER);
		direccionBuscarCliente.setDisabledTextColor(new Color(0, 0, 0));
		direccionBuscarCliente.setBackground(new Color(211, 211, 211));
		direccionBuscarCliente.setEditable(false);
		direccionBuscarCliente.setEnabled(false);
		direccionBuscarCliente.setFont(new Font("Monospaced", Font.PLAIN, 11));
		direccionBuscarCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel panelTelefonoBuscarCliente = new JPanel();
		panelTelefonoBuscarCliente.setBorder(new EmptyBorder(2, 10, 2, 10));
		GridBagConstraints gbc_panelTelefonoBuscarCliente = new GridBagConstraints();
		gbc_panelTelefonoBuscarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_panelTelefonoBuscarCliente.fill = GridBagConstraints.BOTH;
		gbc_panelTelefonoBuscarCliente.gridx = 0;
		gbc_panelTelefonoBuscarCliente.gridy = 3;
		panelCamposConsultarPedido.add(panelTelefonoBuscarCliente, gbc_panelTelefonoBuscarCliente);
		panelTelefonoBuscarCliente.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelfono.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelTelefonoBuscarCliente.add(lblTelfono, BorderLayout.NORTH);
		
		teléfonoBuscarCliente = new JTextField();
		teléfonoBuscarCliente.setBackground(new Color(211, 211, 211));
		teléfonoBuscarCliente.setDisabledTextColor(new Color(0, 0, 0));
		teléfonoBuscarCliente.setFont(new Font("Monospaced", Font.PLAIN, 11));
		teléfonoBuscarCliente.setEditable(false);
		teléfonoBuscarCliente.setEnabled(false);
		teléfonoBuscarCliente.setColumns(10);
		teléfonoBuscarCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelTelefonoBuscarCliente.add(teléfonoBuscarCliente, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		consultarPedido.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		mensajeConsultarPedido = new JLabel("");
		mensajeConsultarPedido.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeConsultarPedido.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensajeConsultarPedido.setBorder(new EmptyBorder(5, 0, 5, 0));
		panel_1.add(mensajeConsultarPedido, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		botonConsultarPedido = new JButton("Consultar");
		panel_2.add(botonConsultarPedido);
		botonConsultarPedido.setFocusPainted(false);
		botonConsultarPedido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonConsultarPedido.setBackground(new Color(176, 196, 222));
		botonConsultarPedido.setBorder(new EmptyBorder(10, 0, 10, 0));
	}
	
	public void limpiarCamposAlta() {
		this.nifAltaCliente.setText("");
		this.razonSocialAltaCliente.setText("");
		this.direccionAltaCliente.setText("");
		this.telefonoAltaCliente.setText("");
	}
	
	public void limpiarCamposBusqueda() {
		this.cifBuscarCliente.setText("");
		this.razonSocialBuscarCliente.setText("");
		this.direccionBuscarCliente.setText("");
		this.teléfonoBuscarCliente.setText("");
	}

	public JTextField getNifAltaCliente() {
		return nifAltaCliente;
	}

	public JTextField getRazonSocialAltaCliente() {
		return razonSocialAltaCliente;
	}

	public JTextField getDireccionAltaCliente() {
		return direccionAltaCliente;
	}

	public JTextField getTelefonoAltaCliente() {
		return telefonoAltaCliente;
	}

	public JTextArea getCifBuscarCliente() {
		return cifBuscarCliente;
	}

	public JTextField getRazonSocialBuscarCliente() {
		return razonSocialBuscarCliente;
	}

	public JTextField getTeléfonoBuscarCliente() {
		return teléfonoBuscarCliente;
	}

	public JTextField getDireccionBuscarCliente() {
		return direccionBuscarCliente;
	}

	public JButton getBotonBuscarCliente() {
		return botonConsultarPedido;
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
