
public abstract class Quadrilatero extends Poligono {
	
	private double area;
	
	public Quadrilatero(double base, double altura) {
		super(base, altura);
	}

	public double areaQuadrilatero() {
		area = getBase() * getAltura();
		return area;
	}
}