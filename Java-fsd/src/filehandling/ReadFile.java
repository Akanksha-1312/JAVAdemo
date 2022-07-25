package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		File myfile = new File("P:\\javafsd\\JAVAdemo\\test1.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(myfile);
			System.out.println("File successfully opened");
			int i;
			while ( (i = fis.read()) != -1) {
				System.out.print((char) i);
				//System.out.println("OK");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File closed");
		}
		
		
	}
	
}

