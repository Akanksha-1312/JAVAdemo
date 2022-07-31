package email;

import java.util.*;
public class EmailVerification {
	public  int  check(ArrayList<String> ar,String email)
	{
		if(ar.contains(email))
			return 1;
		return 0;	
	}
	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("akanksha123@gmail.com");
		ar.add("abc@gmail.com");
		ar.add("xyz@gmail.com");
		ar.add("abn@gmail.com");
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("enter email for search"+"\n");
		email=sc.nextLine();
		EmailVerification ev=new EmailVerification();
		int res=ev.check(ar,email);
		
		if(res==1)
			System.out.println("email is found ");
		else 
			System.out.println("email not found");
		
	}
	

}
