import java.util.Scanner;
class E1
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to get AE or Enter alphabets to get NFE");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("+++++++++");
			int k = i / 0;
			System.out.println("try end");
		}
		catch (NumberFormatException ex1)
		{
			System.out.println("from catch: " + ex1);
		}
		catch (ArithmeticException ex2)
		{
			System.out.println("from catch: " + ex2);
		}
		System.out.println("main end");
	}
}// out put if num
// exception if letters 