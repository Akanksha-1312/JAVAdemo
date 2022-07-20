
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		CompileTimePolymorphism obj=new CompileTimePolymorphism();
		obj.add(5.23f, 0.89f);
		obj.add(3, 4);
		obj.add(6, 62, 4);
		
		
	}
		void add(int a,int b) {
			int result=a+b;
			System.out.println(result);
		
	}
		void add(float a,float b) {
			float result=a+b;
			System.out.println(result);
		
	}
		void add(int a,int b,int c) {
			int result=a+b+c;
			System.out.println(result);
		
	}

}
