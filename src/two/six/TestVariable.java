package two.six;
/**
 * 测试变量
 * @author 73946
 *
 */
public class TestVariable {
	
	int a; //成员变量，从属于对象；成员变量会自动被初始化
	static int size; //静态变量，从属于类
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int age;
			age = 18;
		}
		int salary = 3000;
		int gao = 13;
		
		
		
		System.out.println(gao);
		int i;
		// int j = i + 5;//编译出错，变量还未被初始化
	}

}
