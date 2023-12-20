public class F
{
	static void test(Byte i)
	{
		System.out.println("Byte");
	}
	static void test(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
// both r boxing so it goes to integer 
