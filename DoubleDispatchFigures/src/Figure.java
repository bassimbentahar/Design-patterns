

public abstract class Figure {
	
	
	public int calculeSurface(Dimension dimension) {
			return dimension.calculerSurface(this);
	}
	public abstract int calculeSurface2d();
	public abstract int calculeSurface3d();

}
//calculer surface si 2d ou 3d