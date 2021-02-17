
public class Rectangle extends Figure{
	int largeur, longueur,hauteur;
	
	public Rectangle(int largeur, int longueur, int hauteur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	@Override
	public int calculeSurface2d() {
		// TODO Auto-generated method stub
		return largeur*longueur;
	}
	@Override
	public int calculeSurface3d() {
		// TODO Auto-generated method stub
		 return 2 * (largeur*longueur +  largeur* hauteur + longueur *hauteur);
	}

}
