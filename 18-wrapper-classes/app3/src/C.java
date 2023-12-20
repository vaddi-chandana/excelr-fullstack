public class C
{
	//since there are no other-options widening would be considered
	static void test(long j)
	{
		System.out.println("long");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
