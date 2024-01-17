package s3;

public class BB extends AA {
	
	BB get()
	{
		return this;
	}
	
	void msg()
	{
		System.out.println("Hello world");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB obj1 = new BB();
		obj1.msg();
		AA obj2 = new AA();
		//obj2.msg();
	}
/* String toString() - return a sting representation of object.
 * void finalize() - called by garbage collector on an object whent garbage collector determines that there are no more reference pf object
 * boolean equals(Object obj) - indicate whether some other object is equal to this object
 * Object clone() - creates and return a copy of this object
 * int hashcode() - return a hash code value of this object
 * Class<?> getClass() - return the run time class of this object
 * void wait() - causes the current thread to wait until another thread notify() methodAll() method for this object
 * void notify() - wakes up a single thread that is waiting on this object monitor
 * void notifyAll() - wakes up all thread that  are waiting on this object monitor
 * */
}
