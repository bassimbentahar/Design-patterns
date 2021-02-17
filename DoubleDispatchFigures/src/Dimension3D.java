
public class Dimension3D extends Dimension{

	public Dimension3D() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculerSurface(Figure figure) {
		return figure.calculeSurface3d();
	}

}
