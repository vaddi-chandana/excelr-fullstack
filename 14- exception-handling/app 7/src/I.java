class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			throw new ClassNotFoundException();
		}
		System.out.println("main end");
	}
}
