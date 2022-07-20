
public class TypeCasting {
	public static void main(String[] args) {
		char ch='g';
		System.out.println("Implicit type casting");
		byte a= (byte)ch;
		System.out.println("Byte: " + a);
		int b=ch;
		System.out.println("Int: "+ b);
		float c=ch;
		System.out.println("Float: "+ c);
		long d=ch;
		System.out.println("Long: " +d);
		double e=ch;
		System.out.println("Double: "+e);
		System.out.println("Explict type casting");
		double n=124.89;
		long f =(long) n;
		System.out.println("long : "+ f);
		float g=(float)n;
		System.out.println("float : "+ g);
		int h=(int)n;
		System.out.println("int : "+ h);
		byte i=(byte)n;
		System.out.println("byte : " + i);
		
		
		
	}

}
