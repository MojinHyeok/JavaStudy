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

//	MyCalculator.add(1, 2); // static �޼ҵ� �̹Ƿ� ��ü ���� ���� ��� ���� 
//	MyCalculator.min(1, 2); // static �޼ҵ尡 �ƴϹǷ� ��ü �����Ŀ� ��밡�� 

//		MyCalculator cal = new MyCalculator(); 
//		cal.add(1, 2); // o ������ ������ �������� �ʴ� ��� 
//		cal.min(1, 2); // o


