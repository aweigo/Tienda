package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import vista.paneles.Articulos;
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
	
	public UI() {
		crearFrame();
		crearPaneles();
	}
	
	private void crearPaneles() {
		this.articulos = new Articulos();
	}
	
	private void crearFrame() {
		setTitle("Tienda");
		setMinimumSize(new Dimension(700, 600));
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
		
		JButton botonArticulos = new JButton("Art\u00EDculos");
		botonArticulos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonArticulos.setFocusPainted(false);
		botonArticulos.setBackground(new Color(176, 196, 222));
		botonArticulos.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelSuperior.add(botonArticulos);
		
		JButton botonClientes = new JButton("Clientes");
		botonClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonClientes.setFocusPainted(false);
		botonClientes.setBackground(new Color(176, 196, 222));
		botonClientes.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelSuperior.add(botonClientes);
		
		JButton botonPedidos = new JButton("Pedidos");
		botonPedidos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonPedidos.setFocusPainted(false);
		botonPedidos.setBackground(new Color(176, 196, 222));
		botonPedidos.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelSuperior.add(botonPedidos);
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));
	}

	public Articulos getArticulos() {
		return articulos;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

}
