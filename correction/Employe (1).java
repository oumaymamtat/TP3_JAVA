package salaireTableauInterface;

import java.util.Scanner;

public class Employe implements Interface_Emp { 

	String nom;
	int matricule;
	int nbre_heure;
	double prix_heure;
	public Employe(String nom, int matricule, int nbre_heure, double prix_heure)
	{
		
		this.nom=nom;
                this.matricule=matricule ;
		this.nbre_heure=nbre_heure;
		this.prix_heure=prix_heure;
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
	
	@Override
	public void afficherSalarie() {
		System.out.println("le nom est "+ this.nom);
		System.out.println("Sa matricule est "+ this.matricule);
		System.out.println("le nombre d'heure est "+ this.getPrix_heure());
	System.out.println("le prix de l'heure est "+ this.getNbre_heure());
		System.out.println("le salaire est "+this.calculerSalaire());
		System.out.println("***************************************");
	}
		
	
	/****************implementation de la methode calculeSalaire****************/
	
	public double calculerSalaire() {
		
		return this.prix_heure*this.nbre_heure;
	}
	




	/**************************saisir employer*******************/
	 public void saisir()
	   {
		 Scanner s1 = new Scanner(System.in);
		
		System.out.println("Vous avez choisi d'ajouter un Vendeur");
			
			System.out.println("Veuillez saisir le nom");
			String nom=s1.nextLine();
			this.setNom(nom);
			
			System.out.println("Veuillez saisir la matricule");
			int matricule=s1.nextInt();
			this.setMatricule(matricule);
			
			System.out.println("Veuillez saisir le nombre d'heures, ");
			int nbre_heure=s1.nextInt();
			this.setNbre_heure(nbre_heure);
			
			System.out.println("Veuillez saisir le prix de l'heure");
			double prix_heure=s1.nextDouble();
			this.setPrix_heure(prix_heure);
								
	     
	   }



}
	



