package five.eight;
/**
 * 测试方法重载
 * @author 73946
 *
 */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(3, 5));
		System.out.println(add(3.5, 10));
		System.out.println(add(3, 0.5));
		
		TestOverload tm = new TestOverload();
		tm.printSxt();
		int c = tm.add(30, 40, 50) + 1000;
		System.out.println(c);
	}
	
//	public static int add(int n2, int n1) {
//		int sum = n1 + n1;
//		return sum;
//	}
	
	void printSxt() {
		System.out.println("北京");
		System.out.println("上海");
		System.out.println("广州");
	}
	
	public static int add(int n1,int n2) {
		int sum = n1 + n2;
		return sum;
	}
	
	public static int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}
	
	public static double add(double n1, int n2) {
		double sum = n1 + n2;
		return sum;
	}
	public static double add(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
}
