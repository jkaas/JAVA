package four.five;
/**
 * 测试类型转化常见问题
 * @author 73946
 *
 */
public class TestTypeConvertError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1000000000;
		int years = 20;
		int total = money * years;
		System.out.println("total" + total);
		//返回的total是负数，超过了int的范围
		long total1 = money * years;
		System.out.println("total1" + total1);
		//返回的total仍然是负数。默认是int，因此结果会转化成int值，再转成long，但是已经发生了数据丢失
		long total2 = money*((long)years);
		System.out.println("total2=" + total2);
		
		long total3 = 34L*3223*years*223423;
		//命名问题
		int l = 1;//分不清是L还是1；
		long a = 2345l;//建议使用大写L
		System.out.println(l + 1);
	}

}
