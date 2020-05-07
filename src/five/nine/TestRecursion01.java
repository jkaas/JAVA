package five.nine;
/**
 * 测试递归
 * @author 73946
 *
 */
public class TestRecursion01 {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果:%s%n",10, factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时 : %s%n", d2 - d1);
		
		
	}
	
	static long factorial(int n) {
		if (n == 1) {//递归头
			return 1;
		} else {//递归体
			return n * factorial(n - 1);// n! = n * (n - 1)!
		}
		//1*2*3*4*5....*10
	}
	
	static int count = 0;
	static void a() {
		System.out.println("a");
		count++;
		if(count < 10) {
			a();
		}else {
			return;
		}
	}
	
	static void b() {
		System.out.println("b");
	}
}
