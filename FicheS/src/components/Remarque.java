package components;

public class Remarque {
	private String rq;
	
	//Constructeur par défault
	public Remarque(){
		
	}
	
	
	//Construction d'un getter pour les remarques
	public String getRq(){
		return this.rq;
	}

	//Construction d'un setter pour les remarques
	public void setRq(String newRq){
		this.rq = newRq;
	}
}
