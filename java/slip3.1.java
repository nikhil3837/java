public class slip3_1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=100;i>=0;i--)
			{
				System.out.println(i);
				Thread.sleep(6000);
			}
		}
		catch(Exception e) {}
	}
	
	public static void main(String[] args) 
	{
		slip3_1 ob=new slip3_1();
		ob.start();
	}

}
