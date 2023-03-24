package ch01;

public class Todo {

	private String content;
	private int complete; // 1 완료, 0 미완료
//	10

//	1. 기본 생성자 재정의
	private Todo() {
	}

	public static class MyBuilder {

		private String content;
		private int complete;

		public MyBuilder setContent(String content) {
			this.content = content;
			return this;
		}

		public MyBuilder setComplete(int complete) {
			this.complete = complete;
			return this;
		}

//		!!핵심!!
		public Todo build() {
			Todo todo = new Todo();
//			Todo 변수 content = Build 변수 content
			todo.content = content;
			todo.complete = complete;
			return todo;
		}
	}

	public static void main(String[] args) {
		Todo todo1 = new MyBuilder().setComplete(1).build();
//		Todo todo2 = new MyBuilder().setContent("잠자기");  <-- 오류 build() 메소드를 붙여야함
		Todo todo3 = new MyBuilder().setComplete(0).setContent("청소하기").build();
	}
}
