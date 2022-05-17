package Static;

public class Calculator {
	public static String appName = "Calculator";
		
		public static int add(int x, int y) {
			return x+y;
		}
		public int min(int x, int y) {
			return x- y;
		}
}

//	MyCalculator.add(1, 2); // static 메소드 이므로 객체 생성 없이 사용 가능 
//	MyCalculator.min(1, 2); // static 메소드가 아니므로 객체 생성후에 사용가능 

//		MyCalculator cal = new MyCalculator(); 
//		cal.add(1, 2); // o 가능은 하지만 권장하지 않는 방법 
//		cal.min(1, 2); // o
