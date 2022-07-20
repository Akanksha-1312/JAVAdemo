package InnerClass;

public class Parent {
	private String msg="Parent class"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Inside Inner Class Method");}  
	 }  


	public static void main(String[] args) {

		Parent obj=new Parent();
		Parent.Inner in=obj.new Inner();  
		in.hello();  
	}
}







	
