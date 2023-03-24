package ch01;

import ch01.Todo.MyBuilder;

public class MainTest {

	public static void main(String[] args) {
		
		Todo todo3 = new MyBuilder().setComplete(0).setContent("청소하기").build();
	}
}
