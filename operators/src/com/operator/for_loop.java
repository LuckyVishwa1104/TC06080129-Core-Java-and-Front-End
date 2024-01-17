package com.operator;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a=1;a<=10;a++)
		{
			System.out.println(a+"**3 = "+a*a*a);

		}
		int ary[]=new int[5];
		ary[0]=2;
		ary[1]=4;
		ary[2]=6;
		ary[3]=8;
		ary[4]=10;
		
		int[] arr = {1,3,5,7,9};
		for (int i=0;i<ary.length;i++)
		{
			System.out.println("ary ["+i+"] = "+ary[i]);

		}
		int i =0;
		while (i<arr.length)
		{
			System.out.println("arr ["+i+"] = "+arr[i]);
			i++;
		}
	//	for (int i=0;i<ary.length;)
		for (int e:ary)
		{
			System.out.println(e);
		}
		String[] names = {"lucky","nikhil","bauaa","bachchi"};
		for (String a:names)
		{
			System.out.println(a);
			
		}
		// for each loop
		for (int d:arr)
		{
			System.out.println(d);
		}
	}

}
