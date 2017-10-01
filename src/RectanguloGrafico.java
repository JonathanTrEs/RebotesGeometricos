//Fichero RectanguloGrafico.java
import java.awt.Graphics;
import java.awt.Color;

class RectanguloGrafico extends Rectangulo implements Dibujable
{
	Color color;
	//constructor
	public RectanguloGrafico(int x1, int y1, int x2, int y2, Color unColor) {
		//llamada al constructor de Rectangulo
		super(x1, y1, x2, y2);
		this.color = unColor;
	}
	//metodos de la interface Dibujable
	public void dibujar(Graphics dw) {
		dw.setColor(color);
		dw.fillRect((int)x1, (int)y1, (int)(x2-x1), (int)(y2-y1));
	}
	public void setPosicion(double x, double y) {
		;
	}
	public void mover(int width, int height)
	{
	    // Check boundaries
	    if (x1 < 0) {//izquierda
			  dx1 = Math.abs(dx1);
	    	  dx2 = Math.abs(dx2);
	    }
	    if (x1 > width - (x2 - x1)) {//derecha
			  dx1 = -Math.abs(dx1);
			  dx2 = -Math.abs(dx2);
	    }
	    if (y1 < 0) {//arriba
			  dy1 = Math.abs(dy1);
			  dy2 = Math.abs(dy2);
	    }
	    if (y1 > height - (y2 - y1)) {//abajo 
			  dy1 = -Math.abs(dy1);
			  dy2 = -Math.abs(dy2);
	    }

	    x1 += dx1;
	    y1 += dy1;
	    x2 += dx2;
	    y2 += dy2;
	}
} //fin de la clase RectanguloGrafico