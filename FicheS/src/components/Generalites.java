package components;

public class Generalites {
	

	private String mission;
	private String operateur;
	private String repere;
	private String point;
	private String latDeg;
	private String latMin;
	private String latSec;
	private String lonDeg;
	private String lonMin;
	private String lonSec;


	//Constructeur par défault
	public Generalites(){
		
	}

//Construction d'un getter pour la mission
public String  getMission(){
	return this.mission;
}

//Construction d'un setter pour la mission
public void setMission(String newMission){
	mission = newMission;
	
}
//Construction d'un getter pour l'opérateur
public String getOperateur(){
	return this.operateur;
}

//Construction d'un setter pour l'opérateur
public void setOperateur(String newOperateur){
	mission = newOperateur;
}
//Construction d'un getter pour le repere
public String getRepere(){
	return this.repere;
}

//Construction d'un setter pour le repere
public void setRepere(String newRepere){
	mission = newRepere;
}
//Construction d'un getter pour le point
public String getPoint(){
	return this.point;
}

//Construction d'un setter pour le point
public void setPoint(String newPoint){
	mission = newPoint;
}
//Construction d'un getter pour latDeg
public String getLatDeg(){
	return this.latDeg;
}

//Construction d'un setter pour latDeg
public void setLatDeg(String newLatDeg){
	mission = newLatDeg;
}
//Construction d'un getter pour latMin
public String getLatMin(){
	return this.latMin;
}

//Construction d'un setter pour latMin
public void setLatMin(String newLatMin){
	mission = newLatMin;
}
//Construction d'un getter pour latSec
public String getLatSec(){
	return this.latSec;
}

//Construction d'un setter pour latSec
public void setLatSec(String newLatSec){
	mission = newLatSec;
}

//Construction d'un getter pour lonDeg
public String getLonDeg(){
	return this.lonDeg;
}

//Construction d'un setter pour lonDeg
public void setLonDeg(String newlonDeg){
	mission = newlonDeg;
}
//Construction d'un getter pour lonMin
public String getLonMin(){
	return this.lonMin;
}

//Construction d'un setter pour lonMin
public void setLonMin(String newlonMin){
	mission = newlonMin;
}
//Construction d'un getter pour lonSec
public String getLonSec(){
	return this.lonSec;
}

//Construction d'un setter pour lonSec
public void setLonSec(String newlonSec){
	mission = newlonSec;
}


}