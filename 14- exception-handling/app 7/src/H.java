class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			throw new StackOverFlowError();
		}
		System.out.println("main end");
	}
}
