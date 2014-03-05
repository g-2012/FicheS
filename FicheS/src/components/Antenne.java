package components;

import java.io.*;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;

public class Antenne
{
	//D�finition des param�tres d'antenne
	private String nomAntenne;
	private String designationIGS;
	private int nbEspacesIGS;
	private String controleHA;
	private String image;
	private String R;
	private String hauteurARP;
	

	//Constructeur par d�fault
	public Antenne(){
		nomAntenne="fichier_vide";
	}
	
	//Constructeur avec entr�e des 6 param�tres
	public Antenne(String nom, String IGS, String ctrlHA, String rayon, String hARP, String lienImg){
		nomAntenne = nom;
		designationIGS = IGS;
		//Comptage du nombre d'espaces dans la d�signation IGS
		nbEspacesIGS = 0;
		for (int i = 0; i<designationIGS.length(); i++){
			Character ch = designationIGS.charAt(i);
			if (Character.isWhitespace(ch)){
				nbEspacesIGS++;
			}
		}
		controleHA = ctrlHA;
		image = lienImg;
		R = rayon;
		hauteurARP = hARP;
	}

	//Construction d'un getter pour le nom
	public String getNom(){
		return this.nomAntenne;
	}

	//Construction d'un setter pour le nom
	public void setNomAnt(String newName){
		nomAntenne = newName;
	}

	//Construction d'un getter pour la d�signation IGS
	public String getDesIGS(){
		return this.designationIGS;
	}

	//Construction d'un setter pour la d�signation IGS
	public void setDesIGS(String newName){
		designationIGS = newName;
	}

	//Construction d'un getter pour le lien image
	public String getLienImg(){
		return this.image;
	}

	//Construction d'un setter pour le lien image
	public void setLienImg(String newName){
		image = newName;
	}

	//Construction d'un getter pour le type de mesure
	public String getMesHA(){
		return this.controleHA;
	}

	//Construction d'un setter pour le type de mesure
	public void setMesHA(String newName){
		controleHA = newName;
	}

	//Construction d'un getter pour R
	public String getR() {
		return R;
	}

	//Construction d'un setter pour R
	public void setR(String r) {
		R = r;
	}

	//Construction d'un getter pour la hauteur ARP
	public String getHauteurARP() {
		return hauteurARP;
	}

	//Construction d'un setter pour la hauteur ARP
	public void setHauteurARP(String hauteurARP) {
		this.hauteurARP = hauteurARP;
	}



	//Construction d'un getter pour le nombre d'espace IGS
	public int getnbEspacesIGS() {
		return nbEspacesIGS;
	}

	//Construction d'un setter pour le nombre d'espace IGS
	public void setnbEspacesIGS(int nbEspacesIGS) {
		this.nbEspacesIGS = nbEspacesIGS;
	}



	//Fonction d'export en xml pour la cr�ation d'un fichier d'antenne
	public void exportXML(File fichier){
		//Ouverture de l'arborescence xml
		Element racine = new Element("Racine");

		//Cr�ation d'un document bas� sur la racine Antenne
		org.jdom2.Document document = new Document(racine);

		//Cr�ation d'une balise antenne dans la racine
		Element antenne = new Element("Antenne");
		racine.addContent(antenne);

		//Cr�ation d'une balise nom
		Element ant = new Element("ant");
		ant.setText(this.nomAntenne);
		antenne.addContent(ant);

		//Cr�ation d'une balise designation IGS
		Element DIGS = new Element("DIGS");
		DIGS.setText(this.designationIGS);
		antenne.addContent(DIGS);

		//Cr�ation d'une balise nombre d'espaces IGS
		Element Nigs = new Element("Nigs");
		Nigs.setText(String.valueOf(this.nbEspacesIGS));
		antenne.addContent(Nigs);

		//Cr�ation d'une balise m�thode de mesure de hauteur d'antenne
		Element HA = new Element("HA");
		HA.setText(this.controleHA);
		antenne.addContent(HA);

		//Cr�ation d'une balise lien vers le sch�ma d'antenne
		Element img = new Element("img");
		img.setText(this.image);
		antenne.addContent(img);

		//Balise pour le rayon d'antenne
		Element R = new Element("R");
		R.setText(this.R);
		antenne.addContent(R);

		//Balise pour la hauteur d'antenne ARP
		Element DARPBA = new Element("DARPBA");
		DARPBA.setText(this.hauteurARP);
		antenne.addContent(DARPBA);

		//Ecriture dans un fichier xml  
		try
		{
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, new FileOutputStream(fichier));
		}
		catch (java.io.IOException e){}

	}

	//Fonction d'import en xml pour la cr�ation d'un fichier d'antenne (VERIFIER EXCEPTIONS !!)
	public Antenne lectureXML(File fichier) throws FileNotFoundException, JDOMException, IOException{
		//Cr�ation du lien vers le fichier d'antenne
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(new FileInputStream(fichier));

		//R�cup�ration de la racine du fichier
		Element root = doc.getRootElement();

		//Entr�e dans la balise Antenne
		Element infoAnt = (Element) root.getChild("Antenne");

		//R�cup�ration des informations dans le xml
		String nomAnt = infoAnt.getChild("ant").getText();
		String DesIGSLect = infoAnt.getChild("DIGS").getText();
		String nbSpLect = infoAnt.getChild("Nigs").getText();
		String mesHALect = infoAnt.getChild("HA").getText();
		String imgLect = infoAnt.getChild("img").getText();
		String RLect = infoAnt.getChild("R").getText();
		String DARPBALect = infoAnt.getChild("DARPBA").getText();

		System.out.println(nomAnt+"\n"+DesIGSLect+"\n"+nbSpLect+"\n"+mesHALect+"\n"+imgLect+"\n"+RLect+"\n"+DARPBALect);
		Antenne antenneXML = new Antenne(nomAnt,DesIGSLect, RLect,DARPBALect, mesHALect,imgLect);
		return antenneXML;
	}









}