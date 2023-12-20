class E
{
	static void test()
	{
		System.out.println("E.test");
	}
}
class F extends E
{
	static void test()
	{
		System.out.println("F.test");
	}

	public static void main(String[] args)
	{
		C c1 = new D();
		c1.test();
	}
}
