package gestion_personnel;

import java.util.ArrayList;
import java.util.Scanner;

//public class Directeur extends Employe {
public class Directeur implements IEmploye {

	private double salaireFixe;
	private double prime;
	private ArrayList<Employe> employesDiriges;

	// constructor
	public Directeur(int matricule,String nom,int nbHeures,double prixHeure,double salaireFixe, double prime) {
		// super(matricule, nom, nbHeures, prixHeure);
		this.salaireFixe = salaireFixe;
		this.prime = prime;
		for(Employe e : this.employesDiriges) {
			e = new Employe(0, null, 0, 0.0);
		}
	}

	// Saisir toutes les informations associées à un Directeur
	public void saisirDirecteur() {
		Scanner scn = new Scanner(System.in);
		// super.saisirEmploye();
		System.out.println("Saisir le salaire fixe : ");
		this.salaireFixe = scn.nextDouble();
		System.out.println("Saisir le prime :");
		this.prime = scn.nextDouble();
		System.out.println("Saisir les employes diriges : ");
		for (Employe e : this.employesDiriges) {
			e.saisirEmploye();
		}
	}

	// Retourner toutes les informations associées à un Directeur
	public String toString() {
		String ch = super.toString() + "salaire fixe : " + this.salaireFixe + " prime : " + this.prime
				+ "\n Liste des employes diriges : \n";
		for (Employe e : this.employesDiriges)
			ch = ch + e.toString()+"\n";
		return ch;

	}

	// Calculer la paye d’un Directeur
	public double payeDirecteur() {
		return this.salaireFixe + this.prime;
	}

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
