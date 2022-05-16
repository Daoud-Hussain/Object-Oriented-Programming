public class Runner{
	public static void main(String[] args) {
		Circle c1 = new Circle(true, "Blue", 2.5, 5);
		Circle c2 = new Circle(false, "Red", 1.5, 10);
		Rectangle r1 = new Rectangle(true, "Blue", 2.5, 4, 5);
		Rectangle r2 = new Rectangle(false, "Red", 3.6, 6, 5);
		Rectangle r3 = new Rectangle(true, "Green", 4.5, 1, 5);

		Drawing d = new Drawing();
		d.add(c1);
		d.add(c2);
		d.add(r1);
		d.add(r2);
		d.add(r3);

		System.out.println("Total Area of Drawing: " + d.calculateArea());
		System.out.println("Number of Filled Figures in the drawing is: " + d.countFilled());

	}
}