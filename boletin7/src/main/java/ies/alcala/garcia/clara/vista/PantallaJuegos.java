package ies.alcala.garcia.clara.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ies.alcala.garcia.clara.controlador.Eventos;
import ies.alcala.garcia.clara.utiles.TextosComponentes;


public class PantallaJuegos extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblCuerpo;
	private JLabel lblLogo;
	private JButton btnVolverMenu;
	
	private PantallaJuegos frame= this;

	public PantallaJuegos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaJuegos.class.getResource("/imagenes/cageicon_def.png")));
		setBounds(700, 700, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	
		
		setTitle("CAGE GAMES - NUESTROS JUEGOS");
		
		setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		contentPane.setBackground(new Color(172, 172, 154));
		
		
		lblTitulo = new JLabel("SOBRE NUESTROS JUEGOS");
		lblTitulo.setBounds(341, 28, 304, 92);
		contentPane.add(lblTitulo);
		
		lblCuerpo = new JLabel("Aqui iria info de nuestros juegos");
		lblCuerpo.setVerticalAlignment(SwingConstants.TOP);
		lblCuerpo.setBounds(148, 165, 584, 213);
		contentPane.add(lblCuerpo);
		
		lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon(PantallaNosotros.class.getResource("/imagenes/cageicon_def.png")));
		lblLogo.setBounds(108, 213, 259, 241);
		contentPane.add(lblLogo);
		
		btnVolverMenu = new JButton();
		btnVolverMenu.setBounds(565, 368, 158, 33);
		//Colores del botón (fondo y letra)
				btnVolverMenu.setForeground(new Color(255, 255, 255));
				btnVolverMenu.setBackground(new Color(255, 0, 0));
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
