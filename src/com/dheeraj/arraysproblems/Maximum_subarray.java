package com.dheeraj.arraysproblems;

public class Maximum_subarray {

	
	public int maximum_subarray(int[] nums) {
		if(nums.length<2) {
			return nums[0];			
		}
		
		int temp =0;
		int maximum =0;

		for(int i=0;i<nums.length;i++)		{
			temp =0;
			for(int j=i;j<nums.length;j++)
			{
				temp+=nums[j];
				if(temp>maximum) {
					maximum = temp;
				}
			}
		}
		
		
		return maximum;
	}
	
	
	
	public static void main(String[] args) {
		Maximum_subarray obj= new Maximum_subarray();
		//int[] arr = {5,4,-1,7,8};//correct and pass
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(obj.maximum_subarray(arr));
	}

}
