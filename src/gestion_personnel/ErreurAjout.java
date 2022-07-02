package gestion_personnel;

public class ErreurAjout extends Exception {
	
	public ErreurAjout(String message) {

		// super(message);
		System.out.println("le tableau est plein");
	}


}
