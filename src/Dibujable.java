//fichero Dibujo.java

import java.awt.Graphics;

public interface Dibujable {
	public void dibujar(Graphics dw);
	public void setPosicion (double x, double y);
	public abstract void mover(int a, int b);
}