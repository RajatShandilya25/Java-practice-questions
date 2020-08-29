package com.SortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) 
	{
		/*
		 * Find the smallest value in the array, and store it in min. variable and then compare it 
		 * with other values
		 */
		
		int a[] = {10, -1, -100, 49, 120, 30, 19};
		
		for(int i=0; i<a.length-1; i++)
		{
			int minIndex = i;
			for(int j=i; j<a.length; j++)
			{
				if(a[minIndex] > a[j])
				{
					minIndex = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
		for(int it: a)
		{
			System.out.print(it +", ");
		}
	}

}
