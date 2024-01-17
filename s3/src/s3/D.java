package s3;

public class D extends C{
	public D()
	{
		//super();
		System.out.println("Child default");
	}

	public D(int a)
	{
		//super (a);
		System.out.println("Child parameterized "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D(23);
		

	}

}
