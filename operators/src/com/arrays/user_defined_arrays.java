package com.arrays;
import java.util.Arrays;
public class user_defined_arrays 
{
	// function for displaying element of arrays
	public static void printArray(double[] array)
	{
		for (int i=0; i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
	}
	
	// function for reversing the element of array
	public static double[] reverse(double[] array)
	{
		double[] result = new double[array.length];
		for (int i=0,j=result.length-1;i<array.length;i++,j--)
		{
			result[j]=array[i];
		}
		return result;
	}

	// main function for output
	public static void main(String[] args) 
	{
		// defining an array
		double[] arr= {2.8,4.3,9.2,8.4,7.1};
		// displaying array elements
		for (int i = 0; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		// 
		double total=0;
		for (int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		System.out.println("Addition of array element is: "+total);
		
		printArray(new double[] {2.1,3.2,4.3,5.4});
		
		printArray(arr);
		printArray(reverse(arr));
		
		
		

	}

}
