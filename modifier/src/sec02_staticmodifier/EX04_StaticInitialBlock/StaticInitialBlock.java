package sec02_staticmodifier.EX04_StaticInitialBlock;

class A {
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("Ŭ���� A�� �ε��ƽ��ϴ�!!");
	}
	A() {
		a = 3;
	}
}
public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b);
	}
}
