package sec_EX;

public class ex {
	public static void main(String[] args) {
		// �������� Q1 ��� ���� �ڵ�
		System.out.println(2 + 3 / 2);
		System.out.println(10 % 3 + 5 / 3);
		System.out.println((4 + 5 / 2) % 4);
		
		// �������� Q2 ���� ����
		int a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(a++ + --b);
		System.out.println(a + b);
		
		// �������� Q3 ��Ʈ ������
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
		System.out.println(~5);
		
		// �������� Q4 ����Ʈ ������
		System.out.println(7 << 2);
		System.out.println(7 >> 2);
		System.out.println(-7 << 2);
		System.out.println(-7 >> 2);
		System.out.println(-1 >>> 30);
	
		// �������� Q5 �� ������
		System.out.println(3 < 3);
		System.out.println(5 >= 3);
		System.out.println(5 <= 5);
		System.out.println(5 == 5);
		System.out.println(5 != 5);
		
		// �������� Q6 �� ������
		System.out.println(false && true);
		System.out.println((4 <= 4) || (6 < 3));
		System.out.println(false ^ (3 >= 4));
		System.out.println(!(3 <= 3));
		
		// �������� Q7 �� �����ڿ� ��Ʈ ������
		int d = 4, e = 5, f = 6;
		System.out.println(false && d-- > 6);
		System.out.println(true | e++ > 6);
		System.out.println(true ^ f++ > 6);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f); // ����: Duplicate local variable a ������ ����: ���� ��ü��� ���� �������� ������. �ذ���: �������� �ٸ� �ɷ� �ٲ�.
		
		// �������� Q8 ���� ������
		int g = 3;
		g <<= 1;
		System.out.println(g);
		g &= 5;
		System.out.println(g);
		g -= 1;
		System.out.println(g *= 2);
		
		// �������� Q9 ���� ������
		int h = 3;
		int i = 5;
		int j = 7;
		System.out.println((h > i) ? "�ȳ��ϼ���" : "�ݰ����ϴ�");
		System.out.println((h < i) ? (i > j) ? "Ÿ�� A" : "Ÿ�� B" : (i > j) ? "Ÿ�� C" : "Ÿ�� D");
	}
}
