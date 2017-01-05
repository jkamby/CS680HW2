import java.awt.Point;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author JohnPaul
 *
 */

public class PolygonTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle tri1 = new Triangle(new Point(1, 1), new Point(3, 5), new Point(5, 1));
		Triangle tri2 = new Triangle(new Point(1, 1), new Point(5, 9), new Point(9, 1));
		Rectangle rect1 = new Rectangle(new Point(1, 1), new Point(1, 3), new Point(5, 3), new Point(5, 1));
		Rectangle rect2 = new Rectangle(new Point(1, 1), new Point(1, 5), new Point(9, 5), new Point(9, 1));
		
		ArrayList<Polygon> collexion = new ArrayList<Polygon> ();
		
		collexion.add(tri1);
		collexion.add(tri2);
		collexion.add(rect1);
		collexion.add(rect2);
		
		int i = 1;
		for(Polygon p : collexion) {
			System.out.println("Polygon " + i++ + "'s area is " + p.getArea());
		}
		

	}

}
