package Methods;

public class callByValue {
		void add(int a,int b) {
			a++;
			b++;
			System.out.println("Inside Method a="+a +" b="+b);
		}
		public static void main(String[] args) {
			int a=2,b=4;
			System.out.println("Before Calling Method a="+a +" b="+b);
			callByValue obj=new callByValue();
			obj.add(a, b);
			System.out.println("After Calling Method a="+a +" b="+b);
			
			
		}

}
