import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a num: ");
		int n =sc.nextInt();
		int ans=1;
		for (int i = 1; i <= n; i++) {
			ans*=i;
			
		}
		System.out.println("factorial: "+ans);
	}

}
