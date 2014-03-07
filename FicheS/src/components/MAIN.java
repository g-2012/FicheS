package components;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.jdom2.JDOMException;

public class MAIN {

	public static void main(String[] args) throws FileNotFoundException, JDOMException, IOException{
		
		//test de ecriture lecture de l'antenne
//		String path="D:\\G2\\Projet_Java\\xmltest.xml";
//		File fichier =new  File(path);	
//		Antenne test = new Antenne ("test" ,"test  test" ,"test" ,"test" ,"test", "test");
//		test.exportXML(fichier);
//		
//		String path2="D:\\G2\\Projet_Java\\xmltest.xml";
//		File fichier2 =new  File(path2);
//		Antenne test2=new Antenne();
//		test2.lectureXML(fichier2);
		
		
//		//Test creation d'un XML d'obs a partir des sous classe d'obs remplie 
//	String pathobs = "D:\\G2\\Projet_Java\\xmltestobs3.xml";
//	File fichierobs = new File(pathobs);
//
//		Antenne test = new Antenne("xmltest", "test  test", "test", "test",
//				"test", "test");
//		Generalites g = new Generalites();
//		DescpA d = new DescpA();
//		Hauteur a = new Hauteur();
//		Enregistrement e = new Enregistrement();
//		Controle c = new Controle();
//		Remarque r = new Remarque();
//
//		Obs testobs = new Obs(test, g, d, a, e, c, r);
//		testobs.exportXMLobs(fichierobs);
	  
		
//		//Test lecture d'un XML d'obs 
//		String pathobs="D:\\G2\\Projet_Java\\xmltestobs_pouet.xml";
//	File fichierobs =new  File(pathobs);
//	
//
//		
//		Obs testobs=new Obs();
//		testobs.lectureXML(fichierobs);
//		

		//test export PDF
		
	ConvertHTMLtoPDF putain=new ConvertHTMLtoPDF();
	putain.createPDF("buglabou");

		}
	

}
	

