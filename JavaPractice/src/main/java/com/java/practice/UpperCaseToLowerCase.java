package com.java.practice;

public class UpperCaseToLowerCase {

	public static void main(String[] args) 
	{
		
		String a = "I Have The Power";
		StringBuffer NewString = new StringBuffer(a);
		
		for(int i=0; i<a.length(); i++)
		{
			if(Character.isUpperCase(a.charAt(i)))
			{
				NewString.setCharAt(i, Character.toLowerCase(a.charAt(i)));
			}
			else if(Character.isLowerCase(a.charAt(i)))
			{
				NewString.setCharAt(i, Character.toUpperCase(a.charAt(i)));
			}
		}
		
		System.out.println(NewString);
		
	}

}
