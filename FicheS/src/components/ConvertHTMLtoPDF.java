package components;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
 
public class ConvertHTMLtoPDF {
 
// public static void main(String[] args) {
// 
//  String pdfFilename = "args";
//  ConvertHTMLtoPDF convertHTMLToPDF = new ConvertHTMLtoPDF();
//  if (args.length < 1)
//  {System.out.println("TG");
//   System.err.println("Usage: java "+ convertHTMLToPDF.getClass().getName()+
//   " PDF_Filename");
//   System.exit(1);
//  }
// 
//  pdfFilename = args[0].trim();
//  convertHTMLToPDF.createPDF(pdfFilename);
// 
// }
 
 public void createPDF (String pdfFilename){
 
  //path for the PDF file to be generated
//  String path = "D:\\G2\\Projet_Java\\PDF" + pdfFilename;
	 String path = "D:\\G2\\Projet_Java\\PDF\\";
  PdfWriter pdfWriter = null;
   
  //create a new document
  Document document = new Document();
   
  try {
 
   //get Instance of the PDFWriter
   pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(path+pdfFilename+".pdf"));
    
   //document header attributes
   document.addAuthor("betterThanZero");
   document.addCreationDate();
   document.addProducer();
   document.addCreator("MySampleCode.com");
   document.addTitle("Demo for iText XMLWorker");
   document.setPageSize(PageSize.LETTER);
 
   //open document
   document.open();
    
   //To convert a HTML file from the filesystem
   String File_To_Convert = "D:\\G2\\Projet_Java\\XML\\Nouveau Document Texte2.xml";
   String File_To_Convert2 = "D:\\G2\\Projet_Java\\XML\\Nouveau Document Texte.xml";
   FileInputStream fis = new FileInputStream(File_To_Convert);
   FileInputStream fis2 = new FileInputStream(File_To_Convert2);

   //URL for HTML page
//   URL myWebPage = new URL("http://demo.mysamplecode.com/");
//   InputStreamReader fis = new InputStreamReader(myWebPage.openStream());
 
   //get the XMLWorkerHelper Instance
   XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
   //convert to PDF
   worker.parseXHtml(pdfWriter, document, fis,fis2);
   System.out.println("jg");
   //close the document
   document.close();
   //close the writer
   pdfWriter.close();
   System.out.println("jg1");
 
  }  
 
  catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  } catch (DocumentException e) {
   e.printStackTrace();
  }      
 
 }
 
}