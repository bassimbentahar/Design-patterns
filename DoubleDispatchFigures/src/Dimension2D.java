
public class Dimension2D extends Dimension{

	public Dimension2D() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calculerSurface(Figure figure) {
		return figure.calculeSurface2d();
	}
}
