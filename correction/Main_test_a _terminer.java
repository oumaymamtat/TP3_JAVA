package p1;

import java.io.IOException;

import java.util.Scanner;

public class Main_test {

	
	public static void main(String[] args) throws IOException {
	

		TableSal table= new TableSal();
		
                 scan = new Scanner(System.in);
		
		 boolean quit = false;
         
		 do { /***********Menu*****************/
				System.out.println("******Menu******");
				System.out.println("Veuillez choisir à partir du menu");
				System.out.println("a . Ajouter un salarié");
				System.out.println("b . Supprimer un salarié");
				System.out.println("c . Afficher les salariés");
				System.out.println("d . Total des payes à verser");
				System.out.println("e . Quitter");
			
                      
                  String val=scan.nextLine();//tableau de string


			char x=val.charAt(0);  // 1er case du tableau --1ercaractere
		switch (x) {
		case 'a':
		
			System.out.println("Tapez D pour Directeur");
			System.out.println("Tapez V pour Vendeur");
			System.out.println("Tapez E pour Employee");
			Scanner s1 = new Scanner(System.in);
		
			String choix=s1.nextLine();
			char c=choix.charAt(0);
					if (c=='D')
					{
		System.out.println("Vous avez choisi d'ajouter un directeur");
		
                System.out.println("Veuillez saisir le nom");
						
                   String nom=s1.nextLine();
						
		System.out.println("Veuillez saisir la matricule");
						
                   int matricule=s1.nextInt();
						
		System.out.println("Veuillez saisir le salaire");
				
			double salaire=s1.nextDouble();
						
			System.out.println("Veuillez saisir la prime");
						
			double prime=s1.nextDouble();
						
						
         table.ajouterSalarie(new Directeur(nom, matricule, salaire, prime));
						
                  System.out.println("Directeur inséré");
						
					}
				
					else if (c=='V')
					{

	System.out.println("Vous avez choisi d'ajouter un Vendeur");
						
	System.out.println("Veuillez saisir le nom");
						
         String nom=s1.nextLine();
............................

			..........................

			
                       .......................................

                        ....................................

...................................a terminé..........................
		
						
	
						
	System.out.println("Veuillez saisir le total de ventes");

	double ventes=s1.nextDouble();
						
  table.ajouterSalarie(new Vendeur(nom, matricule, nbre_heure, prix_heure, ventes));
						
            System.out.println("Vendeur inséré");
					
            }
					
					else if (c=='E')
					{
   
     System.out.println("Vous avez choisi d'ajouter un Vendeur");
						
						
     System.out.println("Veuillez saisir le nom");
						
     String nom=s1.nextLine();
						
.............................

			..........................

			
                       .......................................

                        ....................................

...................................a terminé..........................
		
.
											
						
  table.ajouterSalarie(new Employe(nom, matricule, nbre_heure, prix_heure));
						
   System.out.println("Employe inséré");
							
					
                  break;
		
		
		case 'b':

			Scanner scan1= new Scanner(System.in);

			System.out.print("Tapez la le rang ");

			............................

			..........................

			
                       .......................................

                        ....................................

...................................a terminé..........................
		
		case 'e':
			
			System.exit('e');
			
                        break;
		
		

                default: System.out.println("Choix invalide");
			

                         break;
		}
		 
         } while (!quit);

         System.out.println("Vous avez choisi de quitter");
	   
       }


     }
