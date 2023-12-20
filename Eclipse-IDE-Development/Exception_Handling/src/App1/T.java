package App1;

class T {
	 public static void main (String[] args)
{
	 System.out.println("main begin");
	 try
	 {
		 System.out.println(" try begin"); 
		 int i = 10/0;
		 System.out.println("try end");
	 }
	 catch (NullPointerException ex)
	 {
		 System.out.println("from catch");
	 }
	 System.out.println("main end");

}
}// out put up to trybegin then arithmetic exception
