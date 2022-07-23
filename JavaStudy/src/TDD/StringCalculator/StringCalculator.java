package TDD.StringCalculator;

public class StringCalculator {

	/**
	 * 리팩토링 전
	 * 
	 * @param text
	 * @return
	 */
//	public static int splitAndSum(String text) {
//		int result = 0;
//		
//		if(text== null || text.isEmpty()) {
//			result = 0;
//		}else {
//			String[] values = text.split(",|:");
//			들여쓰기가 2인곳
//			for(String value: values) {
//				result += Integer.parseInt(value);
//			}
//		}
//		return result;
//	}

	// 1. 한 메서드에 오직 한 단계의 들여쓰기만 한다.
	// 2. else 를 사용하지 않는다.
	// 3. 메소드가 한 가지 일만 하도록 구현하기.
	// 4. Compose method 패턴 
	//    메소드(함수)의 의도가 잘 드러나도록 동등한 수준의 작업을 하는 여러 단계로 나눈다.
	public static int splitAndSum(String text) {
		if(isBlank(text)) {
			
			return 0;
		}
		return sum(toPositives(split(text)));
	}
	
	private static boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	private static String[] split(String text) {
		return text.split(",|:");
	}
	
	private static Positive[] toPositives(String[] values) {
		Positive[] numbers = new Positive[values.length];
		for(int i=0; i < values.length; i++) {
			numbers[i] = new Positive(values[i]);
		}
		return numbers;
	}
	
	private static int sum(Positive[] numbers) {
		Positive result = new Positive(0);
		for(Positive number : numbers) {
			result = result.add(number);
		}
		return result.getNumber();
	}
//	private static int[] toInts(String[] values) {
//		int[] numbers = new int[values.length];
//		for(int i=0; i < values.length; i ++) {
//			numbers[i] = Integer.parseInt(values[i]);
//		}
//		return numbers;
//	}
//	
//	private static int toInt(String value) {
//		int number = Integer.parseInt(value);
//		if( number < 0 ) {
//			throw new RuntimeException();
//		}
//		return number;
//	}
//
//	private static int sum(int[] numbers) {
//		int result = 0;
//		for (int number: numbers) {
//			result += number;
//		}
//		return result;
//	}

	/**
	 * 리팩토링 연습 - 메소드 분리 테스트 코드는 변경하지 말고 테스트 대상 코드(프로덕션 코드)를 개선하는 연습을 집중한다.
	 */

	/**
	 * 클래스 분리
	 * 문자열 덧셈 계산기 요구사항
	 * 쉼표(,) 또는 클론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
	 * 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
	 */
}
