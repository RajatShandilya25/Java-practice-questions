package com.java.practice;

import java.util.Arrays;

public class SortArray 
{

	public static void main(String[] args) 
	{
		/*
		 * Sort in ascending order
		 */
		
		int a[]= {10,20,30,40,50, 0, -1, 100 };
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i] +" ");
		}
		
		
		System.out.println();
		System.out.println("******************");
		
		
		/*
		 * Sort in descending order
		 */
		
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i] +" ");
		}
		
		
		
		/*
		 * Pre-defined method
		 */
		
		
		Arrays.sort(a);
	}

}
