package p1;

public class Employe extends Salarie {

	
	
         
        int nbre_heure;
	double prix_heure;
	public Employe(String nom, int matricule, int nbre_heure, double prix_heure)
	{
		super(nom, matricule);
		this.nbre_heure=nbre_heure;
		this.prix_heure=prix_heure;
	}
	public int getNbre_heure() {
		return nbre_heure;
	}
	public void setNbre_heure(int nbre_heure) {
		this.nbre_heure = nbre_heure;
	}
	public double getPrix_heure() {
		return prix_heure;
	}
	public void setPrix_heure(float prix_heure) {
		this.prix_heure = prix_heure;
	}
	
	
	public void afficherSalarie() {
		super.afficherSalarie();
		System.out.println("le nombre d'heure est "+ this.getNbre_heure());
		System.out.println("le prix de l'heure est "+ this.getPrix_heure());
		System.out.println("le salaire est "+this.calculerSalaire());
		System.out.println ("************************************");
	}


	/****************implementation de la methode calculeSalaire****************/
	
	public double calculerSalaire() {
		
		return this.prix_heure*this.nbre_heure;
	}
	

}
	



