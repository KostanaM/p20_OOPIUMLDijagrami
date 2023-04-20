package kostana.maksic;

public class Circle {
	private double radius;

	Circle(double rad) // Kontruktor klase koji inicijalizuje jedan podatak.

	{
		radius = rad;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
