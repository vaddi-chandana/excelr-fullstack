import java.util.Arrays;
public class U
{
	U(String...args)
	{
		for(int i = 0; i <= args.length; i++)
		{
			String[] array = new String[args.length];
			if(i < args.length)
			{
				System.out.println("Current i value: i: " + i + "array[i]: " + array[i]);
				System.out.println("Current i value: i: " + i + "args[i]: " + args[i]);
				array[i] = args[i];
			}
			System.out.println(Arrays.toString(array));
			System.out.println("-------------------------");
		}
	}
	public static void main(String [] args)
	{
		U u1 = new U();
		U u2 = new U("abc");
		U u3 = new U("msg1", "xyz", "hello");
		U u4 = new U("msg1", "xyz", "hello","abc");
	}
}
