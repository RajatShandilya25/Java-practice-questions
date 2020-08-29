package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class TryClass
{
	public static void main(String[] args) 
	{
		
		//0 1 1 2 3 5 8 13
		int n = 10;
		int a = 0, b=1;
		
		System.out.print(a +", " +b +", ");

		for(int i=2; i<n; i++)
		{
		
			int sum = a + b;
			System.out.print(sum +", ");
			a = b;
			b = sum;
			
		}
		
		
		
	}
		
}	