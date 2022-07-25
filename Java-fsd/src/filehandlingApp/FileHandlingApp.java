package filehandlingApp;
import java.util.*;

public class FileHandlingApp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String path="P:\\javafsd\\JAVAdemo\\File Temp\\";
		String file="";
		System.out.println("  Welcome to File App ");
		System.out.println("1. Create a File");
		System.out.println("2. Write a File");
		System.out.println("3. Read a File");
		System.out.println("4. Delete a File");
		System.out.println("5. Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("enter file name to create:  ");
				file=path+sc.next();
				CreateFile obj1 =new CreateFile(file);
				break;
		case 2:System.out.println("enter file name to Write:  ");
				file=path+sc.next();
				WriteFile obj2 =new WriteFile(file);
				break;
		case 3:System.out.println("enter file name to Read:  ");
				file=path+sc.next();
				ReadFile obj3 =new ReadFile(file);
				break;
		case 4:System.out.println("enter file name to delete:  ");
				file=path+sc.next();
				DeleteFile obj4 =new DeleteFile(file);
				break;
		case 5:break;
		}
		System.out.println("****************Program Ended!!****************");
		
	}
	

}
