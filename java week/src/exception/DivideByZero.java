package exception;
import java.util.*;
public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		try {
			System.out.println("Enter two num:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			d=a%b;
			System.out.println(a+" / "+b+" = "+c+" , Remainder = "+d);
			
		}catch(ArithmeticException e){
			System.out.println("Division by Zero !!");
		}
		System.out.println("Else program continue.");
	}

}
