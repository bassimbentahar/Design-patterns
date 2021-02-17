

public class Carre extends Figure{
	int largeur;
	public Carre(int largeur) {
		super();
		this.largeur = largeur;
	}
	@Override
	public int calculeSurface2d() {
		// TODO Auto-generated method stub
		return largeur*largeur;
	}
	@Override
	public int calculeSurface3d() {
		// TODO Auto-generated method stub
		return 6*largeur*largeur;
	}

}
