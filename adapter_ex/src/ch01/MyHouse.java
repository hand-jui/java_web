package ch01;

public class MyHouse {

	public static void main(String[] args) {

		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDryer dryer = new HairDryer();
		Nintendo nintendo = new Nintendo();
//		다형성
		
		
	//	철물점에서 어댑터 준비
		TencoAdapter adapterHairDryer = new TencoAdapter(dryer);
		connect(adapterHairDryer);
		connect(nintendo);
		

	} // end of main

//	MyHouse static : 전기 콘센트
	public static void connect(Electronic220V electronic220v) {
		electronic220v.connect();

	}

} // end of class
