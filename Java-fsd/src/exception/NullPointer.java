package exception;

public class NullPointer {
public static void main(String[] args) {
		
		String s = null;
		try {
		System.out.println("String Length: " + s.length());
		}catch(NullPointerException e) {
			System.out.println("String is Empty!!");
		}
		
	}
}
