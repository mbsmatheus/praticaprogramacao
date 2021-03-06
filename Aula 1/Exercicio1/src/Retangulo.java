
public class Retangulo extends Quadrilatero implements Diagonal {
	
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return areaQuadrilatero();
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2.0) + Math.pow(getAltura(), 2.0)) ;
	}
	
}
