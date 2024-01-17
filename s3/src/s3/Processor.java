package s3;

public abstract class Processor {
	private int data = 100;
	public void Show_Data()
	{
		System.out.println(data);
	}
	
	public abstract void process();

}
