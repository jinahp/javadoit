package sec_EX;

public class ex {
	public static void main(String[] args) {
		// 연습문제 Q1 산술 연산 코드
		System.out.println(2 + 3 / 2);
		System.out.println(10 % 3 + 5 / 3);
		System.out.println((4 + 5 / 2) % 4);
		
		// 연습문제 Q2 증감 연산
		int a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(a++ + --b);
		System.out.println(a + b);
		
		// 연습문제 Q3 비트 연산자
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
		System.out.println(~5);
		
		// 연습문제 Q4 시프트 연산자
		System.out.println(7 << 2);
		System.out.println(7 >> 2);
		System.out.println(-7 << 2);
		System.out.println(-7 >> 2);
		System.out.println(-1 >>> 30);
	
		// 연습문제 Q5 비교 연산자
		System.out.println(3 < 3);
		System.out.println(5 >= 3);
		System.out.println(5 <= 5);
		System.out.println(5 == 5);
		System.out.println(5 != 5);
		
		// 연습문제 Q6 논리 연산자
		System.out.println(false && true);
		System.out.println((4 <= 4) || (6 < 3));
		System.out.println(false ^ (3 >= 4));
		System.out.println(!(3 <= 3));
		
		// 연습문제 Q7 논리 연산자와 비트 연산자
		int d = 4, e = 5, f = 6;
		System.out.println(false && d-- > 6);
		System.out.println(true | e++ > 6);
		System.out.println(true ^ f++ > 6);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f); // 오류: Duplicate local variable a 오류난 이유: 내장 객체명과 같은 변수명을 선언함. 해결방법: 변수명을 다른 걸로 바꿈.
		
		// 연습문제 Q8 대입 연산자
		int g = 3;
		g <<= 1;
		System.out.println(g);
		g &= 5;
		System.out.println(g);
		g -= 1;
		System.out.println(g *= 2);
		
		// 연습문제 Q9 삼항 연산자
		int h = 3;
		int i = 5;
		int j = 7;
		System.out.println((h > i) ? "안녕하세요" : "반갑습니다");
		System.out.println((h < i) ? (i > j) ? "타입 A" : "타입 B" : (i > j) ? "타입 C" : "타입 D");
	}
}
