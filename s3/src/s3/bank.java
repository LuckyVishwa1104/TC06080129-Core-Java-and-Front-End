package s3;

public abstract class  bank {
	// abstract methods do not have body their implementation is left for the class inheriting it
	// it can contain abstract as well as non abstract methods
	// for a class to be contain abstract method it must be compulsarily a abstract class
	// one cannot create a object of abstract class
	// one can create a reference and therefore these classes support polymorphism
	// Abstract class do  not have implementation
	// A class inheritance from an abstract class must provide implementation to all the abstract methods, else the class should be declared as abstract
	// static modifier cannot be used with abstract methods
	// abstract modifier cannot be used for constructors
	public abstract float getROI();
	
	public void get()
	{
		System.out.println("Get ROI");
	}
}
