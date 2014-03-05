package components;

import java.io.*;

//import javax.lang.model.element.Element;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;

public class Obs {

	// IHM liste deroulante modifiable antenne/mission/operateur/repere
	// manque la sauvegarde de la modification
	// String[] listeA = {"test","test2"};
	// antenne = new JComboBox(listeA);
	// antenne.setEditable(true);
	//
	// String[] listeM = {""};
	// mission = new JComboBox(listeM);
	// mission.setEditable(true);
	//
	// String[] listeOP = {""};
	// operateur = new JComboBox(listeOP);
	// operateur.setEditable(true);
	//
	// String[] listeR = {"Clou d'arpentage", "Test", "Repère de nivellement"};
	// typerepere = new JComboBox(listeR);
	// typerepere.setEditable(true);

	private Antenne antenne;
	private Generalites G;
	private DescpA D;
	private Hauteur A;
	private Enregistrement E;
	private Controle C;
	private Remarque R;

	// debullage: liste deroulante
	// 3 choix fixe
	// String[] listeNiv = {"RAS", "Léger débullage", "Débullage important"};
	// bulle = new JComboBox(listeNiv);
	// bulle.setEditable(false);

	// private float decentrement;
	// !! mettre en cliquable

	// IHM bouton constellation
	// private JCheckBox GPS = new JCheckBox("GPS");
	// private JCheckBox GAL = new JCheckBox("Gallileo");
	// private JCheckBox GLO = new JCheckBox("GLONASS");
	// private JCheckBox BEI = new JCheckBox("Beidou");

	// Constructeur par défault
	public Obs() {

		antenne = new Antenne();
		G = new Generalites();
		D = new DescpA();
		A = new Hauteur();
		E = new Enregistrement();
		C = new Controle();
		R = new Remarque();

	}

	// Constructeur d'initialisation de test
	public Obs(Antenne antenne, Generalites G, DescpA D, Hauteur A,
			Enregistrement E, Controle C, Remarque R) {

		this.antenne = antenne;
		this.G = G;
		this.D = D;
		this.A = A;
		this.E = E;
		this.C = C;
		this.R = R;

	}

	// Export XML
	public void exportXMLobs(File fichier) {

		// Ouverture de l'arborescence xml
		Element racine = new Element("Racine");

		// Création d'un document basé sur la racine Obs
		org.jdom2.Document document = new Document(racine);

		// Création d'une balise obsversation dans la racine
		Element observation = new Element("Observation");
		racine.addContent(observation);

		// Création d'une balise antenne
		Element ant = new Element("ant");
		ant.setText(antenne.getNom());
		observation.addContent(ant);

		// Création d'une balise designation IGS
		Element Digs = new Element("Digs");
		Digs.setText(antenne.getDesIGS());
		observation.addContent(Digs);

		// Création d'une balise serial antenne
		Element serialant = new Element("serialant");
		serialant.setText(D.getSerieA());
		observation.addContent(serialant);

		// Création d'une balise serial recepteur
		Element serialrecept = new Element("serialrecept");
		serialrecept.setText(D.getSerieR());
		observation.addContent(serialrecept);

		// Création d'une balise nombre d'espaces IGS
		Element Nigs = new Element("Nigs");
		Nigs.setText(String.valueOf(antenne.getnbEspacesIGS()));
		observation.addContent(Nigs);

		// Création d'une balise méthode de mesure de hauteur d'antenne
		Element HA = new Element("HA");
		HA.setText(antenne.getMesHA());
		observation.addContent(HA);

		// Creation des balises mesures suivant la methode de mesure
		if (antenne.getMesHA() == "crochet") {

			Element LC = new Element("LC");
			LC.setText(A.getLectureCrochet());
			observation.addContent(LC);

			Element L = new Element("L");
			LC.setText(A.getL());
			observation.addContent(L);

			Element R = new Element("R");
			R.setText(antenne.getR());
			observation.addContent(R);

			Element Hf = new Element("Hf");
			Hf.setText(A.getHf());
			observation.addContent(Hf);

			Element DARPBA = new Element("DARPBA");
			DARPBA.setText(antenne.getHauteurARP());
			observation.addContent(DARPBA);

			Element D1D = new Element("D1D");
			D1D.setText(A.getD1());
			observation.addContent(D1D);

			Element D2D = new Element("D2D");
			D2D.setText(A.getD2());
			observation.addContent(D2D);

		}
		if (antenne.getMesHA() == ("fract")) {

			Element HV1 = new Element("HV1");
			HV1.setText(A.getHv1());
			observation.addContent(HV1);

			Element HV2 = new Element("HV2");
			HV2.setText(A.getHv2());
			observation.addContent(HV2);

			Element H1 = new Element("H1");
			H1.setText(antenne.getHauteurARP());
			observation.addContent(H1);

			Element Hctrl = new Element("Hctrl");
			Hctrl.setText(A.getHctrl());
			observation.addContent(Hctrl);

			Element Hprec = new Element("Hprec");
			Hprec.setText(A.getCalcp());
			observation.addContent(Hprec);

			Element L = new Element("L");
			L.setText(A.getL());
			observation.addContent(L);

			Element R = new Element("R");
			R.setText(antenne.getR());
			observation.addContent(R);

		}
		if (antenne.getMesHA() == ("chok")) {

		}

		// Création d'une balise line vers le schéma d'antenne
		Element img = new Element("img");
		img.setText(antenne.getLienImg());
		observation.addContent(img);

		// Création d'une balise mission
		Element mission = new Element("mission");
		mission.setText(G.getMission());
		observation.addContent(mission);

		// Création d'une balise operateur
		Element op = new Element("op");
		op.setText(G.getOperateur());
		observation.addContent(op);

		// Création d'une balise repere
		Element rep = new Element("rep");
		rep.setText(G.getRepere());
		observation.addContent(rep);

		// Création d'une balise point
		Element pt = new Element("pt");
		pt.setText(G.getPoint());
		observation.addContent(pt);

		// Création d'une balise Latitude (deg)
		Element latdeg = new Element("latdeg");
		latdeg.setText(G.getLatDeg());
		observation.addContent(latdeg);

		// Création d'une balise Latitude (min)
		Element latmin = new Element("latmin");
		latmin.setText(G.getLatMin());
		observation.addContent(latmin);

		// Création d'une balise Latitude (sec)
		Element latsec = new Element("latsec");
		latsec.setText(G.getLatSec());
		observation.addContent(latsec);

		// Création d'une balise Longitude (deg)
		Element londeg = new Element("londeg");
		londeg.setText(G.getLonDeg());
		observation.addContent(londeg);

		// Création d'une balise Longitude (min)
		Element lonmin = new Element("lonmin");
		lonmin.setText(G.getLonMin());
		observation.addContent(lonmin);

		// Création d'une balise Longitude (sec)
		Element lonsec = new Element("lonsec");
		lonsec.setText(G.getLonSec());
		observation.addContent(lonsec);

		// Création d'une balise controle de la hauteur (fin de de session)
		Element Hctrl = new Element("Hctrl");
		Hctrl.setText(C.getctrlHARP());
		observation.addContent(Hctrl);

		// Création d'une balise controle nivelle
		Element niv = new Element("niv");
		niv.setText(C.getNivelle());
		observation.addContent(niv);

		// Création d'une balise nom de l'étude
		Element job = new Element("job");
		job.setText(E.getNomEtude());
		observation.addContent(job);

		// Création d'une balise echantillonage
		Element ech = new Element("ech");
		ech.setText(E.getEchantillonage());
		observation.addContent(ech);

		// Création d'une balise echantillonage
		Element rq = new Element("rq");
		rq.setText(R.getRq());
		observation.addContent(rq);

		// Création d'une balise angle de coupure
		Element coup = new Element("coup");
		coup.setText(E.getAngleCoup());
		observation.addContent(coup);

		// Création des balises heure/minute/seconde de début
		Element beginHourH = new Element("beginHourH");
		beginHourH.setText(E.getHdebut());
		observation.addContent(beginHourH);

		Element beginHourM = new Element("beginHourM");
		beginHourM.setText(E.getMdebut());
		observation.addContent(beginHourM);

		Element beginHourS = new Element("beginHourS");
		beginHourS.setText(E.getSdebut());
		observation.addContent(beginHourS);

		// Création des balises heure/minute/seconde de fin
		Element endHourH = new Element("endHourH");
		endHourH.setText(E.getHfin());
		observation.addContent(endHourH);

		Element endHourM = new Element("endHourM");
		endHourM.setText(E.getMfin());
		observation.addContent(endHourM);

		Element endHourS = new Element("endHourS");
		endHourS.setText(E.getSfin());
		observation.addContent(endHourS);

		// Création d'une balise type heure
		// if (bhl==true){
		// Element HL = new Element("HL");
		// HL.setText(this.hl);
		// observation.addContent(HL);
		// }
		// else if (btu==true){
		// Element TU = new Element("TU");
		// TU.setText(this.tu);
		// observation.addContent(TU);
		// }
		// type Heure
		Element tuhn = new Element("TUHN");
		tuhn.setText(E.getTUHN());
		observation.addContent(tuhn);

		// Création des balises date de début
		Element beginDateJ = new Element("beginDateJ");
		beginDateJ.setText(E.getDDD());
		observation.addContent(beginDateJ);

		Element beginDateM = new Element("beginDateM");
		beginDateM.setText(E.getDMM());
		observation.addContent(beginDateM);

		Element beginDateA = new Element("beginDateA");
		beginDateA.setText(E.getDyyyy());
		observation.addContent(beginDateA);

		// Création des balises date de fin
		Element endDateJ = new Element("endDateJ");
		endDateJ.setText(E.getFDD());
		observation.addContent(endDateJ);

		Element endDateM = new Element("endDateM");
		endDateM.setText(E.getFMM());
		observation.addContent(endDateM);

		Element endDateA = new Element("endDateA");
		endDateA.setText(E.getFyyyy());
		observation.addContent(endDateA);

		// Création des balises temps de calcul
		Element TobsH = new Element("TobsH");
		TobsH.setText(E.getHtempsObs());
		observation.addContent(TobsH);

		Element TobsM = new Element("TobsM");
		TobsM.setText(E.getMtempsObs());
		observation.addContent(TobsM);

		Element TobsS = new Element("TobsS");
		TobsS.setText(E.getStempsObs());
		observation.addContent(TobsS);

		Element TobsJ = new Element("TobsJ");
		TobsJ.setText(E.getJtempsObs());
		observation.addContent(TobsJ);

		// //Création des balises de constellation
		// if (E.getGpsB()==true){
		// Element GPS = new Element("GPS");
		// GPS.setText(E.getGps());
		// observation.addContent(GPS);
		//
		// }
		// if (E.getGalB()==true){
		// Element GAL = new Element("GAL");
		// GAL.setText(E.getGal());
		// observation.addContent(GAL);
		//
		// }
		//
		// if (E.getGloB()==true){
		// Element GLO = new Element("GLO");
		// GLO.setText(E.getGlo());
		// observation.addContent(GLO);
		//
		// }
		// if (E.getBeiB()==true){
		// Element BEI = new Element("BEI");
		// BEI.setText(E.getBei());
		// observation.addContent(BEI);
		//
		// }

		// Création des balises de constellation
	
			Element GPS = new Element("GPS");
			GPS.setText(E.getGps());
			observation.addContent(GPS);

			Element GAL = new Element("GAL");
			GAL.setText(E.getGal());
			observation.addContent(GAL);

			Element GLO = new Element("GLO");
			GLO.setText(E.getGlo());
			observation.addContent(GLO);
		
			Element BEI = new Element("BEI");
			BEI.setText(E.getBei());
			observation.addContent(BEI);

		// Ecriture dans un fichier xml
		try {
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, new FileOutputStream(fichier));
		} catch (java.io.IOException e) {
		}

	}

	// Fonction d'import en xml pour la création d'un fichier d'obs (VERIFIER
	// EXCEPTIONS ??)

	public Obs lectureXML(File fichier) throws FileNotFoundException,
			JDOMException, IOException {

		// Création du lien vers le fichier d'obs
		SAXBuilder builder = new SAXBuilder();
		
		
		try {
			 Document docobs = builder.build(new FileInputStream(fichier));
				// Récupération de la racine du fichier
				Element root = docobs.getRootElement();

				// Entrée dans la balise obs
				Element infoObs = (Element) root.getChild("Observation");

				// Création d'un lien vers le fichier d'antenne lus dans le fichier
				// d'obs

				// CODE D ORGINE
				// Document docant = builder.build(new FileInputStream(fichierant));
				// FileInputStream(infoObs.getChild("ant").getText()));

				// POUR LES TEST
				String nomfichierant1 = infoObs.getChild("ant").getText();
				String nomfichierant2 = ".xml";
				String nomfichierant = nomfichierant1 + nomfichierant2;
			File fichierant = new File("D:\\G2\\Projet_Java\\", nomfichierant);
			try {
				Document docant = builder.build(new FileInputStream(fichierant));

				// IL FAUT GERER LES REPERTOIRES

				// Création de la racine
				Element rootant = docant.getRootElement();
				// Etrée dans la balise
				Element infoAnt = (Element) rootant.getChild("Antenne");

				// Récupération des informations dans le xml
				
				//partie antenne
				String TempNomAnt = (infoAnt.getChild("ant").getText());
				String TempDesIGS = (infoAnt.getChild("DIGS").getText());
				String TempMesHA = (infoAnt.getChild("HA").getText());
				String TempLienImg = (infoAnt.getChild("img").getText());
				String TempR = (infoAnt.getChild("R").getText());
				String TempHauteurARP = (infoAnt.getChild("DARPBA").getText());
				
				this.antenne = new Antenne(TempNomAnt, TempDesIGS, TempMesHA, TempLienImg,
						TempR, TempHauteurARP);
				
				this.C.setCtrlHARP(infoObs.getChild("HA").getText());
				
				if (C.getctrlHARP() == "crochet") {
					this.A.setLectureCrochet(infoObs.getChild("LC").getText());
					this.A.setL(infoObs.getChild("L").getText());
					this.A.setHf(infoObs.getChild("Hf").getText());
					this.A.setD1(infoObs.getChild("1D").getText());
					this.A.setD2(infoObs.getChild("2D").getText());

				}

				else if (C.getctrlHARP() == "fract") {
					this.A.setHv1(infoObs.getChild("HV1").getText());
					this.A.setHv2(infoObs.getChild("HV2").getText());
					this.A.setHctrl(infoObs.getChild("Hctrl").getText());
					this.A.setCalcp(infoObs.getChild("Hprec").getText());
					this.A.setL(infoObs.getChild("L").getText());
					this.A.setHf(infoObs.getChild("HF").getText());

				} else if (C.getctrlHARP() == "chok") {

				}
			}
			catch (FileNotFoundException e)
			  {
				  System.out.println("Fichier antenne non trouvé, on retourne rien");
				  
					
					return null;
			  }

				D.setNomAntenne(infoObs.getChild("ant").getText());
				G.setMission(infoObs.getChild("mission").getText());
				G.setOperateur(infoObs.getChild("op").getText());
				G.setRepere(infoObs.getChild("rep").getText());
				G.setPoint(infoObs.getChild("pt").getText());
				G.setLatDeg(infoObs.getChild("latdeg").getText());
				G.setLatMin(infoObs.getChild("latmin").getText());
				G.setLatSec(infoObs.getChild("latsec").getText());
				G.setLonDeg(infoObs.getChild("londeg").getText());
				G.setLonMin(infoObs.getChild("lonmin").getText());
				G.setLonSec(infoObs.getChild("lonsec").getText());
				C.setNivelle(infoObs.getChild("niv").getText());
				C.setCtrlHARP(infoObs.getChild("HA").getText());
				E.setNomEtude(infoObs.getChild("job").getText());
				D.setSerieA(infoObs.getChild("serialant").getText());
				D.setSerieR(infoObs.getChild("serialrecept").getText());
				E.setEchantillonage(infoObs.getChild("ech").getText());
				E.setAngleCoup(infoObs.getChild("coup").getText());
				E.setHdebut(infoObs.getChild("beginHourH").getText());
				E.setMdebut(infoObs.getChild("beginHourM").getText());
				E.setSdebut(infoObs.getChild("beginHourS").getText());
				E.setHfin(infoObs.getChild("endHourH").getText());
				E.setMfin(infoObs.getChild("endHourM").getText());
				E.setSfin(infoObs.getChild("endHourS").getText());
				E.setDyyyy(infoObs.getChild("beginDateA").getText());
				E.setDMM(infoObs.getChild("beginDateM").getText());
				E.setDDD(infoObs.getChild("beginDateJ").getText());
				E.setFyyyy(infoObs.getChild("endDateA").getText());
				E.setFMM(infoObs.getChild("endDateM").getText());
				E.setFDD(infoObs.getChild("endDateJ").getText());
				E.setTUHN(infoObs.getChild("TUHN").getText());

				E.setGps(infoObs.getChild("GPS").getText());
				E.setGal(infoObs.getChild("GAL").getText());
				E.setGlo(infoObs.getChild("GLO").getText());
				E.setBei(infoObs.getChild("BEI").getText());

				R.setRq(infoObs.getChild("rq").getText());
				E.setHtempsObs(infoObs.getChild("TobsH").getText());
				E.setMtempsObs(infoObs.getChild("TobsM").getText());
				E.setStempsObs(infoObs.getChild("TobsS").getText());
				E.setJtempsObs(infoObs.getChild("TobsJ").getText());

				System.out.println("blabla"+E.getBei());
				System.out.println(antenne.getNom());

				Obs ObsXML = new Obs(antenne, G, D, A, E, C, R);
				return ObsXML;
		  
		  } catch (FileNotFoundException e)
		  {
			  System.out.println("Fichier non trouvé, on retourne rien");
			  
				
				return null;
		  }

	
	
	}

}
