package com.dheeraj.arraysproblems;

public class Move_Zeros {
	
	public void move_zeros(int[] nums)
	{	
		int zeroInd = 0;
		for(int index = 1;index<nums.length;index++) {
			if(nums[zeroInd]!=0) {
				zeroInd++;
			}
			if(nums[index]!=0 && nums[zeroInd]==0) {
				nums[zeroInd] = nums[index];
				nums[index] = 0;
				zeroInd++;
			}
		}
		
		
	}
		
		//		if(nums.length>1 && containszero(nums)==true) {
//			int i=0,j=1;
//			while(j<nums.length)
//			{
//				if(nums[i]==0 && nums[j]!=0) {
//					nums[i]=nums[j];
//					nums[j]=0;
//					i++;
//					j++;
//				}
//				while(j<nums.length && nums[j]==0) {
//					j++;
//				}
//			}
//		}
	

	public static void main(String[] args) {
		Move_Zeros hello = new Move_Zeros();
		int arr[]= {12,0,15};
		hello.move_zeros(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
