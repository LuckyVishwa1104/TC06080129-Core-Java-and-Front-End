package s3;

public class emp {
	private int empid;
	private String empname;
	public emp() {}
	public emp(int empid , String empname)
	{
		super();
		this.empid=empid;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", empname=" + empname + "]";
	}
	@Override
	public boolean equals(Object O)
	{
		emp e= new emp();
		if ((this.empid == e.empid) && (this.empname == e.empname))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1 = new emp(111,"Lucky");
		emp e2 = new emp(111,"Lucky");
		 if (e1.equals(e2))
		 {
			 System.out.println("Equal objects");
		 }
		 else
		 {
			 System.out.println("Not equlas objrct");
		 }
		 
		 System.out.println(e1.hashCode()+" "+e2.hashCode());
	}

}
