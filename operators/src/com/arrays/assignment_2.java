package com.arrays;
import java.util.Arrays;
public class assignment_2 
{
	// function for displaying an array
	public static void display(int[] array)
	{
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}
	
	// function for reversing the element of array
	public static int[] reverse(int[] array)
	{
		int[] result = new int[array.length];
		for(int i=0,j=result.length-1;i<array.length;i++,j--)
		{
			result[j]=array[i];
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int [] arr = {2,4,8,6,10};
		// displaying an array
		display(arr);
		
		// reversing and displaying the array
		display(reverse(arr));
		
		// sort method - sorting array and displaying it
		Arrays.sort(arr);
		display(arr);
		
		// exceptional handling
		try {
		System.out.println(arr[5]);}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound.");
		}
			
	}

}
