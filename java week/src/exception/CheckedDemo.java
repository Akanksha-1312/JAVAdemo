package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedDemo {
public static void main(String[] args) throws FileNotFoundException {
		
	CheckedDemo obj = new CheckedDemo();
		obj.readFromFile();

	}

	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("c:\\temp\\tes.txt");
	}

}
