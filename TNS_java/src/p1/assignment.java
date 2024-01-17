package p1;

public class assignment 

{
	int pid;
	int price;
	int quantiyt;
	public assignment(int a,int b,int c)
	{
		this.pid=a;
		this.price=b;
		this.quantiyt=c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment a1 = new assignment(12,34,67);
		System.out.println(a1.pid);
		System.out.println(a1.price);
		System.out.println(a1.quantiyt);
	}
}
