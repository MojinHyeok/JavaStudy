package Generic;

//제네릭 클래스
class ClassName<E> {
	
	private E element;	// 제네릭 타입 변수
	
	void set(E element) {	// 제네릭 파라미터 메소드
		this.element = element;
	}
	
	E get() {	// 제네릭 타입 반환 메소드 
		return element;
	}
	
	<T> T genericMethod(T o) {	// 제네릭 메소드
		return o;
	}

	
}

public class GenericMethod {
	public static void main(String[] args) {
		
		ClassName<String> a = new ClassName<String>();
		ClassName<Integer> b = new ClassName<Integer>();
		
		a.set("10");
		b.set(10);
	
		System.out.println("a data : " + a.get());
		// 반환된 변수의 타입 출력 
		System.out.println("a E Type : " + a.get().getClass().getName());
		
		System.out.println();
		System.out.println("b data : " + b.get());
		// 반환된 변수의 타입 출력 
		System.out.println("b E Type : " + b.get().getClass().getName());
		System.out.println();
		
		// 제네릭 메소드 Integer
		System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());
		
		// 제네릭 메소드 String
		System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());
		
		// 제네릭 메소드 ClassName b
		System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());
		
	}

}
/**
a data : 10
a E Type : java.lang.String

b data : 10
b E Type : java.lang.Integer

<T> returnType : java.lang.Integer
<T> returnType : java.lang.String
<T> returnType : Generic.ClassName
제네릭 메소드의 선언방법은 아래와 같음
[접근 제어자] <제네릭타입> [반환타입] [메소드명]([제네릭타입] [파라미터]) 
제네릭 메소드는 제네릭 클래스 타입과 별도로 지정된다.
<> 괄호 안에 타입을 파라미터로 보내 제네릭 타입을 지정해주는 것. 이것이 바로 제네릭 프로그래밍이다.

 */

