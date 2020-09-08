package com.java.practice;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) 
	{
		
		 int array[] = {1, 2, 4, 5, 6, 10, 0};
		 int n = 0;
		  Arrays.sort(array);  //0,1,2,4,5,6,10
		   
		  for(int i=0; i< array[array.length -1]; i++)
		  {
		   if(i == array[n])
		   {
		    n++ ;
		   }
		   else
		   {
		    System.out.print(i +", ");
		   }
		  }
		
		
			
			
		

	}

}
