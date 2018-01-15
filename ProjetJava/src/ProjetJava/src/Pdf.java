package ProjetJava.src;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import javafx.scene.shape.Path;
import java.io.OutputStream;

public class Pdf {
	
	PDDocument pdf;
	PDPage[] pages;
	int ndPages;
	public Pdf() {
		this.pdf= new PDDocument();
	}
	public void open(File pdf) throws InvalidPasswordException, IOException {
		this.pdf= PDDocument.load(pdf);
		this.ndPages= this.pdf.getNumberOfPages();
	}
	public void modifier() {
		
	}
	public void extraire() {
		
	}
	public void ajouterPage() {
		PDPage page =new PDPage();
		this.pdf.addPage(page);
		this.ndPages++;
	}
	public void ecrire(String str) {
		
	}
	public void save(File file) throws IOException {
		
		this.pdf.save(file);
	}
    public void show(File pdf){
            
    }
	
	
}
