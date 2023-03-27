package ch01;

public class HairDryer implements Electronic110V {

	@Override
	public void connect() {
		System.out.println("헤어 드라이기 연결 110V On");
	}

}
