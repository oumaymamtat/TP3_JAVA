package gestion_personnel;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) throws ErreurRang {
		TableSalaries tab = new TableSalaries();
		Employe e = new Employe(0, null, 0, 0);
		int choix;
		System.out.println("Bienvenue dans notre application :");
		do {
			System.out.println("1: Ajouter un salarie");
			System.out.println("2: Supprimer un salarie");
			System.out.println("3: Afficher les salariés");
			System.out.println("4: Total des payes à verser");
			System.out.println("0: Quitter");
			Scanner scn = new Scanner(System.in);
			choix = scn.nextInt();
			switch (choix) {
			case 1:
				e.saisirEmploye();
				tab.addSalarie(e);
				;
				break;
			case 2:
				System.out.println("Entrer le rang de l'employe à supprimer : ");
				int rang = scn.nextInt();
				try {
					tab.supprimerSalarie(rang);
				}
				catch (ErreurRang error) {
					System.out.println(error.getMessage());
				}
				;
				break;
			case 3:
				System.out.println(tab);
				;
				break;
			case 4:
				tab.totalPaye();
				;
				break;
			case 0:
				System.exit(0);
				;
				break;
			default:
				System.out.println("Veuillez saisir un chiffre valide!!");
				;
				break;
			}

		} while (choix != 0);
	}
}
