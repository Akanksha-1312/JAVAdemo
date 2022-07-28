package iofile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("P:\\javafsd\\JAVAdemo\\File Temp\\test.txt");
		FileWriter fw= new FileWriter("P:\\javafsd\\JAVAdemo\\File Temp\\try.txt");
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
