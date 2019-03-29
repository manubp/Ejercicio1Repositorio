package ejercicio1Repositorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class controlador implements ActionListener, WindowListener {

	Vista objVista = new Vista();
	Modelo objModelo = new Modelo();
	
	
	public controlador(Vista objVista, Modelo objModelo) {
	
		this.objVista = objVista;
		this.objModelo = objModelo;
		
		
		objVista.addWindowListener(this);
		
	}

	
	
	
	
	

	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0); 

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
