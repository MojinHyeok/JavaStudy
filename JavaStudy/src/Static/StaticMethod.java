package Static;

public class StaticMethod {
	private String name1 = "Mo.J.H";
	
	private static String name2 = "MoJH";
	
	public static void printMax(int x,int y) {
		System.out.println(Math.max(x, y));
	}
	
	public static void printName() {
//		System.out.println(name1);//불가능한 호출
		System.out.println(name2);
	}
}
/**
 * Math 함수를 별도의 생성없이 사용가능한 이유는 Math의 함수들은 static으로 선언되어
 * 별도로 선언(초기화)없이 사용가능합니다.
 * 하지만 static 메소드에서는 static 선언되지 않는 변수에는 접근이 불가능한데,
 * 메모리 할당으로 생각해보면 가능합니다. StaticMethod에서 printName1을 통해
 * name1을 접근하려고하는데 name1은 new 연산을 통해 객체가 생성된 이후에 접근하게 됩니다.
 * 하지만 static메소드는 객체의 생성없이 접근이 가능한 함수이므로, 할당되지 않은 메모리 영역에
 * 접근하므로 문제가 발생하게됩니다.
 * 그리하여 static메소드에서 접근하기 위한 변수는 반드시 static 변수로 선언되어야합니다.
 */