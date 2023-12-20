package ies.alcala.garcia.clara.utiles;

import javax.swing.JComponent;

public class Pista {
	
	public static void toolTip(JComponent componente, String mensaje) {

		//Ponemos una pista (tooltip) con el mensaje que se pasa por parámetro
		componente.setToolTipText("<html><p width=\"250px\">" + mensaje + "</p></html>");

	}

}
