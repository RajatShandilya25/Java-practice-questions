package com.java.practice;

public class CopyArray {

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 5, 7};
		int b[] = new int[a.length];
		
		for(int i=0; i <= a.length-1; i++)    //Copying all elements of array "a" into array "b"
		{
			b[i] = a[i];   
		}
		
		for(int it: b)  // Printing b[]
		{
			System.out.println(it);
		}
	}

}
