package components;

public class DescpA {

	private String serieA;
	private String serieR;
	private String nomAntenne;
	
	//Constructeur par défault
	public DescpA(){
		
	}
	
	//Construction d'un getter pour le numero de serie antenne
	public String getSerieA(){
		return this.serieA;
	}

	//Construction d'un setter pour le numero de serie antenne
	public void setSerieA(String newSerieA){
		serieA = newSerieA;
	}
	
	
	//Construction d'un getter pour le numero de serie recepteur
	public String getSerieR(){
		return this.serieR;
	}

	//Construction d'un setter pour le numero de serie recepteur
	public void setSerieR(String newSerieR){
		serieR = newSerieR;
	}
	//Construction d'un getter pour le nom d'antenne
	public String getNomAntenne(){
		return this.nomAntenne;
	}

	//Construction d'un setter pour le nom d'antenne
	public void setNomAntenne(String newNomAntenne){
		nomAntenne = newNomAntenne;
	}
	
}
