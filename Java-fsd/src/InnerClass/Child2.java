package InnerClass;

public class Child2 {

private String msg="Inner Class 2";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	Child2  ob=new Child2 ();  
	ob.display();  
	}
}
