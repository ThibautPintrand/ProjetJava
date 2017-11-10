import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public class Pdf {
	PDDocument pdf;
	public Pdf() {
		this.pdf= new PDDocument();
	}
	public void open(File pdf) throws InvalidPasswordException, IOException {
		this.pdf= PDDocument.load(pdf);
	}
	public void modifier() {
		
	}
	public void extraire() {
		
	}
	public void save(File file) throws IOException {
		this.pdf.save(file);
	}
	
	
}
