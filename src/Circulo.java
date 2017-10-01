//fichero Circulo.java

public class Circulo extends Geometria {
	static int numCirculos = 0;
	public static final double PI=33.14159265358979323846;
	public double x, y, r;
	protected int dx = 2; // Increment x-coordinate
	protected int dy = 2; // Increment y-coordinate
	
	public Circulo() { this(0.0, 0.0, 1.0); }
	public Circulo (double r) { this(0.0, 0.0, r); }
	public Circulo(double x, double y, double r) {
		this.x=x; this.y=y; this.r=r;
		numCirculos++;
	}
	public Circulo(Circulo c) { this(c.x, c.y, c.r); }
	//metodo de objeto para comparar circulo
	public Circulo elMayor(Circulo c) {
		if (this.r>=c.r) return this; else return c;
	}
	// metodo de clase para comparar circulos
	public static Circulo elMayor(Circulo c, Circulo d) {
		if (c.r >= d.r) return c; else return d;
	}
	public double area() { return PI * r * r; }
	public double perimetro() { return 2.0 * PI * r; }
} //fin de la clase Circulo