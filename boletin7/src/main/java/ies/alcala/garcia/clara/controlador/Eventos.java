package ies.alcala.garcia.clara.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import ies.alcala.garcia.clara.utiles.TextosComponentes;
import ies.alcala.garcia.clara.vista.PantallaJuegos;
import ies.alcala.garcia.clara.vista.PantallaMenu;
import ies.alcala.garcia.clara.vista.PantallaNosotros;
import ies.alcala.garcia.clara.vista.PantallaPrincipal;
import ies.alcala.garcia.clara.vista.PantallaSugerencias;


public class Eventos implements ActionListener, MouseListener, KeyListener {

	
	private JFrame frame;
	private PantallaMenu pm;
	
	
	public Eventos(JFrame frame) {
		this.frame = frame;
	}
	
	

	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		
		
		if (boton.getText().equals(TextosComponentes.TEXTO_BTN_ENTRAR)) {
			System.out.println("Evento de pulsar el boton Entrar");
			//Añadimos joptionpane informativo al entrar en el menu
			JOptionPane.showMessageDialog(null, "Se le redirigirá al menú principal");
			PantallaMenu pm = new PantallaMenu();
			pm.setVisible(true);
			frame.setVisible(false);
			
		}else if (boton.getText().equals(TextosComponentes.TEXTO_BTN_SALIR)) {
			System.out.println("Evento de pulsar el boton Salir");
			 // Configurar el texto y los botones en español
	        UIManager.put("OptionPane.yesButtonText", "Sí");
	        UIManager.put("OptionPane.noButtonText", "No");
			
			// Mostrar un JOptionPane para confirmar el cierre de la ventana
			int result = JOptionPane.showConfirmDialog(frame, "¿Estas seguro de que quieres salir de la aplicacion?",
					"Confirmar cierre", JOptionPane.YES_NO_OPTION);

			if (result == JOptionPane.YES_OPTION) {
				// Si el usuario elige "Sí", cerrar la ventana
				frame.dispose();
			}
			
		}else if (boton.getText().equals(TextosComponentes.TEXTO_BTN_VOLVER)) {
			System.out.println("Evento de pulsar el boton volver");
			boton.setBackground(new Color(0, 128, 64));
			
			//Imprimimos esta l�nea para comprobar que el boton efectivamente cambia de color al que le establecemos cuando lo pulsamos
			System.out.println("Color del boton: " +boton.getBackground());
			
			PantallaPrincipal pp = new PantallaPrincipal();
			pp.setVisible(true);
			
		}else if (boton.getText().equals(TextosComponentes.TEXTO_BOTON_VOLVERMENU)) {
			System.out.println("Evento de pulsar el boton para volver al menu");
			
			PantallaMenu pm2 = new PantallaMenu();
			pm2.setVisible(true);
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	public void actionPerformed2(ActionEvent e) {
		JMenuItem menuItem = (JMenuItem) e.getSource();
		if (menuItem.getText().equals(TextosComponentes.TEXTO_ITEM_NOSOTROS)) {
			PantallaMenu pm = new PantallaMenu();
			pm.dispose();
			PantallaNosotros pn = new PantallaNosotros();
			pn.setVisible(true);
			
		}else if (menuItem.getText().equals(TextosComponentes.TEXTO_ITEM_JUEGOS)) {
			System.out.println("Evento de pulsar el JMenuItem");
			PantallaJuegos pj = new PantallaJuegos();
			pj.setVisible(true);
		}else if (menuItem.getText().equals(TextosComponentes.TEXTO_ITEM_VERSION)) {
			System.out.println("Evento de pulsar el JMenuItem");
			JOptionPane.showMessageDialog(null, "Versi�n 1.0. Todos los derechos reservados");
		}else if (menuItem.getText().equals(TextosComponentes.TEXTO_ITEM_SUGERENCIAS)) {
			System.out.println("Evento de pulsar el JMenuItem");
			PantallaSugerencias ps = new PantallaSugerencias();
			ps.setVisible(true);
		}
		
	}

	public void mouseClicked(MouseEvent e) {
		JMenu menu = (JMenu) e.getSource();
		if (menu.getText().equals(TextosComponentes.TEXTO_MENU_SUGIERE)) {
			System.out.println("Evento de clicar el rat�n");
			
		}
		
		
		
	}

	public void mousePressed(MouseEvent e) {
		
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		JMenu menu = (JMenu) e.getSource();
		
		
		if (menu.getText().equals(TextosComponentes.TEXTO_MENU_NOSOTROS)) {
			System.out.println("Evento de entrar el raton en el JMenu");
		
			
		
		}
		
	
		
	}
	
	public void mouseEntered2(MouseEvent e) {
		JMenuItem menuItem = (JMenuItem) e.getSource();
		if (menuItem.getText().equals(TextosComponentes.TEXTO_ITEM_NOSOTROS)) {
			System.out.println("Evento de entrar el raton en el JMenuItem");
			
		
		}
		
	}

	public void mouseExited(MouseEvent e) {
		JMenu menu = (JMenu) e.getSource();
		if (menu.getText().equals(TextosComponentes.TEXTO_MENU_JUEGOS)) {
			System.out.println("Evento de salir el rat�n del JMenu Juegos");
	}
	
		
	}



	public void keyTyped(KeyEvent e) {
		JTextArea texto = (JTextArea) e.getSource();
		System.out.println("Evento de escribir tecla");
	}



	public void keyPressed(KeyEvent e) {
		JTextArea texto = (JTextArea) e.getSource();
		System.out.println("Evento de pulsar tecla");
		
	}



	public void keyReleased(KeyEvent e) {
		JTextArea texto = (JTextArea) e.getSource();
		System.out.println("Evento de soltar tecla");
		
	}


}
