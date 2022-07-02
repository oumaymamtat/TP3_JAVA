package p1;


public class TableSalaries {
	
	private Salarie[] salarie;
	private int nbreSalarie;
    private final static int max_salarie = 200;
    
    /************************constructeur************************/
    public TableSalaries() {
    	salarie = new Salarie[max_salarie];
    	nbreSalarie = 0;
    }
    /******************ajouter salarie***************************/
    public void ajouterSalarie(Salarie salarie){
		 nbreSalarie++;
	        if (nbreSalarie <= max_salarie) {
	        	this.salarie[nbreSalarie - 1] = salarie;
	        	
	        } else {
	            System.out.println("Pas plus de " + max_salarie + " salariés");
	        }
	}
	
	/********************afficher tous les salaries******************/
	public void afficheInfo(){
		for(int i=0; i<this.nbreSalarie;i++)
		{
			this.salarie[i].afficherSalarie();
		}
		
	}
	
	
	
	
	/***********************calcul Total des paye***************/
	public double CalculTotalPay()
	{
		double sommePay=0;
		for(int i=0; i<nbreSalarie;i++)
		{
			sommePay=salarie[i].calculerSalaire()+sommePay;
		}
		return sommePay;
	}
	/***********************************************************/
	
	/*************************Delete function*****************/
	public Salarie[] supprimerEmp(int rang)
	{	
		
		
		int i=0; int t=0
		while(i>=0 && i<this.nbreSalarie)
		{
			if(rang==i){  t=1

              for(i=rang ; i< this.nbreSalarie - 1 ; i++)

				this.salarie[i]=this.salarie[i+1];
			
	i++;
		}
if (t==1)
this.nbreSalarie= this.nbreSalarie - 1 ;

		
		return this.salarie;
		
	}
	
	/*************************************************************/
	
	
}
