package three.one;

import java.math.BigDecimal;

/**
 * 测试浮点型
 * @author 73946
 *
 */
public class TestPrimitiveDataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 3.14F;
		double b = 6.28;
		double c = 628E-2;
		
		System.out.println(c);
		
		float d1 = 423432423f;
		float d2 = d1 + 1;
		
		if(d1 == d2) {
			System.out.println("d1 == d2");
		}else {
			System.out.println("d1 != d2");
		}
		
		System.out.println("#########################");
		//使用精确浮点运行，推荐：BigDecimal
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		
		System.out.println(bd);
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		
		BigDecimal bd2 = BigDecimal.valueOf(1.0);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3));
	}

}
