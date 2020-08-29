package com.java.practice;

public class Reverse_String {

	public static void main(String[] args) 
	{
		
		String s = "Java Program";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		System.out.println("***********");
		
		String s1= "Java Program";
		int n = s1.length()-1;
		while(n >= 0)
		{
			System.out.print(s1.charAt(n));
			n--;
		}
		
		System.out.println("***********");

		
		String s3 = "Java Program";
		StringBuffer sb = new StringBuffer(s3);
		sb.reverse();
		System.out.println(sb);
		
	}

}
