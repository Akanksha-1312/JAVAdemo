package filehandlingApp;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
	Scanner sc=new Scanner(System.in);
	WriteFile(String file){

	 //public static void main(String[] args) {
		    try {
		      FileWriter myWriter = new FileWriter(file);
		      System.out.println("Enter Your Text:  ");
		      String text=sc.nextLine();
		      myWriter.write(text);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	}

