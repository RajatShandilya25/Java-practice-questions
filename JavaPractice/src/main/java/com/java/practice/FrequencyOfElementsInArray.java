package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInArray {

	public static void main(String[] args) 
	{

		int a[] = {10, 30, 40, 30, 10, 100, 20, 0, 0, 0};
		int n = a.length;
		
		
		 Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i]) +1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> it: map.entrySet())
		{
			System.out.println(it.getKey() +", " +it.getValue());
		}
		
		
		/***********************/
		
		
		System.out.println();
		
		System.out.println("Map size is: " +map.size());
		
		if(map.isEmpty() == true)
		{
			System.out.println("Map is empty");
		}
		else
		{
			System.out.println("Map is not empty, map size is: " +map.size() );
		}
		
		
	}

}
