/*²âÊÔ·½·¨*/
public class TestMethod {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void test01() {
		int oddsum = 0;
		int evensum = 0;
		for(int i=0; i<=100; i++) {
			if(i%2 == 0) {
				oddsum += i;
			}else {
				evensum += i;
			}
		}
		System.out.print(oddsum + evensum);
	}
	public static void main(String[] args) {
		int sum = add(3, 5);
		System.out.print(sum);
	}
}
