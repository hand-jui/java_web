package ch01;

public class Nintendo implements Electronic220V{

	@Override
	public void connect() {
		System.out.println("닌텐도가 전기 연결 On");
	
	}

}
