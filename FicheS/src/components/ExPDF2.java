//package components;
//import java.io.FileOutputStream;
//
//import org.apache.xerces.parsers.XMLParser;
//
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.PageSize;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.tool.xml.XMLWorkerHelper;
//
//
//
//
//
//public class ExPDF2 {
//
//
///*
// * $Id: Chap0704.java,v 1.5 2003/06/25 07:36:33 blowagie Exp $
// * $Name:  $
// *
// * This code is free software. It may only be copied or modified
// * if you include the following copyright notice:
// *
// * --> Copyright 2001 by Bruno Lowagie <--
// *
// * This code is part of the 'iText Tutorial'.
// * You can find the complete tutorial at the following address:
// * http://www.lowagie.com/iText/tutorial/
// *
// * This code is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// *
// * itext-questions@lists.sourceforge.net
// */
//
//
//
//    
//    public static void main(String[] args) {
//        
//        System.out.println("Chapter 7 example 4: making life easy");
//        
//        // step 1: creation of a document-object
//        Document documentA = new Document(PageSize.A4, 80, 50, 30, 65);
//        
//        // step 1: creation of a document-object
//        Document documentB = new Document(PageSize.A4, 80, 50, 30, 65);
//        
//        try {
//            
//            // step 2:
//            // we create a writer that listens to the document
//            // and directs a XML-stream to a file
//            PdfWriter.getInstance(documentA, new FileOutputStream("Chap0704a.pdf"));
//            PdfWriter.getInstance(documentB, new FileOutputStream("Chap0704b.pdf"));
//            //get the XMLWorkerHelper Instance
//            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
//            //convert to PDF
//            worker.parseXHtml(pdfWriter, document, fis);
//            // step 3: we parse the document
//            parseXHtml(documentA, "Chap0701.xml");
//            parseXHtml(documentB, "Chap0703.xml", "tagmap0703.xml");
//            XMLWorkerHelper.getInstance().parseXHtml
//        	
//      
//            
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//            System.err.println(e.getMessage());
//        }
//    }
//}
//
//
//
//
//
