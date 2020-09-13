package com.java.practice;

public class DivideStringInEqualParts {

	public static void main(String[] args) 
	{
		String s = "aaabbbcccddd";
		
		int length = s.length();
		int NumberOfSubstring = 3;
		int SubstringLength = length/NumberOfSubstring;
		
		String SubstringArray[] = new String[NumberOfSubstring];
		int temp = 0;
		
		
		if(length % NumberOfSubstring != 0)
		{
			System.out.println(s +" cannot be divided into equal parts");
		}
		else
		{
			for(int i=0; i<length; i = i + SubstringLength)
			{
				String SubString = s.substring(i, i + SubstringLength);
				SubstringArray[temp] = SubString;
				temp++;
			}
			
			for(int i=0; i<SubstringArray.length; i++)
			{
				System.out.print(SubstringArray[i] +", ");
			}

		}
		
				
	}

}
