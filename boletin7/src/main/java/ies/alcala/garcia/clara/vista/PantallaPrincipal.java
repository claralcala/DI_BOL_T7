package ies.alcala.garcia.clara.vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ies.alcala.garcia.clara.controlador.Eventos;
import ies.alcala.garcia.clara.utiles.TextosComponentes;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnEntrar;
	private JButton btnSalir;
	private JLabel lblPrincipal; 
	private JLabel lblLogo;
	private PantallaPrincipal frame = this;
	

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaPrincipal.class.getResource("/imagenes/cageicon_def.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 700, 800, 550);
		setTitle("CAGE GAMES");
	
		
		setLocationRelativeTo(null);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 354, 760, 169);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Añadimos color gris para el fondo de los paneles
		contentPane.setBackground(new Color(172, 172, 154));
		panel.setBackground(new Color(172, 172, 154));
		
		btnEntrar = new JButton();
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(0, 128, 64));
		btnEntrar.setBounds(68, 60, 158, 37);
		btnEntrar.setText(TextosComponentes.TEXTO_BTN_ENTRAR);
		panel.add(btnEntrar);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed(e);
			}
		});
		
		btnSalir = new JButton();
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(255, 0, 0));
		btnSalir.setBounds(553, 60, 158, 37);
		btnSalir.setText(TextosComponentes.TEXTO_BTN_SALIR);
		panel.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed(e);
			}
		});
		
		lblPrincipal = new JLabel();
		
		//Cambiamos el tamaño de fuente
		lblPrincipal.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		lblPrincipal.setBounds(314, 10, 203, 57);
		lblPrincipal.setText(TextosComponentes.TEXTO_PANTALLA_PRINCIPAL);
		contentPane.add(lblPrincipal);
		
		lblLogo = new JLabel();
		lblLogo.setBounds(218, 32, 568, 387);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenes/cagelogodeff.png")));
		
		
		
		
	}


	public JButton getBtnEntrar() {
		return btnEntrar;
	}


	public void setBtnEntrar(JButton btnEntrar) {
		this.btnEntrar = btnEntrar;
	}


	public JButton getBtnSalir() {
		return btnSalir;
	}


	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	
	
}
