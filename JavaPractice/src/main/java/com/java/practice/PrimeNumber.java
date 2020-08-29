package com.java.practice;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n = 10;
		boolean isPrime = true;
		
		
		if(n == 0 || n == 1)
		{
			isPrime = false;
		}
		for(int i=2; i*i <=n; i++)
		{
			if(n % i == 0)
			{
				isPrime = false;
				break;
			}
			else
			{
				isPrime = true;
			}
		}
		if(isPrime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		

	}


}
