package ch01;

/* 
 * 어댑터 패턴 설정
 * 
 * */
public class TencoAdapter implements Electronic220V {

	Electronic110V electronic110v;

	public TencoAdapter(Electronic110V electronic110v) {
		this.electronic110v = electronic110v;
	
	}

	@Override
	public void connect() {
		electronic110v.connect();
	}

}
