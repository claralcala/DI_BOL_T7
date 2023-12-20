package ies.alcala.garcia.clara.vista;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import ies.alcala.garcia.clara.controlador.Eventos;
import ies.alcala.garcia.clara.utiles.Pista;
import ies.alcala.garcia.clara.utiles.TextosComponentes;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;

public class PantallaMenu extends JFrame {

	private JPanel contentPane;
	private JLabel lblBanner;
	private JMenuBar barraMenu;
	private JMenu menuNosotros;
	private JMenu menuJuegos;
	private JMenu menuOpciones;
	private JMenu menuSugerencias;
	private JMenuItem itemVersion;
	private JButton btnVolver;
	private PantallaMenu frame = this;
	private JMenuItem menuItemNosotros;
	private JMenuItem menuItemJuegos;
	private JMenuItem itemSugerencias;
	
	/**
	 * Create the frame.
	 */
	public PantallaMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaMenu.class.getResource("/imagenes/cageicon_def.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 700, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	
		
		setTitle("CAGE GAMES - MENU PRINCIPAL");
		
		setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBanner = new JLabel();
		lblBanner.setIcon(new ImageIcon(PantallaMenu.class.getResource("/imagenes/CAGE_Banner.jpg")));
		lblBanner.setBounds(0, 69, 796, 310);
		contentPane.add(lblBanner);
		
		barraMenu = new JMenuBar();
		barraMenu.setBounds(0, 0, 796, 22);
		contentPane.add(barraMenu);
		//Añadimos el color gris del fondo
		contentPane.setBackground(new Color(172, 172, 154));
		
		menuNosotros = new JMenu("Informacion sobre los creadores");
		menuNosotros.setBackground(new Color(128, 255, 128));
		menuNosotros.setText(TextosComponentes.TEXTO_MENU_NOSOTROS);
		barraMenu.add(menuNosotros);
		
		menuItemNosotros = new JMenuItem("Para ir a otra pagina");
		
		menuItemNosotros.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK)); // Atajo de teclado Ctrl+N
		menuItemNosotros.setText(TextosComponentes.TEXTO_ITEM_NOSOTROS);
		menuItemNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed2(e);
				frame.dispose();
			}
		});
		
		menuItemNosotros.addMouseListener(new MouseListener() {
			

			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseEntered(MouseEvent e) {
				Eventos ev = new Eventos(frame);
				ev.mouseEntered2(e);
				
			}

			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		menuNosotros.add(menuItemNosotros);
		menuNosotros.addMouseListener(new MouseListener() {
			

			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseEntered(MouseEvent e) {
				Eventos ev = new Eventos(frame);
				ev.mouseEntered(e);
				
			}

			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
	
		
		menuJuegos = new JMenu();
		menuJuegos.setText(TextosComponentes.TEXTO_MENU_JUEGOS);
		barraMenu.add(menuJuegos);
		
		
		
		
		menuJuegos.addMouseListener(new MouseListener() {
			

			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseEntered(MouseEvent e) {
				
				
			}

			
			public void mouseExited(MouseEvent e) {
				Eventos ev = new Eventos(frame);
				ev.mouseExited(e);
				
			}
		});
		
		menuItemJuegos = new JMenuItem();
		menuItemJuegos.setText(TextosComponentes.TEXTO_ITEM_JUEGOS);
		menuItemJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed2(e);
				frame.dispose();
			}
		});
		menuJuegos.add(menuItemJuegos);
		
		menuSugerencias = new JMenu();
		menuSugerencias.setText(TextosComponentes.TEXTO_MENU_SUGIERE);
		barraMenu.add(menuSugerencias);
		
		itemSugerencias = new JMenuItem();
		itemSugerencias.setText(TextosComponentes.TEXTO_ITEM_SUGERENCIAS);
		itemSugerencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed2(e);
				frame.dispose();
			}
		});
		
		menuSugerencias.add(itemSugerencias);
		menuSugerencias.addMouseListener(new MouseListener() {
			

			
			public void mouseClicked(MouseEvent e) {
				Eventos ev = new Eventos(frame);
				ev.mouseClicked(e);
				
			}

			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
			public void mouseEntered(MouseEvent e) {
				
				
			}

			
			public void mouseExited(MouseEvent e) {
				
				
			}
		});
		
		
		menuOpciones = new JMenu();
		menuOpciones.setText(TextosComponentes.TEXTO_MENU_OPCIONES);
		
		barraMenu.add(menuOpciones);
		
		
		
		itemVersion = new JMenuItem();
		itemVersion.setText(TextosComponentes.TEXTO_ITEM_VERSION);
		menuOpciones.add(itemVersion);
		itemVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed2(e);
				
			}
		});
		
		//Ponemos los menús en opaco para poder ponerles color
		menuNosotros.setOpaque(true);
		menuJuegos.setOpaque(true);
		menuSugerencias.setOpaque(true);
		menuOpciones.setOpaque(true);
		
		//Les ponemos los colores
		menuNosotros.setBackground(new Color(211, 225, 72));
		menuJuegos.setBackground(new Color(72, 72, 56));
		menuJuegos.setForeground(Color.white);
		menuSugerencias.setBackground(new Color(211, 225, 72));
		menuOpciones.setBackground(new Color(72, 72, 56));
		menuOpciones.setForeground(Color.white);
		
		menuItemNosotros.setBackground(new Color (0, 173, 174));
		menuItemJuegos.setBackground(new Color (0, 173, 174));
		itemVersion.setBackground(new Color (0, 173, 174));
		itemSugerencias.setBackground(new Color (0, 173, 174));
		
		
		//Establecemos las pistas para el usuario
		Pista.toolTip(menuNosotros, "Informacion sobre los creadores");
		Pista.toolTip(menuJuegos, "Informacion sobre los juegos desarrollados por esta compañia");
		Pista.toolTip(menuOpciones, "Opciones sobre la aplicacion");
		Pista.toolTip(menuSugerencias, "Para sugerir juegos a la compañia");
		
		Pista.toolTip(menuItemNosotros, "Ir a otra ventana");
		Pista.toolTip(menuItemJuegos, "Ir a otra ventana");
		Pista.toolTip(itemSugerencias, "Ir a otra ventana");
		Pista.toolTip(itemVersion, "Abre un cuadro de dialogo informando de la version de la app");
		
		btnVolver = new JButton();
		btnVolver.setText(TextosComponentes.TEXTO_BTN_VOLVER);
		
		//Colores para fondo y letra del botón
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(255, 0, 0));
		btnVolver.setBounds(340, 408, 149, 45);
		contentPane.add(btnVolver);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 25, 786, 28);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaMenu.class.getResource("/imagenes/flecha.png")));
		lblNewLabel.setBounds(0, 0, 29, 28);
		lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                PantallaPrincipal pp = new PantallaPrincipal();
                pp.setVisible(true);
            }
        });
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaMenu.class.getResource("/imagenes/flechaDereecha.png")));
		lblNewLabel_1.setBounds(31, 5, 33, 18);
		panel.add(lblNewLabel_1);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eventos ev = new Eventos(frame);
				ev.actionPerformed(e);
				frame.dispose();
			}
		});
		
		
		this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    // Muestra el menú contextual en la posición del ratón
                    mostrarMenuContextual(e.getX(), e.getY());
                }
            }
        });

		
		
		
		
		
		
	}
	
	
	
	private void mostrarMenuContextual(int x, int y) {
        JPopupMenu menuContextual = new JPopupMenu();

        JMenuItem itemContextMenu = new JMenuItem("Volver");
        JMenuItem itemContextMenu2 = new JMenuItem("Sobre nosotros");
        
        itemContextMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	PantallaMenu pm = new PantallaMenu();
    			pm.dispose();
            	PantallaPrincipal pp = new PantallaPrincipal();
    			pp.setVisible(true);
    			
            }
        });
        
        itemContextMenu2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PantallaMenu pm = new PantallaMenu();
    			pm.dispose();
            	PantallaNosotros pn = new PantallaNosotros();
    			pn.setVisible(true);
				
			}
        	
        });

        menuContextual.add(itemContextMenu);

        menuContextual.add(itemContextMenu2);
        //Mostramos el menu contextual en la posición del ratón
        menuContextual.show(this, x, y);
    }






	public JButton getBtnVolver() {
		return btnVolver;
	}



	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}


	
	
}