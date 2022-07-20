package InnerClass;

public class Child3 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Inner Class 3");
	         }
	      };
	      i.display();
	   }


}