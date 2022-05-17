package Static;

public class test_스태틱이해 {
	public static void main(String[] args) {
		
		Calculator.add(1, 2); // static 메소드 이므로 객체 생성없이 사용 가능하다.
//		Calculator.min(1,2);  // static 메소드가 아니므로 객체 생성후에 사용 가능(에러 뜸)
		
		Calculator cal = new Calculator();
		cal.add(1, 2); // 가능 하지만 권장하지는 않는 방법
		cal.min(1, 2); // 전에는 사용 불가능 하였지만 이제는 생성하여 사용가능
		
		
	}
}
/**
 * 메모장..
 * Static 키워드를 통해  Static 영역에 할당된 메모리는 모든 객체가 공유하는 메모리라는 장점을 지님, 
 * 하지만 Garbage Collector의 관리 영역 밖에 존재하여 프로그램의 종료시까지 메모리가 할당된 채로 존재해 
 * 자주 사용하면 퍼포먼스에 악영향을 줌.
 * Static 변수 특징
 * Static 변수는 클래스 변수이다.
 * 객체를 생성하지 않고 Static 자원에 접근이 가능하다.
 */