class D
{
	int i;
	int j;

	D(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	public boolean equals(Object obj)
	{
		return (this.i == ((D)obj).i && this.j == ((D)obj).j);
		       //d1.i == d2.i && d1.j == d2.j
	}
}
class M15
{
	public static void main(String[] args) 
	{
		D d1 = new D(90, 10);	
		D d2 = new D(90, 10);
		System.out.println(d1 == d2);//false
		System.out.println(d1.equals(d2));//true
		System.out.println(d1.i == d2.i && d1.j == d2.j);//true
	}
}
