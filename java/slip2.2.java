/*Program to define a thread for printing text on output screen for �n� number of times. 
Create 3 threads and run them. Pass the text �n� parameters to the thread constructor. 
Example: i. First thread prints �COVID19� 10 times. ii. Second thread prints 
�LOCKDOWN2020� 20 times iii. Third thread prints �VACCINATED2021� 30 times*/

public class slip2_2 extends Thread
{
	String msg;
	int n;
	slip2_2(String msg,int n)
	{
		this.msg=msg;
		this.n=n;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(msg);
				Thread.sleep(200);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
	}

	public static void main(String[] args)
	{
		slip2_2 t1=new slip2_2("COVID19",10);
		t1.start();
		slip2_2 t2=new slip2_2("LOCKDOWN2020",20);
		t2.start();
		slip2_2 t3=new slip2_2("VACCINATION2021",30);
		t3.start();
	}

}
