package com.java.practice;

public class ReverseStrnig_PreserveSpacePosition {

	public static void main(String[] args) 
	{
		
		String s = "I love automation testing .";
		char c[] = s.toCharArray();
		int i=0, j=c.length-1;
		
		while(i < j)
		{
			if(c[i] != ' ' && c[j] != ' ')
			{
				char temp = c[j];
				c[j] = c[i];
				c[i] = temp;
				
				i++;
				j--;
			}
			else if(c[i] == ' ')
			{
				i++;
			}
			else if(c[j] == ' ')
			{
				j--;
			}
		}
		
		for(char it: c)
		{
			System.out.print(it);
		}
		
		
		
		
	}

}
