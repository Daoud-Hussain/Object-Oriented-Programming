public class Runner{
	public static void main(String[] args) {
		Point a1 = new Point(); //Setting default values
		Point a2 = new Point(-1,3); //2 Argument Values
		a2.move(3,4);
		a2.checkOrigin();
		a2.display();
		a2.AddTwoPoints(a1);
		a2.AddThreePoints(a1,a2);

	}
}
