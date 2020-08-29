package com.SortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) 
	{
		
		/*
		 * Sort the adjacent elements if they are in wrong order. 
		 * Both inner and outer Loops will go till max (n-1). but it can be optimized if inner loop goes
		 * till (n-1-i) because last elements are already sorted so we don't need to go there in every iteration.
		 */
		
		int a[] = {10, 30, 60, 20, 44, -1, -100, 0};
		int n = a.length;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int it: a)
		{
			System.out.print(it +" ");
		}
		

	}

}
