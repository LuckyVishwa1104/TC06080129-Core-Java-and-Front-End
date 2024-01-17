package s3;

public class outer {
	private int i = 10;
	public void get()
	{
		class inner
		{
			int no = 111;
			public void get()
			{
				System.out.println(no);
			}
		}
		inner i = new inner();
		i.get();
	}
	//
	public static void main (String[] args)
	{
		outer o = new outer();
		o.get();
	}
}

