package com.java.practice;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{

		int n = 153;
		int c = 0;
		
		int temp = n;
		
		while(n > 0)
		{
			int a = n % 10;
			c = c + (a*a*a);
			n = n/ 10;
		}
		if(temp == c)
		{
			System.out.println(temp +" is an armstrong number");
		}
		else
		{
			System.out.println(temp +" is not an armstrong number");

		}
	}

}
