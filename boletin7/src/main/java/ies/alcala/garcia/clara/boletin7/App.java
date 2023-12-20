package ies.alcala.garcia.clara.boletin7;

import java.awt.EventQueue;

import ies.alcala.garcia.clara.vista.PantallaPrincipal;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					PantallaPrincipal ventana = new PantallaPrincipal();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
