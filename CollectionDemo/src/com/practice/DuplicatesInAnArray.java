package com.practice;

import java.util.Arrays;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		int[] array = new int[] { 5, 2, 3, 4, 4, 5, 5, 5, 5, 5, 3, 4, 2, 2, 2, 2, 2, 1, 10 };
		int temp = 0;
		Arrays.sort(array);
		temp = array[0];
		int count = 1;
		for (int i = 1; i < array.length; i++) 
		{

			if (temp == array[i]) 
			{
				count++;
			} 
			else 
			{
				if (count == 1)
				{
					count = 1;

				} else 
				{
					System.out.println(array[i - 1] + " is repeated " + count + " times");
					count = 1;
				}
				temp = array[i];
			}
		}
	}
}
