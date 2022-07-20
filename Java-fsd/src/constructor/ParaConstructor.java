package constructor;

public class ParaConstructor {
	int id;
	String name;
	ParaConstructor(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void print() {
		System.out.println("id="+id+ " name="+name);
	}
	public static void main(String[] args) {
		ParaConstructor obj =new ParaConstructor(1,"formn");
		obj.print();
		
		ParaConstructor obj2 =new ParaConstructor(5,"john");
		obj2.print();
	}
}
