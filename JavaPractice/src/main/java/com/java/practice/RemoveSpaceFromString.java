package com.java.practice;

public class RemoveSpaceFromString {

	public static void main(String[] args) 
	{

		String s = "aaa bbb ccc ddd";
		
		for(int i=0; i<s.length(); i++)
		{
			s = s.replaceAll(" ", "");
		}
		
		System.out.println(s);
	}

}
