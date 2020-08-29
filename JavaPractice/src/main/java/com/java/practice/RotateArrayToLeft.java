package com.java.practice;

public class RotateArrayToLeft {

	public static void main(String[] args) 
	{
			int a[] = {10, 20, 30, 40, 50};
			int k = 2;
			
			reverse(a, 0, a.length-1);
			reverse(a, 0, k-1);
			reverse(a, k, a.length-1);

		}
		
		
		
	/*
	 * 
	 */
		
		public static void reverse(int a[], int i, int j)
		{
			while(i < j)
			{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
				j--;
			}
			for(int it: a)
			{
				System.out.print(it +" ");
			}
			System.out.println();

		
	
	}

}
