// 38 ms | 47.1 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
                int[] arr= new int[2];
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
                sum=sum-nums[j];
            }
        }
        return arr;
    }
}