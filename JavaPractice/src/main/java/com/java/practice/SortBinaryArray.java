package com.java.practice;

public class SortBinaryArray {

	public static void main(String[] args)
	{
		int a[] = {0, 0, 1, 1, 1, 0, 0, 1, 0};
		
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for(int it: a)
		{
			System.out.print(it +", ");
		}
		
		
		
		/**************************************/
		System.out.println();
		
		int a1[] = {0, 0, 1, 1, 1, 0, 0, 1, 0};
		
		int count = 0;
		for(int i=0; i<=a1.length-1; i++)
		{
			if(a1[i] == 0)
			{
				count++;
			}
		}
		
		for(int i=0; i<count; i++)
		{
			a1[i] = 0;
		}
		
		for(int i=count; i<=a1.length-1; i++)
		{
			a1[i] = 1;
		}
		
		
		for(int it: a1)
		{
			System.out.print(it +", ");
		}
	}

}
