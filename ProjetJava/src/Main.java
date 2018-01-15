import java.io.File;

import javax.swing.JFrame;

import org.apache.pdfbox.pdfviewer.PDFPagePanel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;


public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("test.pdf"); 
		PDDocument document = PDDocument.load(file); 
		PDPage page=document.getPage(1);
		System.out.println("PDF loaded"); 
		PDFPagePanel panel= new PDFPagePanel();
		panel.setPage(page);
		//Adding a blank page to the document 
		//document.addPage(new PDPage());  

		//Saving the document 
		document.save("test.pdf");
		JFrame frame= new JFrame();
	    frame.add(panel);
	     
	     //panel.add(page.getContents());
	     frame.setVisible(true);
	     frame.setSize(400, 400);
	     
	      //Closing the document  
	      document.close(); System.out.println("PDF closed"); 
	}

}
