
public class c3 {
	public static void main(String[] args) {
		int c=0;
		int j=0;
		for (int i=1;i<=100;i++) {
			if (j==5) {
				break;
			}
			if (i%3==0 && i%5==0 ) {
				c=c+i;
				j=j+1;
			}
			
		}
		System.out.print(c);
	}

}
