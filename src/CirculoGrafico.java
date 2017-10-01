//fichero CirculoGrafico.java

import java.awt.Graphics;
import java.awt.Color;

public class CirculoGrafico extends Circulo implements Dibujable {
	//se heredan las variables y metodos de la clase Circulo
	Color color;
	//Constructor
	public CirculoGrafico (int x, int y, int r, Color unColor) {
		//llamada al constructor de Circulo
		super(x, y, r);
		this.color = unColor;
	}
	//metodos de la interface Dibujable
	public void dibujar(Graphics dw) {
		dw.setColor(color);
		dw.fillOval((int)(x-r), (int)(y-r), (int)(2.0*r), (int)(2.0*r));
	}
	public void setPosicion(double x, double y) {
		;
	}
	public void mover(int width, int height) {
	    // Check boundaries
	    if (x < r) 
			  dx = Math.abs(dx);
	    if (x > width - r) 
			  dx = -Math.abs(dx);
	    if (y < r) 
			  dy = Math.abs(dy);
	    if (y > height - r) 
			  dy = -Math.abs(dy);

	    x += dx;
	    y += dy;
	}
}