package ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListMainTest {

	public static void main(String[] args) {

//		자료구조라면 스트림을 생성할 수 있다.
//		스트림은 최종연산만 할 수도 있고 중간연산 + 최종연산을 할 수도 있도
//		최종 연산 : sum(), count(), forEach()

//		중간 연산 : map, filter, sorted

		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

//		자료구조 -> 스트림생성
		Stream<String> stream = sList.stream();

//		최종 연산 forEach
//		최종 연산과 중간 연산의 구현은 람다식을 활용한다.
//		코드의 양을 줄일 수 있고 가독성을 높일 수 있다.
		stream.forEach(s -> {
			System.out.print(s + " ");
		});

		System.out.println("");
		System.out.println("---------------");

//		중간 연산 + 최종 연산
		sList.stream().sorted().forEach(s -> {
			System.out.print(s + " ");
		});

		System.out.println("");
		System.out.println("---------------");

//		중간 연산(람다 활용) + 최종 연산 : map + forEach
//		자료 구조 (Tomas Edward Jack) -> map ->최종연산
		sList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + ":글자 갯수 확인\n"));

//		중간 연산 + 최종 연산 : filter + forEach
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s));

	} // end of main
} // end of class
