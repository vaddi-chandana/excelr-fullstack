import java.sql.DriverManager;
import java.sql.SQLException;
class U
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("main begin");
			DriverManager.getConnection("");
			Thread.sleep(1000);
			Class.forName("");
			System.out.println("main end");
		}
		catch (SQLException ex)
		{
		}
		catch (InterruptedException ex)
		{
		}
		catch (ClassNotFoundException ex)
		{
		}

		System.out.println("main end");
	}
}
