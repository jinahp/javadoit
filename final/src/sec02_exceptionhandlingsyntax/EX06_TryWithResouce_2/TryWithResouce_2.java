package sec02_exceptionhandlingsyntax.EX06_TryWithResouce_2;


class A implements AutoCloseable {
	String resource;
	A(String resouce) {
		this.resource = resouce;
	}
	@Override
	public void close() throws Exception {
		if(resource!=null) {
			resource=null;
			System.out.println("���ҽ��� �����ƽ��ϴ�.");
		}
	}
}
public class TryWithResouce_2 {
	public static void main(String[] args) {

		A a1 = null;
		try {
			a1 = new A("Ư�� ����");
		} catch (Exception e) {
			System.out.println("���� ó��");
		} finally {
			if(a1.resource!=null) {
				try {
					a1.close();
				} catch (Exception e) {}
			}
		}
		
		try (A a2 = new A("Ư�� ����");) {
		
		} catch (Exception e) {
			System.out.println("���� ó��");
		}
	}

}
