package ch01;

public class AirConditioner implements Electronic220V {

	@Override
	public void connect() {
		System.out.println("에어컨 연결 220V On");
	}


//	전기를 연결하다
}
