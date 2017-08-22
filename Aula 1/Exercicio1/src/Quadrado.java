
public class Quadrado extends Quadrilatero implements Diagonal{
	

	public Quadrado(double base) {

		super(base, base);
	}
    
	@Override
	public double area() {
		return areaQuadrilatero();
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt((areaQuadrilatero() + areaQuadrilatero())) ;
	}
	
	//@Override
	//public double diagonal() {
	//	return ((getBase() ^ 2) * (getAltura() ^ 2));
	//}
	
	
	
}
