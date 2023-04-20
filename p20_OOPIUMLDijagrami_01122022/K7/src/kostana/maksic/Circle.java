package kostana.maksic;

public class Circle {

	private double radius;

	Circle(/*lista parametara*/) {//konstruktor bez parametara
		radius = 0.0;
	}

	Circle(double radius) { //imajedan parametar
		this.radius = radius;

	}

	Circle(Circle ob) { //ima objekat kao parametar
		radius = ob.radius; // potupkak inicijalizacije polja (atributa) objekta klase

	}

	public double area() {
		return 3.14 * radius * radius;
	}
}