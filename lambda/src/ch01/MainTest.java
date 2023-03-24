package ch01;

public class MainTest {
	/*
	 * 
	 * 람다식(Lambda expression)
	 * 
	 * 함수형 프로그래밍 방식 자바 8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라고 한다.
	 * 
	 * 함수형 프로그래밍이란 (FP : Functional Programming)
	 * 함수를 기반으로 하는 프로그래밍 입력 방식이고 매개 변수로 전달받는 입력 외에 
	 * 외부 자료(데이터)를 사용하지 않아 여러 자료가 동시에 수행되는 병렬처리 가능한 코딩 방식
	 * 
	 * 순수 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
	 * 
	 * 익명 함수 -> 컴파일러가 타입 추론이 가능하기 때문에 코드를 줄여서 사용할 수 있는 개념으로 발전 
	 * () -> {System.out.println("반가워 람다");};
	 * (x) -> {System.out.println(x+"<<<");}; 
	 * x -> {}; // 매개 변수가 하나면 괄호 생략가능 
	 * x -> System.out.println(); // 한 줄에 있으면 뒤에도 괄호 생략가능
	 * 
	 * !!람다식을 사용하기 위해서 반드시 선행되어야 할 부분은 인터페이스가 먼저 만들어져 있어야 한다.
	 */

	public static void main(String[] args) {
//		int add(int x, int y);
		
//		1. 인터페이스가 있고
//		2. 어떻게 구현될 지 식을 재정의 한다.(람다 표현식으로)
		IAdd iAdd = (x, y) -> {return x + y;};
		System.out.println(iAdd.cal(10,10));
		
//		람다식을 정의하는 모습
		IPrint iPrint  = (a, b) -> {System.out.println(a + " : " + b);};
		
//		람다식 활용하는 모습
		iPrint.myPrint("홍길동", "ddd");
		
		IPrint2 print2 = () -> {return "반가워 람다";};
		
		String temp = print2.print();
		System.out.println(temp);
		
//		람다식을 만들기 위해서 선행 및 실행 조건 순서
//		1. 인터페이스가 있엉야함
//		2. 인터페이스 안에는 반드식 하나의 충상 메서드만 존재해ㅐ야한다.
//		3. 1,2 조건을 만족한다면 필요한 식을 정의할 수 있다
//		4. 3에서 람다식을 정의하였다면 식을 정의할 때 사용한 인터페이스 타입을
//		이용하고 그 안에ㅓ 추상 메서드 이름을 사용하고 호출해서 사용할 수 있다
		
//		new Thread(() -> {}).start();
	}

}

//람다 표현식 만들기 인터 페이스 먼저 정의 되어야 한다
//!!함수형 인터페이스라고 한다 (단, 인터페이스 안에 추상메서드는 반드시 한개여야한다.)
interface IPrint {
	void myPrint(String str, String token);
}
interface IPrint2 {
	String print();
}
