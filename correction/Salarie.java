package p1;                     

  



    public abstract class Salarie {
	private String nom;
	private int matricule;
	
	public Salarie(String nom, int matricule)
	{
		this.nom=nom;
		this.matricule=matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	public  void afficherSalarie(){
		System.out.println("le nom est "+ this.nom);
		System.out.println("Sa matricule est "+ this.matricule);
		
	};
	public abstract double calculerSalaire();
	
	
}
