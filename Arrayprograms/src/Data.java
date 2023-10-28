
public class Data {
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Class Data{
//			Output: [5,6,7,1,2,3,4]
//			Explanation:
//			rotate 1 steps to the right: [7,1,2,3,4,5,6]
//			rotate 2 steps to the right: [6,7,1,2,3,4,5]
//			rotate 3 steps to the right: [5,6,7,1,2,3,4]
	int[] nums = new int[]{1,2,3,4,5,6,7};
		public static int method(int[] nums,int n) {
			int k=3;
			int first;
			for(int i=0;i<k;i++) {
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j]>=nums[i])
					{
						first=nums[j];
					}					
				}}
				for(int i=0;i<nums.length;i++) {
					System.out.println(nums[i]);
				}
			
			
			
			
			
			return n;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(0,)
	}

}
