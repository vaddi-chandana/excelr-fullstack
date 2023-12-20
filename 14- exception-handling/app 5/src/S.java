class S
{
	static void test() throw Throwable   // first throwable and exception cannot possible
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Exception//
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
