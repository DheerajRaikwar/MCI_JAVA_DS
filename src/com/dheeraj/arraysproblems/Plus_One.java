package com.dheeraj.arraysproblems;

public class Plus_One {
	 public int[] plus_one(int[] digits) {
		
		 return digits;
	 }
	
	public static void main(String[] args) {
		Plus_One obj = new Plus_One();
	    int[] arr = {8,9,9,9};
	    arr = obj.plus_one(arr);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }

	}

}
