class C 
{
	static void test()
	{
		System.out.println("C.test");
	}
}
class D extends C
{
	static void test()
	{
		System.out.println("D.test");
	}

	public static void main(String[] args)
	{
		D d1 = new D();
		d1.test();
	}
}
