import java.util.Scanner;

/*
 * ���Լ�������
 */
public class TestScanner {
	public static void test01() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print("���������ǣ�" + str);
	}
	
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = s.nextInt();
		System.out.println("��������һ��������");
		int b = s.nextInt();
		System.out.println("���ǣ�" + (a + b));
	}
	public static void main(String[] args) {
		test02();
	}
}