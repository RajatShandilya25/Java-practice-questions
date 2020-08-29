package com.SearchingAlgiorithms;

public class BinarySearching {

	public static void main(String[] args) 
	{
	
		/*
		 * Array needs to be sorted in binary search
		 */
	
		int a[] = {10, 20, 30, 40, 50};
		int x = 50;
		int l = 0;
		int r = a.length-1;
//		int mid = l + r / 2;
		
		while(l <= r)
		{
			int mid = l + (r-l) / 2;
			
			if(a[mid] == x)
			{
				System.out.println(mid);
				break;
			}
			
			else if(x > a[mid])
			{
				l = mid + 1;
			}
			else if(x < a[mid])
			{
				r = mid - 1;
			}
			else
			{
				System.out.println("Value not found");
				break;
			}
		}
		
		

	}

}
