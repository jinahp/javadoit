package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

class A {
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}


public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		
		A a = new A();
		
		a.m = 5;
		System.out.println(a.m);
		
		a.print();
	}
}