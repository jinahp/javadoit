package sec05_thismethod.EX01_ThisMethod_1;

class A {
	A() {
		System.out.println("ù ��° ������");
	}
	A(int a) {
		this();
		System.out.println("�� ��° ������");
	}
}
public class ThisMethod_1 {
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println();
		A a2 = new A(3); 
	}
}
