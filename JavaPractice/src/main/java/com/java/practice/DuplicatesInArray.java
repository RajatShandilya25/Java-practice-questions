package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) 
	{

		int a[] = {2, 3, 3, 2, 5, 6, 10,10, 19};
		
		//Using for loop
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i] +", ");
				}
			}
		}
		
		System.out.println();
		
		
		//USing HashSet
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer it: a)
		{
			if(set.add(it) == false)
			{
				System.out.print(it +", ");
			}
		}
	}

}
