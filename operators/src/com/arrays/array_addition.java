package com.arrays;

public class array_addition 
{

	public static void main(String[] args) 
	{
		int[][] arr1 = {{2,4},{22,44},{13,17},{24,27},{91,92}};
		int[][] arr2 = {{2,4},{22,44},{13,17},{24,27},{91,92}};
		int sum = 0;
		for (int i=0;i<arr1.length;i++)
		{
			for (int j =0;j<arr1[i].length;j++)
			{
				int t = arr1[i][j] + arr2[i][j];
			}
		}	
		
	}
}
