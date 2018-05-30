package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import vista.paneles.Articulos;
import vista.paneles.Clientes;

import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;

/**
 * 
 * @author joseemilio
 *
 */

public class UI extends JFrame {

	private JPanel contentPane;
	private Articulos articulos;
	private Clientes clientes;

	public UI() {
		crearFrame();
		crearPaneles();
	}

	private void crearPaneles() {
		this.articulos = new Articulos();
		this.clientes = new Clientes();
	}

	private void crearFrame() {
		setTitle("Tienda");
		setMinimumSize(new Dimension(1100, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBorder(new EmptyBorder(4, 4, 4, 4));
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new GridLayout(0, 3, 2, 0));

		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));

		JButton botonArticulos = new JButton("Art\u00EDculos");
		botonArticulos.addActionListener(e -> {
			panelPrincipal.removeAll();
			panelPrincipal.add(this.articulos, BorderLayout.CENTER);
			contentPane.updateUI();
		});
		botonArticulos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonArticulos.setFocusPainted(false);
		botonArticulos.setBackground(new Color(176, 196, 222));
		botonArticulos.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelSuperior.add(botonArticulos);

		JButton botonClientes = new JButton("Clientes");
		botonClientes.addActionListener(e -> {
			panelPrincipal.removeAll();
			panelPrincipal.add(this.clientes, BorderLayout.CENTER);
			contentPane.updateUI();
		});
		botonClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonClientes.setFocusPainted(false);
		botonClientes.setBackground(new Color(176, 196, 222));
		botonClientes.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelSuperior.add(botonClientes);

		JButton botonPedidos = new JButton("Pedidos");
		botonPedidos.addActionListener(e -> {
			panelPrincipal.removeAll();
			panelPrincipal.add(new JLabel("Pedidos"), BorderLayout.CENTER);
			contentPane.updateUI();
		});
		botonPedidos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonPedidos.setFocusPainted(false);
		botonPedidos.setBackground(new Color(176, 196, 222));
		botonPedidos.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelSuperior.add(botonPedidos);
	}

	public Articulos getArticulos() {
		return articulos;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public JTextField getIdAltaArticulo() {
		return articulos.getIdAltaArticulo();
	}

	public JTextField getNombreAltaArticulo() {
		return articulos.getNombreAltaArticulo();
	}

	public JTextArea getDescripcionAltaArticulo() {
		return articulos.getDescripcionAltaArticulo();
	}

	public JTextField getPrecioAltaArticulo() {
		return articulos.getPrecioAltaArticulo();
	}

	public JTextArea getIdBuscarArticulo() {
		return articulos.getIdBuscarArticulo();
	}

	public JTextField getNombreBuscarArticulo() {
		return articulos.getNombreBuscarArticulo();
	}

	public JTextArea getPrecioBuscarArticulo() {
		return articulos.getPrecioBuscarArticulo();
	}

	public JTextArea getDescripcionBuscarArticulo() {
		return articulos.getDescripcionBuscarArticulo();
	}

	public JButton getBotonModificarPrecioArticulo() {
		return articulos.getBotonModificarPrecioArticulo();
	}

	public JButton getBotonBuscarArticulo() {
		return articulos.getBotonBuscarArticulo();
	}

	public JButton getBotonAltaArticulo() {
		return articulos.getBotonAltaArticulo();
	}

	public JLabel getMensajeBuscarArticulo() {
		return articulos.getMensajeBuscarArticulo();
	}

	public JLabel getMensajeAltaArticulo() {
		return articulos.getMensajeAltaArticulo();
	}

	public JTextField getNifAltaCliente() {
		return clientes.getNifAltaCliente();
	}

	public JTextField getRazonSocialAltaCliente() {
		return clientes.getRazonSocialAltaCliente();
	}

	public JTextField getDireccionAltaCliente() {
		return clientes.getDireccionAltaCliente();
	}

	public JTextField getTelefonoAltaCliente() {
		return clientes.getTelefonoAltaCliente();
	}

	public JTextArea getCifBuscarCliente() {
		return clientes.getCifBuscarCliente();
	}

	public JTextField getRazonSocialBuscarCliente() {
		return clientes.getRazonSocialBuscarCliente();
	}

	public JTextField getTeléfonoBuscarCliente() {
		return clientes.getTeléfonoBuscarCliente();
	}

	public JTextField getDireccionBuscarCliente() {
		return clientes.getDireccionBuscarCliente();
	}

	public JButton getBotonBuscarCliente() {
		return clientes.getBotonBuscarCliente();
	}

	public JButton getBotonAltaCliente() {
		return clientes.getBotonAltaCliente();
	}

	public JLabel getMensajeBuscarCliente() {
		return clientes.getMensajeBuscarCliente();
	}

	public JLabel getMensajeAltaCliente() {
		return clientes.getMensajeAltaCliente();
	}

	public JButton getBotonBorrarCliente() {
		return clientes.getBotonBorrarCliente();
	}

	public void limpiarCamposAltaCliente() {
		clientes.limpiarCamposAlta();
	}

	public void limpiarCamposBusquedaCliente() {
		clientes.limpiarCamposBusqueda();
	}

}
