package gestion_personnel;

import java.util.Scanner;

//public class Employe {
public class Employe implements IEmploye {
	protected int matricule;
	protected String nom;
	protected int nbHeures;
	protected double prixHeure;

	// constructor
	public Employe(int matricule,String nom,int nbHeures,double prixHeure) {
		this.matricule = matricule;
		this.nom = nom;
		this.nbHeures = nbHeures;
		this.prixHeure = prixHeure;
	}

	// Saisir toutes les informations associées à un employé
	public void saisirEmploye() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Saisie d'un employé : ");
		System.out.println("Saisir la matricule :");
		this.matricule = scn.nextInt();
		System.out.println("Saisir le nom :");
		this.nom = scn.next();
		System.out.println("Saisir le nombre d'heures :");
		this.nbHeures = scn.nextInt();
		System.out.println("Saisir le prix d'une heure :");
		this.prixHeure = scn.nextDouble();

	}

	// Retourner toutes les informations associées à un employé
	public String toString() {
		return "matricule : "+this.matricule+" nom : "+this.nom+" nombre d'heures : "+this.nbHeures+
				" prix d'une heure : "+this.prixHeure+" ";
	}

	// Calculer la paye d’un employé
	public double payeEmploye() {
		return prixHeure*(double)nbHeures;
	}


}
