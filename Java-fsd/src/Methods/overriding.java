package Methods;

public class overriding {
		void add(int a,int b) {
			System.out.println(a+"+"+b+" is "+(a+b));
		}
		void add(float a,float b) {
			System.out.println(a+"+"+b+" is "+(a+b));
		}
		void add (int a ,int b ,int c) {
			System.out.println(a+"+"+b+"+"+c+" is "+(a+b+c));
		}
		public static void main(String[] args) {
			int a=2,b=4,c=8;
			overriding obj=new overriding();
			obj.add(a, b);
			obj.add(2.3f,4.5f );
			obj.add(a, b, c);
			
			
			
		}

	}


