package gestion_personnel;

import java.util.Scanner;

//public class Vendeur extends Employe {
public class Vendeur implements IEmploye {

	private double ventes;
	private double pourcentage;
	private double commission;

	// constructor
	public Vendeur(int matricule,String nom,int nbHeures,double prixHeure,double ventes,double pourcentage) {
		// super(matricule, nom, nbHeures, prixHeure);
		this.ventes = ventes;
		this.pourcentage = pourcentage;
		this.commission = this.ventes * this.pourcentage;
	}

	// Saisir toutes les informations associées à un vendeur
	public void saisirVendeur() {
		Scanner scn = new Scanner(System.in);
		// super.saisirEmploye();
		System.out.println("Saisir les ventes :");
		this.ventes = scn.nextDouble();
		System.out.println("Saisir le pourcentage :");
		this.pourcentage = scn.nextDouble();
		this.commission = this.ventes * this.pourcentage;
	}

	// Retourner toutes les informations associées à un vendeur
	public String toString() {
		return super.toString() + " ventes : " + this.ventes + " pourcentage : " + this.pourcentage + " comission : "
				+ this.commission + " ";
	}

	// Calculer la paye d’un vendeur
	/*
	 * public double payeVendeur() { return super.payeEmploye() + this.commission; }
	 */

	// methods added afterdding IEmploye Interface

	@Override
	public void saisirEmploye() {
		// TODO Auto-generated method stub

	}

	@Override
	public double payeEmploye() {
		// TODO Auto-generated method stub
		return 0;
	}

}
