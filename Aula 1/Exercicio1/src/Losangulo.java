
public class Losangulo extends Quadrilatero {
	
	public Losangulo(double base, double altura) {
		super(base, altura);
	}

	
	@Override
	public double area() {
		return areaQuadrilatero();
	}
}
