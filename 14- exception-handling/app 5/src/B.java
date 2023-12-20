class B 
{
	void test()
	{
		Class.forName("");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
