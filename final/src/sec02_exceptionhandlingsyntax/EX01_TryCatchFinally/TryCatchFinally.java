package sec02_exceptionhandlingsyntax.EX01_TryCatchFinally;

public class TryCatchFinally {
	public static void main(String[] args) {

		try {
			System.out.println(3 / 0);
			System.out.println("���α׷� ����");
		}
		catch (ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
			System.out.println("���α׷� ����");
		}
		try {
			System.out.println(3 / 0);
		}
		catch(ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}

}
