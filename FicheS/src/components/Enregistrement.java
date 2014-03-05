package components;

public class Enregistrement {
	private String nomEtude;
	private String echantillonage;
	private String angleCoup;
	private String Hdebut;
	private String Mdebut;
	private String Sdebut;
	private String Hfin;
	private String Mfin;
	private String Sfin;
	private String Dyyyy;
	private String DMM;
	private String DDD;
	private String Fyyyy;
	private String FMM;
	private String FDD;
	private boolean TUHNB;
	private String TUHN;
	
	//calcul temps d'obs

	int iHfin;
	int iMfin;
	int iSfin;
	int iFDD;
	int iDDD;
	int iHdebut;
	int iMdebut;
	int iSdebut;

	private float iHtempsObs;
	private float iMtempsObs;
	private float iStempsObs;
	private float iJtempsObs;

	private String HtempsObs;
	private String MtempsObs;
	private String StempsObs;
	private String JtempsObs;



	private boolean gpsB;
	private boolean galB;
	private boolean gloB;
	private boolean beiB;
	private String gps;  
	private String gal; 
	private String glo; 
	private String bei; 
	
	
	//Constructeur par défault
	public Enregistrement(){
		

		try {this.iHfin = Integer.parseInt(Hfin);
		  
		  } catch (NumberFormatException e) {

		  }
		
		
		try {this.iMfin = Integer.parseInt(Mfin);
		  
		  } catch (NumberFormatException e) {

		  }
		
		
		try {this.iSfin = Integer.parseInt(Sfin);
		  
		  } catch (NumberFormatException e) {

		  }
		
		
		try {this.iFDD = Integer.parseInt(FDD);
		  
		  } catch (NumberFormatException e) {

		  }
	
		try {this.iDDD = Integer.parseInt(DDD);
		  
		  } catch (NumberFormatException e) {

		  }
		try {this.iHdebut = Integer.parseInt(Hdebut);
		  
		  } catch (NumberFormatException e) {

		  }
		try {this.iMdebut = Integer.parseInt(Mdebut);
		  
		  } catch (NumberFormatException e) {

		  }
		
		try {this.iSdebut = Integer.parseInt(Sdebut);
		  
		  } catch (NumberFormatException e) {

		  }


		this.iHtempsObs = iHfin-iHdebut;
		this.iMtempsObs= iMfin-iMdebut;
		this.iStempsObs= iSfin-iSdebut;
		this.iJtempsObs= iFDD-iDDD;
	

		this.HtempsObs =Float.toString(iHtempsObs);
		this.MtempsObs= Float.toString(iMtempsObs);
		this.StempsObs=Float.toString(iStempsObs);
		this.JtempsObs=Float.toString(iJtempsObs);
		
		this.gps= Boolean.toString(gpsB);
		this.gal= Boolean.toString(galB);
		this.glo= Boolean.toString(gloB);
		this.bei= Boolean.toString(beiB);

		this.TUHN= Boolean.toString(TUHNB);
		
	}
	
	//Construction d'un getter pour le nom d'etude
	public String getNomEtude(){
		return this.nomEtude;
	}

	//Construction d'un setter pour le nom d'etude
	public void setNomEtude(String newNomEtude){
		nomEtude = newNomEtude;
	}
	//Construction d'un getter pour l'échantillonnage
	public String getEchantillonage(){
		return this.echantillonage;
	}
	//Construction d'un setter pour l'échantillonnage
	public void setEchantillonage(String newEch){
		echantillonage = newEch;
	}
	//Construction d'un getter pour l'angle de coupure
	public String getAngleCoup(){
		return this.angleCoup;
	}
	//Construction d'un setter pour l'angle de coupure
	public void setAngleCoup(String newEch){
		angleCoup = newEch;
	}
	//Construction d'un getter pour l'heure de début
	public String getHdebut(){
		return this.Hdebut;
	}
	//Construction d'un setter pour l'heure de début
	public void setHdebut(String newHdeb){
		Hdebut = newHdeb;
	}
	//Construction d'un getter pour la minute de début
	public String getMdebut(){
		return this.Mdebut;
	}
	//Construction d'un setter pour la minute de début
	public void setMdebut(String newMdeb){
		Mdebut = newMdeb;
	}
	//Construction d'un getter pour la seconde de début
	public String getSdebut(){
		return this.Sdebut;
	}
	//Construction d'un setter pour la seconde de début
	public void setSdebut(String newSdeb){
		Sdebut = newSdeb;
	}
	
	//Construction d'un getter pour l'heure de fin
	public String getHfin(){
		return this.Hfin;
	}
	//Construction d'un setter pour l'heure de fin
	public void setHfin(String newHfin){
		Hfin = newHfin;
	}
	//Construction d'un getter pour la minute de fin
	public String getMfin(){
		return this.Mfin;
	}
	//Construction d'un setter pour la minute de fin
	public void setMfin(String newHfin){
		Mfin = newHfin;
	}
	//Construction d'un getter pour la seconde de fin
	public String getSfin(){
		return this.Sfin;
	}
	//Construction d'un setter pour la seonde de fin
	public void setSfin(String newSfin){
		Sfin = newSfin;
	}
	//Construction d'un getter pour le jour de debut
	public String getDDD(){
		return this.DDD;
	}
	//Construction d'un setter pour le jour de debut
	public void setDDD(String newDDD){
		DDD = newDDD;
	}
	//Construction d'un getter pour l'année de début 
	public String getDyyyy(){
		return this.Dyyyy;
	}
	//Construction d'un setter pour l'année de début 
	public void setDyyyy(String newDyyyy){
		Dyyyy = newDyyyy;
	}
	//Construction d'un getter pour le mois de debut
	public String getDMM(){
		return this.DMM;
	}
	//Construction d'un setter pour le mois de debut
	public void setDMM(String newDMM){
		DMM = newDMM;
	}
	//Construction d'un getter pour le jour de fin
	public String getFDD(){
		return this.FDD;
	}
	//Construction d'un setter pour le jour de fin
	public void setFDD(String newFDD){
		FDD = newFDD;
	}
	//Construction d'un getter pour le mois de fin
	public String getFMM(){
		return this.FMM;
	}
	//Construction d'un setter pour le mois de fin
	public void setFMM(String newFMM){
		FMM = newFMM;
	}
	//Construction d'un getter pour l'année de fin 
	public String getFyyyy(){
		return this.Fyyyy;
	}
	//Construction d'un setter pour l'année de fin 
	public void setFyyyy(String newFyyyy){
		Fyyyy = newFyyyy;
	}

	//Construction d'un getter pour le type d'heure bool
	public boolean getTUHNB(){
		return this.TUHNB;
	}
	//Construction d'un setter pour le type d'heure bool
	public void setTUHNB(boolean newTUHNB){
		TUHNB = newTUHNB;
	}
	//Construction d'un getter pour le type d'heure 
	public String getTUHN(){
		return this.TUHN;
	}
	//Construction d'un setter pour le type d'heure
	public void setTUHN(String newTUHN){
		TUHN = newTUHN;
	}
	
	//Construction d'un getter pour le temps d'observation (jour)
	public String getJtempsObs(){
		return this.JtempsObs;
	}
	//Construction d'un setter pour le temps d'observation (jour)
	public void setJtempsObs(String newJtempsObs){
		JtempsObs = newJtempsObs;
	}
	//Construction d'un getter pour le temps d'observation (heure)
	public String getHtempsObs(){
		return this.HtempsObs;
	}
	//Construction d'un setter pour le temps d'observation (heure)
	public void setHtempsObs(String newHtempsObs){
		HtempsObs = newHtempsObs;
	}
	//Construction d'un getter pour le temps d'observation (minute)
	public String getMtempsObs(){
		return this.MtempsObs;
	}
	//Construction d'un setter pour le temps d'observation (minute)
	public void setMtempsObs(String newMtempsObs){
		MtempsObs = newMtempsObs;
	}
	//Construction d'un getter pour le temps d'observation (seconde)
	public String getStempsObs(){
		return this.StempsObs;
	}
	//Construction d'un setter pour le temps d'observation (seconde)
	public void setStempsObs(String newStempsObs){
		StempsObs = newStempsObs;
	}

	//Construction d'un getter pour le GPS bool
	public boolean getGpsB(){
		return this.gpsB;
	}
	//Construction d'un setter pour le GPS bool
	public void setGpsB(boolean newGpsB){
		gpsB = newGpsB;
	}
	
	//Construction d'un getter pour le  GALLILEO bool
	public boolean getGalB(){
		return this.galB;
	}
	//Construction d'un setter pour le  GALLILEO bool
	public void setGalB(boolean newGalB){
		galB = newGalB;
	}
	
	//Construction d'un getter pour le  GLONASS bool
	public boolean getGloB(){
		return this.gloB;
	}
	//Construction d'un setter pour le  GLONASS bool
	public void setStempsObs(boolean newStempsObs){
		gloB = newStempsObs;
	}
	
	//Construction d'un getter pour le  BEIDOU bool
	public boolean getBeiB(){
		return this.beiB;
	}
	//Construction d'un setter pour le BEIDOU bool
	public void setBeiB(boolean newBeiB){
		beiB = newBeiB;
	}
	//Construction d'un getter pour le  GPS 
	public String getGps(){
		return this.gps;
	}
	//Construction d'un setter pour le  GPS 
	public void setGps(String newGps){
		gps = newGps;
	}
	//Construction d'un getter pour le  GALLILEO 
	public String getGal(){
		return this.gal;
	}
	//Construction d'un setter pour le  GALLILEO 
	public void setGal(String newGal){
		gal = newGal;
	}
	//Construction d'un getter pour le  GLONASS 
	public String getGlo(){
		return this.glo;
	}
	//Construction d'un setter pour le  GLONASS 
	public void setGlo(String newGlo){
		glo = newGlo;
	}
	//Construction d'un getter pour le  BEIDOU 
	public String getBei(){
		return this.bei;
	}
	//Construction d'un setter pour le  BEIDOU 
	public void setBei(String newBei){
		bei = newBei;
	}
	
}
