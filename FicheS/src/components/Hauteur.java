package components;

public class Hauteur {
	private String hf;
	//crochet
	private String lectureCrochet;
	private String D1;
	private String D2;
	//fractionne
	private	String hv1;
	private	String hv2;
	private	String hCtrl;
	private	String calcP;
	private String l;
	
	//chock
	//	private	 String L1;
	//	private	 String L2;
	//	private	 String L3;
	
	//Constructeur par défault
	public Hauteur(){
		
	}
	
	
	//Construction d'un getter pour la lecture crochet
	public String getLectureCrochet(){
		return this.lectureCrochet;
	}

	//Construction d'un setter pour la lecture crochet
	public void setLectureCrochet(String newLectureCrochet){
		this.lectureCrochet = newLectureCrochet;
	}
	//Construction d'un getter pour la premiere determination
	public String getD1(){
		return this.D1;
	}

	//Construction d'un setter pour la premiere determination
	public void setD1(String newD1){
		this.D1 = newD1;
	}
	//Construction d'un getter pour la deuxieme determination
	public String getD2(){
		return this.D2;
	}

	//Construction d'un setter pour la deuxieme determination
	public void setD2(String newD2){
		this.D2 = newD2;
	}
	//Construction d'un getter pour la petite lecture oblique
	public String getHv1(){
		return this.hv1;
	}

	//Construction d'un setter pour la petite lecture oblique
	public void setHv1(String newHv1){
		this.hv1 = newHv1;
	}
	//Construction d'un getter pour la grande lecture oblique
	public String getHv2(){
		return this.hv2;
	}

	//Construction d'un setter pour la grande lecture oblique
	public void setHv2(String newHv2){
		this.hv1 = newHv2;
	}
	//Construction d'un getter pour la hauteur de controle
	public String getHctrl(){
		return this.hCtrl;
	}

	//Construction d'un setter pour la hauteur de controle
	public void setHctrl(String newHctrl){
		this.hCtrl = newHctrl;
	}
	//Construction d'un getter pour la hauteur precise
	public String getCalcp(){
		return this.calcP;
	}

	//Construction d'un setter pour la hauteur precise
	public void setCalcp(String newCalcp){
		this.calcP = newCalcp;
	}
	//Construction d'un getter pour la lecture oblique
	public String getL(){
		return this.l;
	}

	//Construction d'un setter pour la lecture oblique
	public void setL(String newL){
		this.l = newL;
	}
	//Construction d'un getter pour la hauteur adoptée
	public String getHf(){
		return this.hf;
	}

	//Construction d'un setter pour la hauteur adoptée
	public void setHf(String newHf){
		this.hf = newHf;
	}
	
}
