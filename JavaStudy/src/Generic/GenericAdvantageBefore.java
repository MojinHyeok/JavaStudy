package Generic;

public class GenericAdvantageBefore {
	
	public static class CustomArrayList {
	    private int size;
	    private Object[] data = new Object[5];

	    public void add(Object value) {
	        data[size++] = value;
	    }

	    public Object get(int i) {
	        return data[i];
	    }
	}



	public static void main(String[] args) {	
		CustomArrayList customArrayList = new CustomArrayList();
		
		customArrayList.add(10);
		customArrayList.add(100);
		
		Integer i = (Integer) customArrayList.get(0); 
		//이렇게 형변환이 필요함
		

	}

}
