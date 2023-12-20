package ies.alcala.garcia.clara.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ies.alcala.garcia.clara.controlador.Eventos;
import ies.alcala.garcia.clara.utiles.TextosComponentes;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class PantallaNosotros extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblCuerpo;
	private JLabel lblLogo;
	private JButton btnVolverMenu;
	
	private PantallaNosotros frame= this;
	
	
	
	public PantallaNosotros() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaNosotros.class.getResource("/imagenes/cageicon_def.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 700, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	
		
		setTitle("CAGE GAMES - SOBRE NOSOTROS");
		
		setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cambiamos el color del fondo
		contentPane.setBackground(new Color(172, 172, 154));
		
		
		lblTitulo = new JLabel("SOBRE CAGE GAMES");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitulo.setBounds(341, 28, 304, 92);
		contentPane.add(lblTitulo);
		
		lblCuerpo = new JLabel("CAGE Games es un estudio de videojuegos indie nacido en Mor\u00F3n de la Frontera (Sevilla) de la mano de Clara Alcal\u00E1 Garc\u00EDa");
		lblCuerpo.setVerticalAlignment(SwingConstants.TOP);
		lblCuerpo.setBounds(148, 165, 584, 213);
		contentPane.add(lblCuerpo);
		
		lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon(PantallaNosotros.class.getResource("/imagenes/cageicon_def.png")));
		lblLogo.setBounds(108, 213, 259, 241);
		contentPane.add(lblLogo);
		
		btnVolverMenu = new JButton();
		//Colores del botón (fondo y letra)
		btnVolverMenu.setForeground(new Color(255, 255, 255));
		btnVolverMenu.setBackground(new Color(255, 0, 0));
		btnVolverMenu.setBounds(565, 368, 158, 33);
		btnVolverMenu.setText(TextosComponentes.TEXTO_BOTON_VOLVERMENU);
		contentPane.add(btnVolverMenu);
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed(e);
				frame.dispose();
			}
		});
	}
}
