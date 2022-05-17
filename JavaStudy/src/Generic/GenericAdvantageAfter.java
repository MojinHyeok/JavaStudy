package Generic;

public class GenericAdvantageAfter {
	public static class CustomArrayList<T> {
	    private int size;
	    private Object[] data = new Object[5];

	    public void add(T value) {
	        data[size++] = value;
	    }

	    public T get(int i) {
	        return (T) data[i];
	    }
	}

	public static void main(String[] args) {
		// 외부에서 타입 주입
		CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
		customArrayList.add(10);
		Integer i = customArrayList.get(0);
//		String i1 = customArrayList.get(0); // 컴파일 에러
		
		// 외부에서 타입 주입
		CustomArrayList<String> customArrayList1 = new CustomArrayList<>();
		customArrayList1.add("10");
		String s = customArrayList1.get(0);
		
	}



	

}
