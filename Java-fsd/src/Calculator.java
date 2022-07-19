import java.util.*;
public class Calculator {
	//scanner class for input
	static Scanner sc= new Scanner(System.in);
	int n1,n2;
	// function to input 2 numbers from user
    void input() {
		System.out.println("Enter num 1:");
		this.n1= sc.nextInt();
		System.out.println("Enter num 2:");
		this.n2= sc.nextInt();
		System.out.print("Result: ");
		}
    
	public static void main(String[] args) {
		int n;
		System.out.println("welcome to calculator program");
		// object of class to access method and variable.
		Calculator c= new Calculator();
		//while loop if user enter wrong input.
		l1:while (true) {
			System.out.println("Enter your choice \n "
					+ "1. Addition \n 2. Substration \n "
					+ "3. Multiplication \n 4. Division \n "
					+ "5. Exit \n  Your Choice: ");
			//choices that user have 
		n=sc.nextInt();
		switch(n) {
		case 1:System.out.println("For Addition :");
			c.input();
			System.out.println(c.n1+c.n2);
			break l1;
		case 2:System.out.println("For  :");
			c.input();
		System.out.println(c.n1-c.n2);
			break l1;
		case 3:System.out.println("For Addition :");
			c.input();
		System.out.println(c.n1*c.n2);
			break l1;
		case 4:c.input();
		System.out.println(((float)c.n1/c.n2));
			break l1;
		case 5://System.out.println("Exited from program");
			break l1;
		default:System.out.print("Wrong choice Entered Again ");
		}
		
		}
		System.out.println("Exited from program");


}}