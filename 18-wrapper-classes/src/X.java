class X 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		byte b = 10;
		String s1 = Integer.toString(b);
		System.out.println(s1);
		System.out.println("------");
		short s = 100;
		String s2 = Integer.toString(s);
		System.out.println(s2);
		System.out.println("------");
		int i = 1000;
		String s3 = Integer.toString(i);
		System.out.println(s3);
		System.out.println("------");
		long l = 10000;
		String s4 = Integer.toString(l);
		System.out.println(s4);
		System.out.println("------");
		float f = 10.0;
		String s5 = Integer.toString(f);
		System.out.println(s5);
		System.out.println("------");
		double d = 10;
		String s6 = Integer.toString(d);
		System.out.println(s6);
		System.out.println("------");
		char c = 'a';
		String s7 = Integer.toString(c);
		System.out.println(s7);
		System.out.println("------");
		boolean booleanValue = false;
		String s8 = Integer.toString(booleanValue);
		System.out.println(s8);
		System.out.println("------");
		System.out.println("done");
	}
}
