package kostana.maksic;

public class ObjekatKaoParametar {

	public static void main(String[] args) {
		Circle c1 = new Circle (10);
		Circle c2 = new Circle (c1); // c1 je objekat koji je vec kreiran
		
		System.out.println("Površina kruga: " + c2.area());
	}

}
