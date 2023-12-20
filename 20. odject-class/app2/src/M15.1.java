class D
{
	int i;
	int j;
	int K;

	D(int i, int j , int K)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public boolean equals(Object obj)
	{
		return (this.i == ((D)obj).i && this.j == ((D)obj).j && this.K == ((D)obj).K);
		       //d1.i == d2.i && d1.j == d2.j
	}
}
class M15.1
{
	public static void main(String[] args) 
	{
		D d1 = new D(90, 10 , 11);	
		D d2 = new D(90, 10 , 11);
		
		System.out.println(d1 == d2);//false
		System.out.println(d1.equals(d2));//true

		System.out.println(d1.i == d2.i && d1.j == d2.j && d1.k == d2.k );//true
	}
}
