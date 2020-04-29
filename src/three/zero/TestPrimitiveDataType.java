package three.zero;
/**
 * 测试基本数据类型
 * @author 73946
 *
 */
public class TestPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试整型变量
		int a = 15;
		int b = 015; //以0开头是八进制
		int c = 0x15; //以0x开头是16进制
		int d = 0b1101; //以0b开头是二进制
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte age = 30;
		short salary = 30000;
		int population = 200000000;
		long globalPopulation = 740000000000L;
	}

}
