class G
{
	static void test1() 
	{
		test2();
	}
	static void test2() 
	{
		test3();
	}
	static void test3() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
