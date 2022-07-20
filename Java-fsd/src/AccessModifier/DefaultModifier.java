package AccessModifier;
class DefaultAccessifier{
	void print() {
		 System.out.println("Inside Default Method");
		 
	 }
}

public class DefaultModifier {
	public static void main(String[] args) {
		System.out.println("Default Access Modifier.");
		DefaultAccessifier obj= new DefaultAccessifier();
		obj.print();
	}
	 

}
