class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	try
		{
			System.out.println("try begin");
			try
			{
			int i = 10 / 0;
			}
		
		    catch (ArithmeticException ex1)
		    {
			   System.out.println("from nested try-catch:" + ex1);
		    }
		    System.out.println(" try end ");
	    }
		catch (ArithmeticException ex2)
		{
			System.out.println("from outer try-catch:" + ex2);
		}
		System.out.println(" main end ");
	

	}
}
//inside the try block we can keep another catch block
