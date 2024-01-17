package s3;

public class date {
	
	private int empid;
	private String empname;
	private klkl dt_of_joining;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date  d = new date(2322,"Lucky",new klkl(12,23,3004));
		System.out.println(d);
	}

	public date(int empid, String empname, klkl dt_of_joining) {
		//super();
		this.empid = empid;
		this.empname = empname;
		this.dt_of_joining = dt_of_joining;
	}

	@Override
	public String toString() {
		return "date [empid=" + empid + ", empname=" + empname + ", dt_of_joining=" + dt_of_joining + "]";
	}

}
//Containment: 
// assignment - 
/*create a class mathoperataion with two datamembers x and y to store the operations NS THIRD DATA members R to store reault of operation
 * create method members
 * init - to input x and y from users
 * add - add x and y and store in R
 * multiply - to 
 * power - 
 * display - */

/*create a class to calculate multi[plicatin of two int, therree float, array element, one double nd on einteger*/

/*create a class person with name and age 
 * the default age must be 18
 * person object acan be initislalized using name and age
 * method to diaplay name and age of person*/
