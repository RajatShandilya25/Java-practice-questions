
package com.java.practice;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s = "racecar";
		int i=0, j= s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
				
				if(i == j) 
				{
					System.out.println(s +" is an palindrome");
					break;
				}
				
			}
			else
			{
				System.out.println(s +" is not an palindrome");
				break;
			}
		}
		
		
		/*******************************/
		
		for(int k = s.length()-1; k >=0; k--)
		{
			System.out.print(s.charAt(k));
		}

	}
}
