package Static;

public class StaticMethod {
	private String name1 = "Mo.J.H";
	
	private static String name2 = "MoJH";
	
	public static void printMax(int x,int y) {
		System.out.println(Math.max(x, y));
	}
	
	public static void printName() {
//		System.out.println(name1);//�Ұ����� ȣ��
		System.out.println(name2);
	}
}
/**
 * Math �Լ��� ������ �������� ��밡���� ������ Math�� �Լ����� static���� ����Ǿ�
 * ������ ����(�ʱ�ȭ)���� ��밡���մϴ�.
 * ������ static �޼ҵ忡���� static ������� �ʴ� �������� ������ �Ұ����ѵ�,
 * �޸� �Ҵ����� �����غ��� �����մϴ�. StaticMethod���� printName1�� ����
 * name1�� �����Ϸ����ϴµ� name1�� new ������ ���� ��ü�� ������ ���Ŀ� �����ϰ� �˴ϴ�.
 * ������ static�޼ҵ�� ��ü�� �������� ������ ������ �Լ��̹Ƿ�, �Ҵ���� ���� �޸� ������
 * �����ϹǷ� ������ �߻��ϰԵ˴ϴ�.
 * �׸��Ͽ� static�޼ҵ忡�� �����ϱ� ���� ������ �ݵ�� static ������ ����Ǿ���մϴ�.
 */
