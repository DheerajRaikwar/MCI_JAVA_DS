package com.dheeraj.arraysproblems;

public class MergeSortedArray {

	public int[] merge_sorted_array(int[] arr1, int[] arr2) {
		if (arr1.length < 1)
			return arr2;
		else if (arr2.length < 1)
			return arr1;

		int[] resultArray = new int[arr1.length + arr2.length]; // array created
		int a = 0, b = 0;

		for (int i = 0; i < resultArray.length; i++) {
			if(arr1.length==a) {
				resultArray[i] = arr2[b];
				b++;
			}
			else if(arr2.length==b) {
				resultArray[i] = arr1[a];
				a++;
			}
			else if(arr1[a] < arr2[b]) {
				resultArray[i] = arr1[a];
				a++;
			} else  {
				resultArray[i] = arr2[b];
				b++;
			}

		}

		return resultArray;

	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 3, 4,18,29, 30,31,81 };
		int[] arr2 = { 4, 6, 30,35,46,72,80 };
		MergeSortedArray object = new MergeSortedArray();
		for(int a:object.merge_sorted_array(arr1, arr2))
		{
			System.out.println(a+" ");
		}

	}

}
