package Static;

public class test_����ƽ���� {
	public static void main(String[] args) {
		
		Calculator.add(1, 2); // static �޼ҵ� �̹Ƿ� ��ü �������� ��� �����ϴ�.
//		Calculator.min(1,2);  // static �޼ҵ尡 �ƴϹǷ� ��ü �����Ŀ� ��� ����(���� ��)
		
		Calculator cal = new Calculator();
		cal.add(1, 2); // ���� ������ ���������� �ʴ� ���
		cal.min(1, 2); // ������ ��� �Ұ��� �Ͽ����� ������ �����Ͽ� ��밡��
		
		
	}
}
/**
 * �޸���..
 * Static Ű���带 ����  Static ������ �Ҵ�� �޸𸮴� ��� ��ü�� �����ϴ� �޸𸮶�� ������ ����, 
 * ������ Garbage Collector�� ���� ���� �ۿ� �����Ͽ� ���α׷��� ����ñ��� �޸𸮰� �Ҵ�� ä�� ������ 
 * ���� ����ϸ� �����ս��� �ǿ����� ��.
 * Static ���� Ư¡
 * Static ������ Ŭ���� �����̴�.
 * ��ü�� �������� �ʰ� Static �ڿ��� ������ �����ϴ�.
 * 
 */
