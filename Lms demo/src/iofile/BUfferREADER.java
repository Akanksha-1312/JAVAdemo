package iofile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BUfferREADER {
	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("P:\\\\javafsd\\\\JAVAdemo\\\\File Temp\\test.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		while((line= br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(line);
			count=count+st.countTokens();
		}System.out.println(count);
	}

}
