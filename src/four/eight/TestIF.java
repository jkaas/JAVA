package four.eight;
/**
 * 测试if单选择结构
 * @author 73946
 *
 */
public class TestIF {
	public static void main(String[] args) {
		double d = Math.random(); //返回【0，1）之间的随机数
		System.out.println(d);
		
		int i = (int)(6 * Math.random() + 1);
		System.out.println(i);
		if(i <= 3) {
			System.out.println("小");
			System.out.println("小小小");
		}
		
		System.out.println("##############################");
		//通过掷三个骰子看看今天的手气如何?
		double area = Math.random();
		
	}
	
	
	
}
