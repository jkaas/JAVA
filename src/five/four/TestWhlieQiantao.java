package five.four;
/**
 * 测试嵌套循环
 * @author 73946
 *
 */
public class TestWhlieQiantao {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		
		System.out.println("#############################");
		for(int n = 9; n >= 1; n--) {
			for(int m = 1; m <= n; m++) {
				System.out.print(m + "^" + n + "=" + (m*n) + "\t");
			}
			System.out.println();
		}
		System.out.println("#########################");
		
		int sum01 = 0;
		int sum02 = 0;
		for(int i = 1;i <= 100;i++) {
			if(i % 2 == 0) {
				sum01 += i;
			}else {
				sum02 += i;
			}
		System.out.println("奇数和：" + sum01);
		System.out.println("偶数和：" + sum02);
		}
		int h = 0;
		for(int i = 1;i <=1000; i++) {
			if(i % 5 == 0) {
				System.out.print(i +"\t");
			}
//			if(i % 25 == 0) {
//				System.out.println();
//			}
		}
	}
}
