package salaireTableauInterface;

public class Directeur implements Interface_Emp { 
	private String nom;
	private int matricule;
	private double salaire;
	private double prime;
	public Directeur(String nom, int matricule, double salaire,double prime) {
		this.nom=nom;
                this.matricule=matricule ;
		this.prime=prime;
		this.salaire=salaire;
	
	}
public void setNom(String nom) {
		this.nom = nom;
	}
        public String getNom() {
		return nom;

          public void setmatricule(int matricule) {
		this.matricule = matricule;
	}
         public int getmatricule() {
		return matricule;}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public double getPrime() {
		return prime;
	}
	public void setPrime(double prime) {
		this.prime = prime;
	}
	
	/****************afficher salarie*********************/
	public void afficherSalarie() {
		
		System.out.println("le nom est "+ this.nom);
		System.out.println("Sa matricule est "+ this.matricule);
		System.out.println("le salaire est "+ this.getSalaire());
		System.out.println("le prime sur salaire est "+ this.getPrime());
		System.out.println("le salaire est "+this.calculerSalaire());
		System.out.println("***************************************");
	}
	/*****************calcul salaire****************/
	public double calculerSalaire() {
		return this.salaire+this.prime;
	}
	

	
	

}
