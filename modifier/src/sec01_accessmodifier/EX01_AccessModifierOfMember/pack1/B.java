package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	public void print() {
		
		A a = new A();
		
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
		System.out.println();
	}
}
