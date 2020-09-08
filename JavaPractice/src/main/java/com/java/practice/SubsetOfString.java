package com.java.practice;

public class SubsetOfString {

	public static void main(String[] args) 
	{
		
		String s = "abc";
		int length = s.length();
		
		int NumberOfSubset = length*(length + 1)/2;
		String SubsetArray[] = new String[NumberOfSubset];
		int temp =0;
		
		
		for(int i=0; i<length ; i++)
		{
			for(int j=i+1; j<=length; j++)
			{
				SubsetArray[temp] = s.substring(i, j);
				temp++;
			}
		}
		
		for(String it: SubsetArray)
		{
			System.out.println(it);
		}
		
		
		
	}

}
