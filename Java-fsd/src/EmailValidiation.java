import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidiation {
	public static void main(String[] args) {
		//creating a object of scanner class for input
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a email id :");
		//Taking input
		String emailid=sc.nextLine();
		//define a pattern like (someone@example.com)
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z]+.[a-z]{2,3}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailid);
		//printing results
		if(matcher.matches()) {
			System.out.println(emailid+" is a Valid email id.");
		}
		else {
			System.out.println(emailid + " is a Invalid email id!!");
		}
		
		
		
	}

}
