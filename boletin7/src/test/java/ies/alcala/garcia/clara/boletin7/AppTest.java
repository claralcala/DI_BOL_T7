package ies.alcala.garcia.clara.boletin7;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ies.alcala.garcia.clara.vista.PantallaMenu;
import ies.alcala.garcia.clara.vista.PantallaPrincipal;
import ies.alcala.garcia.clara.vista.PantallaSugerencias;



/**
 * Unit test for simple App.
 */
public class AppTest 

{

	//creamos e inicializamos una instancia de las pantallas
	private PantallaMenu pantallaMenu;
	
	private PantallaPrincipal pantallaPrincipal;
	
	private PantallaSugerencias pantallaSugerencias;

    @BeforeEach
    void setUpPP() {
        pantallaPrincipal = new PantallaPrincipal();
    }

    @BeforeEach
    void setUp() {
        pantallaMenu = new PantallaMenu();
    }
    
    
    @BeforeEach
    void setUpPS() {
        pantallaSugerencias = new PantallaSugerencias();
    }
    
    
    //con este test comprobamos que se cree una instancia de la pantallamenu
    @Test
    void testPantallaMenu() {
        assertNotNull(pantallaMenu, "Se crea una instancia de la pantallamenu");
    }
    
    
  
    
    
    @Test
    void testBotonesNotNull() {
        assertNotNull(pantallaPrincipal.getBtnEntrar(), "El botón de entrar debería crearse correctamente");
        assertNotNull(pantallaPrincipal.getBtnSalir(), "El botón de salir debería crearse correctamente");
    }

    @Test
    void testBotonesText() {
        assertEquals("Menu principal", pantallaPrincipal.getBtnEntrar().getText(), "El texto del botón de entrar debería ser Menu Principal");
        assertEquals("Salir", pantallaPrincipal.getBtnSalir().getText(), "El texto del botón de salir debería ser Salir");
    }
    
    
  
     
    @Test
    void testBotonSalirAction() {
        ActionListener mockActionListener = Mockito.mock(ActionListener.class);

        pantallaPrincipal.getBtnSalir().addActionListener(mockActionListener);
        pantallaPrincipal.getBtnSalir().doClick();

        Mockito.verify(mockActionListener, Mockito.times(1)).actionPerformed(Mockito.any(ActionEvent.class));
    }
    
    
//    @Test
//    void testBotonVolverMenuAction() {
//        ActionListener mockActionListener = Mockito.mock(ActionListener.class);
//
//        pantallaSugerencias.getBtnVolverMenu().addActionListener(mockActionListener);
//        pantallaSugerencias.getBtnVolverMenu().doClick();
//
//        Mockito.verify(mockActionListener, Mockito.times(1)).actionPerformed(Mockito.any(ActionEvent.class));
//    }
	
	
	
}
