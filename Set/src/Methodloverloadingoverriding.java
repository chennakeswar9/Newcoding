//overloading and overriding and inheritance
class Method {

	
	private String name;
	void method() {
		System.out.println("chennakeswar");
	}
	void method(String name) {
		this.name=name;
		System.out.println(name);
	}
	
}
public class Methodloverloadingoverriding extends Method{
	public static void main(String []args) {
		Method obj = new Methodloverloadingoverriding();
	obj.method();
	obj.method("chenna");
	}
}
