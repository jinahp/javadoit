package sec02_staticmodifier.EX03_StaticMethod;

class A {
	void abc() {
		System.out.println("instance �޼���");
	}
	static void bcd() {
		System.out.println("static �޼���");
	}
}

public class StaticMethod {
	public static void main(String[] args) {

		A a1 = new A();
		a1.abc();
		
		A.bcd();
		
		A a2 = new A();
		a2.bcd();
	}

}
