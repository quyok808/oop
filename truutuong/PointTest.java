package truutuong;

public class PointTest {
	public static void swapPoint(Point p1, Point p2) {
		System.out.println("Point 1 in swap = ");
		p1.setX(100);
		p1.setY(100);
		p1.printPoint();
		Point temp = p1;
		p1 = p2;
		p2 = temp;
		System.out.println("Point 1.1 in swap = ");
		p1.printPoint();
		System.out.println("Point 2 in swap = ");
		p2.printPoint();
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		swapPoint(p1, p2);
		System.out.println("Point 1 after swap = ");
		p1.printPoint();
		System.out.println("Point 2 after swap = ");
		p2.printPoint();
	}
}
