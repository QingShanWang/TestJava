import java.util.Scanner;

/*
 * 测试键盘输入
 */
public class TestScanner {
	public static void test01() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print("输入内容是：" + str);
	}
	
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = s.nextInt();
		System.out.println("请输入另一个整数：");
		int b = s.nextInt();
		System.out.println("和是：" + (a + b));
	}
	public static void main(String[] args) {
		test02();
	}
}