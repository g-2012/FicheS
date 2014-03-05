package components;

public class Controle {
	private String nivelle;
	private String ctrlHARP;
	//	private float decentrement;
	//!! mettre en cliquable

	//Constructeur par défault
	public Controle(){
		
	}
	
	
	
	//Construction d'un getter pour la nivelle
	public String getNivelle(){
		return this.nivelle;
	}

	//Construction d'un setter pour la nivelle
	public void setNivelle(String newNivelle){
		this.nivelle = newNivelle;
	}
	
	
	//Construction d'un getter pour la hauteur de controle
	public String getctrlHARP(){
		return this.ctrlHARP;
	}

	//Construction d'un setter pour la hauteur de controle
	public void setCtrlHARP(String newCtrlHARP){
		this.ctrlHARP = newCtrlHARP;
	}

}
