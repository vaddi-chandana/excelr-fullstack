class J1
{
	static
	{
		i=10;
		}


	static final int i; // if we remove final then we get output even with 2 i s

	static
	{
		i=100;        //error due to 2 times i 
		
	}



	public static void main (String [] args)
	{
		System.out.println(i);
	}
}
