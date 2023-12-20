class B
{
	public static void main(String[] args) 
	{
		Byte obj = new Byte(10);//explicite-boxing
		int k = obj.intValue();//explicite-unboxing
		System.out.println(k);
		System.out.println("done");
	}
}