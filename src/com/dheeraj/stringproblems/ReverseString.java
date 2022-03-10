package com.dheeraj.stringproblems;

public class ReverseString {

	public String reverse_given_string(String givenString) {
		String resultString="";
		if(givenString==null || givenString.length()<2) {
			return givenString;
		}
		// 
		for(int index= givenString.length()-1;index>=0;index--)
		{
			resultString += givenString.charAt(index);
		}
		return resultString;
	}
	
	
     // convert it into array will take memory of n block therefor we'll covert string to array.
		
	public static void main(String[] args) {
		ReverseString object = new ReverseString();
		System.out.println(object.reverse_given_string("Good Afternoon! Dheeraj Raikwar"));
	}
}

// O(n+2)