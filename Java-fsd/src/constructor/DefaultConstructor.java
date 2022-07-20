package constructor;

public class DefaultConstructor {
	int id;
	String name;
	void print() {
		System.out.println("id="+id+ " name="+name);
	}
	public static void main(String[] args) {
		DefaultConstructor obj =new DefaultConstructor();
		obj.print();
		
		
	}

}
