package sec03_overlappedcontrolstatement.EX01_OverlappedControlStatement;

public class OverlappedControlStatement {
	public static void main(String[] args) {
		// if-if �ߺ�
		int value1 = 5;
		int value2 = 3;
		if(value1 > 5) { // ����:value cannot be resolved to a variable 
			if(value2 < 2) { // ������ ����: value�� ���ڸ� ���� �ʾ��� ���� ��� �ذ�
				System.out.println("����1");
			}
			else {
				System.out.println("����2");
			}
		}
		else {
			System.out.println("����3");
		}
		 System.out.println();
			 
		 // switch-for �ߺ�
		 int value3 = 2;
		 switch(value3) {
		 case 1:
			 for(int k = 0; k < 10; k++) {
				 System.out.print(k + " ");
			 }
			 break;
		 case 2:
			 for(int k = 10; k > 0; k--) {
				 System.out.print(k + " ");
			 }
			 break;
				 
		 }
		 System.out.println();
		 System.out.println();
			 
		 // for-for-if �ߺ�
		 for(int i = 0; i < 3; i++) {     // 3ȸ �ݺ�
			 for(int j = 0; j < 5; j++) { // 5ȸ �ݺ�
				 System.out.println(i + " " + j);
				 if(i == j) {
					 System.out.println("i = j");
				 }
			 }
   		 }
	 }
}