package gestion_personnel;

import java.util.ArrayList;

public class TableSalaries {
	private ArrayList<Employe> tabSalaries;

	// constructor
	public TableSalaries() {
		this.tabSalaries = new ArrayList<Employe>();
	}

	// ajouter un salari� donn� dans le tableau
	public void addSalarie(Employe e) {
		this.tabSalaries.add(e);
		System.out.println("Employee ajout� avec succ�s");
	}

	// supprimer un salari� de rang donn� du tableau
	public void supprimerSalarie(int rang) throws ErreurRang {
		// appel de la classe d'exception ErreurRang
		if (rang > this.tabSalaries.size() || rang < 0)
			throw new ErreurRang("rang errone");
		this.tabSalaries.remove(rang);
		System.out.println("Employee supprime avec succ�s");
	}

	// afficher les informations concernant tous les salari�s
	public String toString() {
		String ch = "Liste de tous les salaries : \n";
		for (Employe e : this.tabSalaries) {
			ch += e.toString();
		}
		return ch;
	}

	// calculer le total des payes � verser
	public double totalPaye() {
		double total = 0;
		for(Employe e:this.tabSalaries) {
			total += e.payeEmploye();
		}
		return total;
	}


}
