/*´òÓ¡ÖÊÊı*/
public class TestContine_Goto {
	public static void main(String[] args) {
		begin: for(int i=101; i<=150; i++) {
			for(int j=2; j<i; j++) {
				if(0 == (i%j)) {
					continue begin;
				}
			}
			System.out.print(i + " ");
		}
	}

}
