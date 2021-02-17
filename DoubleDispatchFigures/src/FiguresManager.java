
import java.util.ArrayList;

public class FiguresManager {
	private static ArrayList<Figure> collection = new ArrayList<Figure>();

	public static void main(String[] args) {
		
		collection.add(new Carre(1));
		collection.add(new Rectangle(10,10,2));
		int surface2 = 0;
		int surface3 = 0;
		for(Figure f : collection){	
			//calcule en 3D
			surface3 = surface3 + f.calculeSurface(new Dimension3D());
			//calcule en 2D
			surface2 = surface2 + f.calculeSurface(new Dimension2D());
		}
		System.out.println("surface2d: " + surface2);
		System.out.println("surface3d: " + surface3);
	}
}
