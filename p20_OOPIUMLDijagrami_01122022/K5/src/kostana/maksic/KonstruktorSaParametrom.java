package kostana.maksic;

public class KonstruktorSaParametrom {

	public static void main(String[] args) {
		Circle c1 = new Circle(5); // kreiranje objekta sa parametrom

		System.out.println("Povrsina kruga iznosi : " + c1.area());

	}

}

// Ako ne navedemo konstuktor?
// Da li u konstrukotru možemo zadati početnu vrijednost? ne preko parametra
// Konstrukotor sa parametrom