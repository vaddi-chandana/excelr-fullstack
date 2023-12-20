class A 
{
	String userName;
	int userRegisterNo;

	A(String theUserName, int theUserRegisterNo)
	{
		this.userName = theUserName;
		this.userRegisterNo = theUserRegisterNo;
	}

	public static void main(String[] args) 
	{
		A a1 = new A("vijay", 101);
		System.out.println(a1);
	}
}
