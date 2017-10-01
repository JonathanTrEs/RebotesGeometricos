//fichero PanelDibujo.java

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Timer;

public class PanelDibujo extends Panel {
	private int delay = 10;

	// Create a timer with delay 1000 ms
	private Timer timer = new Timer(delay, new TimerListener());
	private ArrayList v;
	//constructor
	public PanelDibujo(ArrayList va) {
		super(new FlowLayout());
		this.v = va;
		timer.start();
	}
	
	private class TimerListener implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		      repaint();
		    }
	}

	//redefinicion del metodo paint (
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Dibujable dib;
		Iterator it;
		it = v.iterator();
		while(it.hasNext()) {
			dib = (Dibujable)it.next();
			dib.mover(width, height);
			dib.dibujar(g);
		}
	}
} //Fin de la clase DrawWindow
