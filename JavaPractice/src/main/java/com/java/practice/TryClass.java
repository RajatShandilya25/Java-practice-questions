package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class TryClass
{
	public static void main(String[] args) 
	{
		
		int a[] = {10, 30, 40, 30, 10, 100, 20, 0, 0, 0};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i]) + 1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> it: map.entrySet()) 
		{
			System.out.println(it.getKey() +": " +it.getValue());
		}
		
		
		
	}
		
}	