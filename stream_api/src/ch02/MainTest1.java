package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest1 {

	public static void main(String[] args) {
//		자료 구조 스트림 API 사용해 보기

		List<String> sList = new ArrayList<>();
		sList.add("손쥥");
		sList.add("김횰니");
		sList.add("김밎어");
		sList.add("성희쓰");

		Stream<String> stream = sList.stream();

		stream.forEach(s -> System.out.print(s + " "));
		System.out.println("");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println("");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

		sList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));
		System.out.println("");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
	}
}
