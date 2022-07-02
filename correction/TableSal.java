package p1;

import java.util.ArrayList;

public class TableSal {
	
		private ArrayList<Salarie> salarie;

	    /************************constructeur************************/
	    public TableSal() {
	    	salarie = new ArrayList<Salarie>();
	    	
	    }
	    /******************ajouter salarie***************************/
	    public void ajouterSalarie(Salarie sal){
			 
		        	this.salarie.add(sal);

		       
		}
		
		/********************afficher tous les salaries******************/
		public void afficheInfo(){
			for(int i=0; i<salarie.size();i++)
			{
				this.salarie.get(i).afficherSalarie();
			}
			
		}
		
		/***********************calcul Total des paye***************/
		public double CalculTotalPay()
		{
			double sommePay=0;
			for(int i=0; i<salarie.size();i++)
			{
				sommePay=salarie.get(i).calculerSalaire()+sommePay;
			}
			return sommePay;
		}
		/***********************************************************/
		
		/*************************Delete function*****************/
		public void supprimerEmp(int rang)
		{				
			this.salarie.remove(rang);
		}
		
		/*************************************************************/
		
		
	}



