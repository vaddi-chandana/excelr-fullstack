class R
{
	static void test() throw Exception
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Throwable
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
