//fichero Rectagulo.java

class Rectangulo extends Geometria {
	//definicion de las variables miembro
	//private static int numRectangulos = 0;
	protected double x1, y1, x2, y2;
	protected int dx1 = 2; // Increment x1-coordinate
	protected int dy1 = 2; // Increment y1-coordinate
	protected int dx2 = 2; // Increment x-coordinate
	protected int dy2 = 2; // Increment y-coordinate
	
	//constructor por defecto (sin argumentos)
	//se define mediante una llamada al constructor general
	public Rectangulo() { this(0, 0, 1.0, 1.0); }
	
	//constructor de la clase
	public Rectangulo(double p1x, double p1y, double p2x, double p2y) {
		x1 = p1x;
		x2 = p2x;
		y1 = p1y;
		y2 = p2y;
		//numRectangulos++;
	}

	public double area() { return (x1-x2)*(y1-y2); }
	public double perimetro() { return 2.0 * ((x1-x2)+(y1-y2)); }
}//fin de la clase Rectangulo