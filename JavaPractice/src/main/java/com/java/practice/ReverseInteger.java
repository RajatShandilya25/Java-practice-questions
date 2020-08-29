package com.java.practice;

public class ReverseInteger {

	public static void main(String[] args) 
	{
		int n = 12345;
		int reverse = 0;
		
		while(n != 0)
		{
			int num = n % 10;
			reverse = reverse*10 + num;
			n = n/10;
		}
		System.out.println(reverse);
		
		
		/********************************************/
		

		int n1= 123456;
		String s = Integer.toString(n1);
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
