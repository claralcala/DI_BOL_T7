package ies.alcala.garcia.clara.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ies.alcala.garcia.clara.controlador.*;
import ies.alcala.garcia.clara.utiles.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;


public class PantallaSugerencias extends JFrame {

	private JPanel contentPane;
	private JButton btnVolverMenu;
	private JButton btnEnviar;
	private PantallaSugerencias frame=this;
	
	public PantallaSugerencias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaNosotros.class.getResource("/imagenes/cageicon_def.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 700, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	
		
		setTitle("CAGE GAMES - SUGERENCIAS");
		
		setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("SUGIERE UN JUEGO");
		lblTitulo.setBounds(310, 33, 332, 86);
		contentPane.add(lblTitulo);
		
		contentPane.setBackground(new Color(172, 172, 154));
		
		JTextArea textoSugerir = new JTextArea();
		textoSugerir.setBounds(274, 162, 194, 171);
		contentPane.add(textoSugerir);
		textoSugerir.addKeyListener(new KeyListener(){

			
			public void keyTyped(KeyEvent e) {
				Eventos ev = new Eventos(frame);
				ev.keyTyped(e);
				
			}

			
			public void keyPressed(KeyEvent e) {
				Eventos ev = new Eventos(frame);
				ev.keyPressed(e);
				
			}

			
			public void keyReleased(KeyEvent e) {
				Eventos ev = new Eventos(frame);
				ev.keyReleased(e);
				
			}
			
		});
		
		
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
		
		btnEnviar = new JButton();
		btnEnviar.setBounds(565, 368, 158, 33);
		
		//Colores del botón (fondo y letra)
				btnEnviar.setForeground(new Color(255, 255, 255));
				btnEnviar.setBackground(Color.GREEN);
		btnEnviar.setText(TextosComponentes.TEXTO_BTN_ENVIAR);
		contentPane.add(btnEnviar);
	}

//	public JPanel getContentPane() {
//		return contentPane;
//	}
//
//	public void setContentPane(JPanel contentPane) {
//		this.contentPane = contentPane;
//	}
//
//	public JButton getBtnVolverMenu() {
//		return btnVolverMenu;
//	}
//
//	public void setBtnVolverMenu(JButton btnVolverMenu) {
//		this.btnVolverMenu = btnVolverMenu;
//	}
//
//	public JButton getBtnEnviar() {
//		return btnEnviar;
//	}
//
//	public void setBtnEnviar(JButton btnEnviar) {
//		this.btnEnviar = btnEnviar;
//	}
//	public PantallaSugerencias getFrame() {
//		return frame;
//	}
//
//	public void setFrame(PantallaSugerencias frame) {
//		this.frame = frame;
//	}
	
	
}
