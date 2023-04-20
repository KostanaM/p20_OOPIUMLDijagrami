package kostana.maksic;

public class A {
	private String message;

	// Deklarisanjem privatnih podataka vrsi se enkapsulacija - skrivanje podataka
	// Sprecava se promena vrednosti promenjivih iz koda van zadate klase

	// podatak = atribut = osobina klase
	// Objekti imaju svoje atribute
	// atributi predstavljaju preko promenjivih u deklaraciji klase
	// deklarisu se unutar klase van svih metoda

	// Metode klase

	// Metoda setMessage postavlja poruku.

	public void setMessage(String msg) // metoda je public, da bi se omoguciolo pristup podacima
	// void znaci da ne vracaju rezultat, kao parametar imaju promenjivu istog tipa
	// kao podatak koji postavljaju

	{
		message = msg; // posatavlja vrednost promenjivoj message
	}

	// Metoda getMessage() vraca poruku.
	public String getMessage() // nema parametara, vracaju odgovarajuci tip podataka
	{
		return message;
	}

	/*
	 * Parametri i argumenti metoda Promenjiva deklarisana u zaglavlju metode
	 * nazivamo parametrom. Argument se prosledjuje metodi prilikom poziva metoe
	 * !!!Prilikom poziva, parametri dobijaju vrednost argumenta metode.
	 * 
	 */
}
