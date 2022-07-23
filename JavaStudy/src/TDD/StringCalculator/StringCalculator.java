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
		return sum(toInts(split(text)));
	}
	
	private static boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	private static String[] split(String text) {
		return text.split(",|:");
	}
	
	private static int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for(int i=0; i < values.length; i ++) {
			numbers[i] = Integer.parseInt(values[i]);
		}
		return numbers;
	}

	private static int sum(int[] numbers) {
		int result = 0;
		for (int number: numbers) {
			result += number;
		}
		return result;
	}

	/**
	 * 리팩토링 연습 - 메소드 분리 테스트 코드는 변경하지 말고 테스트 대상 코드(프로덕션 코드)를 개선하는 연습을 집중한다.
	 */
}
