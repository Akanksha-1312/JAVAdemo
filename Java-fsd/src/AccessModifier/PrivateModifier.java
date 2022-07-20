package AccessModifier;
class PrivateAccessifier{
	private void print() {
		 System.out.println("Inside Private Method");
		 
	 }
}
public class PrivateModifier {
	public static void main(String[] args) {
		System.out.println("Private Access Modifier");
		PrivateAccessifier obj = new PrivateAccessifier();
		//obj.print();
		
		
	}

}
