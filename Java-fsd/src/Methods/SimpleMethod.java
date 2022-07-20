package Methods;

public class SimpleMethod {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		int a=2,b=4;
		SimpleMethod obj=new SimpleMethod();
		obj.add(a, b);
		
		
	}

}
