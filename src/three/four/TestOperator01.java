package three.four;
/**
 * 测试算术运算符
 * @author 73946
 *
 */
public class TestOperator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 1;
		int b = 2;
		long b2 = 3;
		//byte c = a + b;  //报错
		//int c2 = b2 + b;  //报错
		
		float fl = 3.14F;
		double d = b + b2;
		
		//float d2 = f1 + 6.2; //报错
		
		System.out.println(-9%5);
		
		int a1 = 3;
		int b1 = a1++;
		System.out.println("a=" + a1 + "\nb=" + b1);
		a1 = 3;
		b1 = ++a1;
		System.out.println("a=" + a1 + "\nc=" + b1);
		
		a1 = 3;
		a1 *= b +3;
		System.out.println(a1);
	}

}
